package SpringStudy.Scope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Description: 全局Bean生命周期配置
 * @Author: TanLinQuan
 * @Date: 2019/7/16 14:40
 * @Version: V1.0
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("初始化前"+s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("初始化后"+s);
        return o;
    }
}
