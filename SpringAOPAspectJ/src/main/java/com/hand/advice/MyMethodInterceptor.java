package com.hand.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * 环绕通知
 */
@Component("myMethodInterceptor")
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("环绕通知--前...");
        //执行代理方法
        Object proceed = methodInvocation.proceed();
        System.out.println("方法返回值：" + proceed);
        System.out.println("环绕通知--后...");

        if (proceed instanceof Integer) {
            //可在这里修改方法返回值
            proceed = 10;
        }
        return proceed;
    }
}
