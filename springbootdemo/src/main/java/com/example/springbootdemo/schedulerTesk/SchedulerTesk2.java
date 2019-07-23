package com.example.springbootdemo.schedulerTesk;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class SchedulerTesk2 {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 6000)
    private void process(){
        System.out.println("现在时间:"+dateFormat.format(new Date()));
    }
}
