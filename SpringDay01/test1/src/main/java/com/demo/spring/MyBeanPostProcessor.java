package com.demo.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o,String s) throws BeansException {

        System.out.println("初始化前" + s);

        return o;
    }
        public Object postProcessAfterInitialization(Object o,String s) throws BeansException{

            System.out.println("初始化前"+s);

            return o;

        }
    }

