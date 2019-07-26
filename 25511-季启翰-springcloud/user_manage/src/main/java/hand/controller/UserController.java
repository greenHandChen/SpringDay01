package hand.controller;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import hand.client.TaskClient;
import hand.mapper.UserMapper;
import hand.pojo.Result;
import hand.pojo.User;
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
public class UserController {
    @Resource
    UserMapper userMapper;
    @Resource
    TaskClient taskClient;

    //增加
    @PostMapping("/")
    public Result addTask(@RequestBody User user) {
        user.setId(UUID.randomUUID().timestamp());
        userMapper.insert(user);
        return new Result(true, 200, "增加成功");
    }

    //通过feign查询全部task
    @GetMapping("/getTask")
    public Result getTask() {
        return new Result(true, 200, "查询成功",taskClient.findAll());
    }


    /**
     * 查询全部数据
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        return new Result(true, 200, "查询成功", userMapper.selectAll());
    }

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable Long id) {
        return new Result(true, 200, "查询成功", userMapper.selectByPrimaryKey(id));
    }

    /**
     * 删除
     *
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable Long id) {
        userMapper.deleteByPrimaryKey(id);
        return new Result(true, 200, "删除成功");
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@RequestBody User user, @PathVariable Long id) {
        user.setId(id);
        userMapper.updateByPrimaryKey(user);
        return new Result(true, 200, "修改成功");
    }
}
