package hand.stater;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 几米
 * @Date: 2019/7/23 19:42
 * @Description: HelloSpringBootAutoConfigration
 */
@Configuration
@ConditionalOnMissingBean(HelloSpringBoot.class)
@ConditionalOnWebApplication
public class HelloSpringBootAutoConfigration {
    @Bean
    public HelloSpringBoot helloSpringBoot(){
        return new HelloSpringBoot();
    }
}
