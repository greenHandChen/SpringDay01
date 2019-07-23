package hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: 几米
 * @Date: 2019/7/23 18:28
 * @Description: HelloApplication
 */
@SpringBootApplication
@MapperScan("hand")
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class);
    }
}
