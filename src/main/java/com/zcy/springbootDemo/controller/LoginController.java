package com.zcy.springbootDemo.controller;

import com.zcy.springbootDemo.domain.User;
import com.zcy.springbootDemo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 491445 on 2018/6/13.
 */
@Controller
@RequestMapping("/index")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    //直接配配成/就可以默认首页了
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/validate")
    public String validate(String username, String password, ModelMap modelMap) {
        if(username==null||password==null){
            return null;
        }
        User byUserNameAndPassWord = userRepository.findByUserNameAndPassWord(username, password);
        if (byUserNameAndPassWord != null) {
            //查询到用户
            modelMap.addAttribute("username", username);
            return "successPage";
        }
        modelMap.addAttribute("info","用户名或密码错误！");
        return "login";
    }
}
