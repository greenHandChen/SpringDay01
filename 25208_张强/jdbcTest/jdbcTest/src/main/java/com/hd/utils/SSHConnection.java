package com.hd.utils;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

import java.util.Properties;

/**
 * Created by zq on 2019/7/17
 */
public class SSHConnection {
    private final static String S_PATH_FILE_PRIVATE_KEY = "C:/Users/zq/.ssh/aliyun";
    private final static String S_PATH_FILE_KNOWN_HOSTS = "C:/Users/zq/.ssh/known_hosts";
    private final static String S_PASS_PHRASE = "Zq#572649208";
    private final static int LOCAl_PORT = 3307;
    private final static int REMOTE_PORT = 3306;
    private final static int SSH_REMOTE_PORT = 22;
    private final static String SSH_USER = "root";
    private final static String SSH_PASSWORD = "Zq#572649208";
    private final static String SSH_REMOTE_SERVER = "47.106.72.174";
    private final static String MYSQL_REMOTE_SERVER = "127.0.0.1";
    private volatile  static   SSHConnection sshConnection=null;
    //represents each ssh session
    private Session sesion;

    public void closeSSH (){
        sesion.disconnect();
    }
    private SSHConnection(){

    }
    public static SSHConnection newInstance(){
        if(sshConnection==null){
            synchronized (SSHConnection.class){
                if(sshConnection==null){
                    sshConnection=new SSHConnection();
                }
            }
        }
        return sshConnection;
    }
    public void startConnect () throws Throwable
    {

        JSch jsch = null;

        jsch = new JSch();
        jsch.setKnownHosts(S_PATH_FILE_KNOWN_HOSTS);
        jsch.addIdentity(S_PATH_FILE_PRIVATE_KEY);

        sesion = jsch.getSession(SSH_USER, SSH_REMOTE_SERVER, SSH_REMOTE_PORT);
        UserInfo ui = new MyUserInfo(S_PASS_PHRASE);
        sesion.setUserInfo(ui);
        //sesion.setPassword(SSH_PASSWORD);

        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        sesion.setConfig(config);
        //ssh connection established!
        sesion.connect(1500);

        //by security policy, you must connect through a fowarded port
        sesion.setPortForwardingL(LOCAl_PORT, MYSQL_REMOTE_SERVER, REMOTE_PORT);

    }
    public static class MyUserInfo implements UserInfo {
        private String passphrase = null;

        public MyUserInfo(String passphrase) {
            this.passphrase = passphrase;
        }

        @Override
        public String getPassphrase() {
            return passphrase;
        }
        @Override
        public String getPassword() {
            return null;
        }
        @Override
        public boolean promptPassphrase(String s) {
            return true;
        }
        @Override
        public boolean promptPassword(String s) {
            return true;
        }
        @Override
        public boolean promptYesNo(String s) {
            return true;
        }
        @Override
        public void showMessage(String s) {
            System.out.println(s);
        }
    }
}

