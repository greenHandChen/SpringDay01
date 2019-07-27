package com.yhk.microservicesso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //服务发现
@EnableHystrix
@EnableFeignClients
public class MicroserviceSsoApplication {

//    @Bean
//    @LoadBalanced  //负载均衡
//    public RestTemplate restTemplate(){
//        return new RestTemplate(new HttpComponentsClientHttpRequestFactory());
//    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSsoApplication.class, args);
    }

}
