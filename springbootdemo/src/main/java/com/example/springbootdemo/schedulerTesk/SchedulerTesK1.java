package com.example.springbootdemo.schedulerTesk;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTesK1 {

    private int count=0;
    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler tesk running"+(count++));
    }


}
