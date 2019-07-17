package club.osai.spring02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: MyBeanPostProcessor.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        System.out.println("Before:Object = " + o + "|| String = " + s + "  ");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("After:Object = " + o + "|| String = " + s + "  ");

        return o;
    }
}
