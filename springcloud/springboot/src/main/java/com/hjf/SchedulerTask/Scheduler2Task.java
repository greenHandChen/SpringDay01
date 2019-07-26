package com.hjf.SchedulerTask;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:Scheduler2Task
 * Author:Hejunfeng
 * Date:2019/7/23 9:01
 */
public class Scheduler2Task {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}