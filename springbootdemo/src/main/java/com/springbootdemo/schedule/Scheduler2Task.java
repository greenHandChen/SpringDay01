package com.springbootdemo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler2Task {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime(){
        System.out.println("现在时间："+DATE_FORMAT.format(new Date()));
    }
}
