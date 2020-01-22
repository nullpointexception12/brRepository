package com.brhkq.enterprise.controller;

import com.brhkq.enterprise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * ClassName:UserController
 * Package:com.brhkq.enterprise.controller
 * Description:<br/>
 *
 * @date:2020/1/22 0022 22:13
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public String login(String username, String password, String qrCode, HttpSession session){

        Object qrCode1 = session.getAttribute("qrCode");
        if(!qrCode.equals(qrCode1.toString())){
            return "您输入的验证码不正确";
        }

        userService.queryUser(username,password);

        return "index.html";
    }

}
