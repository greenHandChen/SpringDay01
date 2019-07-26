package huanglehao.study.usermanagerservice.controller;

import huanglehao.study.pojomodul.entity.Entend;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:33 2019/7/26
 */
@FeignClient(value = "entendManagerService",path = "entendMessage")
public interface EntendClient {
    //增加一个用户
    @RequestMapping("/addEntend")
    public void addEntend(@RequestParam String message, @RequestParam int userId);

    //删除一个用户
    @RequestMapping("/deleteById")
    public void deleteById(@RequestParam int id);

    //修改
    @RequestMapping("/updateEntend")
    public void updateEntend(@RequestParam int id,@RequestParam String message,@RequestParam int userId);

    @RequestMapping("/getEntendList")
    public List<Entend> getEntendList();
}
