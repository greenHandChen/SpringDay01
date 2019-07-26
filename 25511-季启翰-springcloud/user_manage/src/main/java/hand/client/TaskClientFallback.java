package hand.client;

import hand.pojo.Result;
import hand.pojo.Task;
import org.springframework.stereotype.Component;

/**
 * @Auther: 几米
 * @Date: 2019/7/26 10:40
 * @Description: TaskClientFallback
 */
@Component
public class TaskClientFallback implements TaskClient{
    @Override
    public Result addTask(Task task) {
        throw new RuntimeException("调用错误");
    }

    @Override
    public Result findAll() {
        throw new RuntimeException("调用错误");
    }
}
