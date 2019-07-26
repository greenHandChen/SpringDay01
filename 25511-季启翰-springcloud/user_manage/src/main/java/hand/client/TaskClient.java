package hand.client;

import hand.pojo.Result;
import hand.pojo.Task;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: 几米
 * @Date: 2019/7/26 10:39
 * @Description: TaskClient
 */
@FeignClient(value = "hand-info",fallback = TaskClientFallback.class)
public interface TaskClient {
    //增加
    @PostMapping("/")
    public Result addTask(@RequestBody Task task);

    /**
     * 查询全部数据
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll();
}
