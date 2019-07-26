package hand.controller;

import com.netflix.client.http.HttpResponse;
import hand.mapper.TaskMapper;
import hand.pojo.Result;
import hand.pojo.Task;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Auther: 几米
 * @Date: 2019/7/26 10:19
 * @Description: TaskController
 */
@RestController
@CrossOrigin
public class TaskController {
    @Resource
    TaskMapper taskMapper;


    //增加
    @PostMapping("/")
    public Result addTask(@RequestBody Task task) {
        task.setId(UUID.randomUUID().timestamp());
        taskMapper.insert(task);
        return new Result(true, 200, "增加成功");
    }

    /**
     * 查询全部数据
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        return new Result(true, 200, "查询成功", taskMapper.selectAll());
    }

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable Long id) {
        return new Result(true, 200, "查询成功", taskMapper.selectByPrimaryKey(id));
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping(value="/{id}",method= RequestMethod.DELETE)
    public Result delete(@PathVariable Long id ){
        taskMapper.deleteByPrimaryKey(id);
        return new Result(true,200,"删除成功");
    }

    /**
     * 修改
     */
    @RequestMapping(value="/{id}",method= RequestMethod.PUT)
    public Result update(@RequestBody Task task, @PathVariable Long id){
        task.setId(id);
        taskMapper.updateByPrimaryKey(task);
        return new Result(true,200,"修改成功");
    }
}
