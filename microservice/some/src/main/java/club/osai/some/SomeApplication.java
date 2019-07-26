package club.osai.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: club.osai.some.SomeApplication.java
 * @Version: 1.0
 * @Date: 2019/7/25
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SomeApplication {

    @Value("my.message")
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class, args);
    }
    @RequestMapping("/getsome")
    public String getSome(){
        return message;

    }
}
