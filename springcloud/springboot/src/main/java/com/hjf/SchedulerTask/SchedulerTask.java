//package com.hjf.SchedulerTask;
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
///**
// * ClassName:SchedulerTask
// * Author:Hejunfeng
// * Date:2019/7/23 8:56
// */
//@Component
//public class SchedulerTask {
//    private int count = 0;
//
//    @Scheduled(cron = "*/6****?")
//    private void process(){
//        System.out.println("this is scheduler task running"+(count++));
//    }
//}