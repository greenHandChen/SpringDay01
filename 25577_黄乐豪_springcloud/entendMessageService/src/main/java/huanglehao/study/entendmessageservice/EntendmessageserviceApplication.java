package huanglehao.study.entendmessageservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages="huanglehao.study.entendmessageservice.mapper")
public class EntendmessageserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntendmessageserviceApplication.class, args);
    }

}
