package com.brhkq.enterprise.controller;

import com.brhkq.enterprise.common.CommonResult;
import com.brhkq.enterprise.common.Constants;
import com.brhkq.enterprise.model.User;
import com.brhkq.enterprise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    public @ResponseBody Object login(String username, String password,String verifyCode,HttpServletRequest request){
        CommonResult commonResult = null;
        //验证码忽略大小写
        if(!request.getSession().getAttribute("verifyCode").toString().equalsIgnoreCase(verifyCode)){
            commonResult = new CommonResult();
            commonResult.setCode(Constants.code_500);
            commonResult.setMsg("验证码错误");
            return commonResult;
        }

        String ip = request.getRemoteAddr();
        commonResult = userService.queryUser(username,password,ip);
        if(commonResult.getCode() == 200){
            request.getSession().setAttribute("user",commonResult.data);
            request.getSession().setMaxInactiveInterval(3600);
        }
        return commonResult;
    }

    @RequestMapping("/logout.do")
    public String logout(HttpSession session){
        session.invalidate(); //清空session
        return "redirect:/jsp/login.jsp";
    }


}
