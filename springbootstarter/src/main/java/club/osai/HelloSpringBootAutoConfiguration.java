package club.osai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: HelloSpringBootAutoConfiguration.java
 * @Version: 1.0
 * @Date: 2019/7/23
 * @Description:
 */
@Configuration

@ConditionalOnClass(HelloSpringBoot.class)
@EnableConfigurationProperties(HelloSpringBootProperties.class)
public class HelloSpringBootAutoConfiguration {

    @Autowired
    private HelloSpringBootProperties helloSpringBootProperties;

    @Bean
    // 当容器没有这个 Bean 的时候才创建这个 Bean
    @ConditionalOnMissingBean(HelloSpringBoot.class)
    public HelloSpringBoot helloSpringBoot() {
        HelloSpringBoot helloSpringBoot = new HelloSpringBoot();
        helloSpringBoot.setWords(helloSpringBootProperties.getWords());
        return helloSpringBoot;
    }
}
