package com.hd.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import com.hd.utils.SSHConnection;

/**
 * Created by zq on 2019/7/17
 */
public class MyContextStartListener implements ApplicationListener<ContextRefreshedEvent> {


    public void startSSHConnection() {
        System.out.println("SSH Connected");
        try {
            SSHConnection sshConnection=SSHConnection.newInstance();
            sshConnection.startConnect();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getParent() == null) {
            startSSHConnection();
        }

    }
}
