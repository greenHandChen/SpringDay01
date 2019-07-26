package zbh.hand.springcloudusermore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("zbh.hand.springcloudusermore")
public class SpringcloudUserMoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudUserMoreApplication.class, args);
    }

}
