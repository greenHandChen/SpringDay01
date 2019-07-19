package com.hand.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* *..UserService.service01())")
    public void beforeService(){
        System.out.printf("前置增强...");
    }

    @AfterReturning(value = "execution(* *..UserService.service02())",returning = "result")
    public void afterReturning(Object result){

    }
}
