package club.osai;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: HelloSpringBootProperties.java
 * @Version: 1.0
 * @Date: 2019/7/23
 * @Description:
 */
//@Component
@ConfigurationProperties(prefix = "hello-spring-boot")
public class HelloSpringBootProperties {
    private static final String DEFAULT_WORDS = "spring";
    private String words = DEFAULT_WORDS;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "HelloSpringBootProperties{" +
                "words='" + words + '\'' +
                '}';
    }
}
