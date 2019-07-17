package com.hd.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import com.hd.utils.SSHConnection;

/**
 * Created by zq on 2019/7/17
 */
public class MyContextEndListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("SSH CLOSED");
        try {
            SSHConnection sshConnection=SSHConnection.newInstance();
            sshConnection.closeSSH();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
