package club.osai.security.controller;

import club.osai.security.po.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: HomeController.java
 * @Version: 1.0
 * @Date: 2019/7/24
 * @Description:
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外消息，只有管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }
}
