package club.osai.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: SomeHystrixServcie.java
 * @Version: 1.0
 * @Date: 2019/7/25
 * @Description:
 */
@Service
public class SomeHystrixService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackSome")
    public String getSome() {
        System.out.println("---------getSome-----------");
        String forObject = restTemplate.getForObject("http://some/getsome", String.class);
        return forObject;
    }

    public String fallbackSome() {
        return "some Service 故障";
    }
}
