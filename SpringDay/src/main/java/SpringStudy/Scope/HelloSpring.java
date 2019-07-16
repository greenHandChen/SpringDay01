package SpringStudy.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description: Spring容器中Bean的生命周期
 * @Author: TanLinQuan
 * @Date: 2019/7/16 14:34
 * @Version: V1.0
 **/
@Component
@Scope("singleton")
public class HelloSpring {

    private String info = "Bean生命周期";

    /**
    * @Description: Spring中Bean初始化方法
    * @Author: TanLinQuan
    * @Date: 2019/7/16 14:36
    * @params: []
    * @return: void
    **/
    @PostConstruct
    public void initBean() {
        System.out.println("数据库连接配置完成");
    }

    /**
    * @Description: Spring中Bean销毁
    * @Author: TanLinQuan
    * @Date: 2019/7/16 14:38
    * @params: []
    * @return: void
    **/
    @PreDestroy
    public void destoryBean() {
        System.out.println("当前数据库连接已被关闭");
    }
}
