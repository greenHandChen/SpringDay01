package hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "springcloudtest")
@ComponentScan("springcloudtest")
public class CumstomerUserFeign9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CumstomerUserFeign9001Application.class, args);
    }

}
