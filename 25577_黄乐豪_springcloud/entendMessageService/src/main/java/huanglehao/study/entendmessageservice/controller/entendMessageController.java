package huanglehao.study.entendmessageservice.controller;

import huanglehao.study.entendmessageservice.mapper.EntendMapper;
import huanglehao.study.pojomodul.entity.Entend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 10:40 2019/7/26
 */
@RestController
@RequestMapping("/entendMessage")
public class entendMessageController {

    @Autowired
    private EntendMapper entendMapper;


    //增加一个用户
    @RequestMapping("/addEntend")
    public void addEntend(String message,int userId){
        Entend entend =new Entend();
        entend.setUserId(userId);
        entend.setMessage(message);
        entendMapper.addEntend(entend);
    };

    //删除一个用户
    @RequestMapping("/deleteById")
    public void deleteById(int id){
        entendMapper.deleteById(id);
    };

    //修改
    @RequestMapping("/updateEntend")
    public void updateEntend(int id,String message,int userId){
        Entend entend =new Entend();
        entend.setId(id);
        entend.setUserId(userId);
        entend.setMessage(message);
        entendMapper.updateEntend(entend);

    };

    @RequestMapping("/getEntendList")
    public List<Entend> getEntendList(){
        return entendMapper.selectEntendList();
    }

}
