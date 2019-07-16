package f_annotation.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "person")
//@PreDestory只有在当前Bean为singleton时才能生效
//@Scope用来指定Bean的作用范围
@Scope("singleton")
public class Person {
    @PostConstruct
    public void initBean(){
        System.out.println("初始化Bean");
    }

    public void service(){
        System.out.println("bean service");
    }
    @PreDestroy
    public void destoryBean(){
        System.out.println("摧毁bean");
    }
}
