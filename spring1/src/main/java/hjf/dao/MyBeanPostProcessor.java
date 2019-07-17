package hjf.dao;

import org.springframework.beans.BeansException;

public class MyBeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o,String s) throws BeansException {
        System.out.println("初始化前"+ s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o,String s) throws BeansException {
        System.out.println("初始化后"+ s);
        return o;
    }
}
