package huanglehao.study.usermanagerservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages="huanglehao.study.usermanagerservice.mapper")
public class UsermanagerserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermanagerserviceApplication.class, args);
    }

}
