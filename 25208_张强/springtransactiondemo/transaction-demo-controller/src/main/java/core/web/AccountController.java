package core.web;

import core.service.AccountService;
import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by zq on 2019/7/18
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/index")
    public ModelAndView index(){
        List<Account> list = accountService.queryAllByLimit(0, 3);
        System.out.println(list);
        ModelAndView view=new ModelAndView();
        view.setViewName("index");
        view.addObject("accountList", list);
        return view;
    }
    @RequestMapping(value = "/transfer",method = {RequestMethod.GET})
    public String transfer(String inner, String outer, String money, Model model) {
        accountService.transfer(outer,inner,Double.parseDouble(money));
        model.addAttribute("message","请查看余额");
        return "index";
    }
}
