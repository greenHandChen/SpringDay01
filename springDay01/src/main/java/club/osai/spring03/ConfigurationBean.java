package club.osai.spring03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Chen Quan
 * GitHub: https://github.com/chenquan
 * Email: chenquan@osai.club
 * Class: ConfigurationBean.java
 * Version: 1.0
 * Date: 2019/7/16
 * Description:
 */

@Configuration
public class ConfigurationBean {

    @Bean("person1")
    public Person person() {
        return new Person();
    }

    @Bean("person2")
    public Person person(@Autowired Person person) {
        return person;
    }

}
