package com.hand.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component("myMethodAdvice")
public class MyMethodAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

    /**
     * 前置通知方法
     * @param method 方法体
     * @param objects 参数
     * @param o 被代理的目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行前置通知....");
        System.out.println(o.getClass().getName());
        System.out.println("--------------------------------------");
    }

    /**
     *
     * @param o 方法返回的参数，不可在这里被修改
     * @param method 方法
     * @param objects 参数
     * @param o1 被代理的对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行前后通知....");
        System.out.println("方法的返回值：" + o);
        System.out.println("--------------------------------------");
    }
}
