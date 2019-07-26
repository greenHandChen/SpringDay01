package com.lx.springtest;

import com.lx.springtest.taskexecutor.AsyncTaskService;
import com.lx.springtest.taskexecutor.TaskExecutorConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i=0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }

    public static void main(String[] args) {
        AsyncTest asyncTest = new AsyncTest();
        asyncTest.test();
    }
}
