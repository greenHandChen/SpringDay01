package springcloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderUser8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUser8001Application.class, args);
    }

}
