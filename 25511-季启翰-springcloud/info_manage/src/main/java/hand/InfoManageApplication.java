package hand;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: 几米
 * @Date: 2019/7/26 10:10
 * @Description: InfoManageApplication
 */
@EnableFeignClients
@SpringCloudApplication
@MapperScan("hand.mapper")
public class InfoManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfoManageApplication.class);
    }
}
