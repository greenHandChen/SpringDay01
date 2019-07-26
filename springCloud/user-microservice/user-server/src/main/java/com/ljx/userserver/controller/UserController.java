package com.ljx.userserver.controller;

import com.ljx.extensionclient.UserClient;
import com.ljx.userserver.converter.UserForm2UserConverter;
import com.ljx.userserver.domain.User;
import com.ljx.userserver.form.UserForm;
import com.ljx.userserver.service.UserService;
import com.ljx.userserver.util.ResultVOUtil;
import com.ljx.userserver.vo.ResultVO;
import com.ljx.userserver.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 9:52
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private UserClient userClient;


    @GetMapping("/getUserBy/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @PostMapping("/getUserByIds")
    public ResultVO findUserByIds(@RequestBody Integer[] ids) {

        List<Integer> integerList = Arrays.asList(ids);
        List<User> userList = userService.findByIds(integerList);
        //TODO
        return ResultVOUtil.success(userList);
    }

    /**
     *功能描述
     * @author LJX
     * @date 2019/7/26  19:43
     * @param form
     * @param bindingResult
     * @return com.ljx.userserver.vo.ResultVO
     */
    @PostMapping("/save")
    public ResultVO saveUser(@Valid @RequestBody UserForm form,
                                 BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return ResultVOUtil.error(201,bindingResult.getFieldError().getDefaultMessage());
        }
        //User user = new User();
        //BeanUtils.copyProperties(user, form);
        User user = UserForm2UserConverter.convert(form);
        userService.addUser(user);
        return ResultVOUtil.success("","添加成功");
    }

    /**
     *功能描述
     * @author LJX
     * @date 2019/7/26  19:43
     * @param form
     * @param bindingResult
     * @return com.ljx.userserver.vo.ResultVO
     */
    @PostMapping("/update")
    public ResultVO updateUser(@Valid @RequestBody UserForm form,
                               BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return ResultVOUtil.error(201,bindingResult.getFieldError().getDefaultMessage());
        }
        User user = UserForm2UserConverter.convert(form);
        userService.updateUserById(user);
        return ResultVOUtil.success("","修改成功");
    }

    /**
     *功能描述   调用extension-microservice
     * @author LJX
     * @date 2019/7/26  18:39
     * @param
     * @return com.ljx.userserver.vo.ResultVO
     */
    @RequestMapping("/testExtension")
    public ResultVO testExtension(){
        String str  = userClient.toUser();
        return ResultVOUtil.success(str);

    }

}
