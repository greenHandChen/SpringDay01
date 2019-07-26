package huanglehao.study.zuul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 10:17 2019/7/26
 */
@RestController
public class test {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
