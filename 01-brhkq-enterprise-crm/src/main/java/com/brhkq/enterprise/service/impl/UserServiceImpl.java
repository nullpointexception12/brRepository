package com.brhkq.enterprise.service.impl;

import com.brhkq.enterprise.common.CommonResult;
import com.brhkq.enterprise.common.Constants;
import com.brhkq.enterprise.dao.UserMapper;
import com.brhkq.enterprise.model.User;
import com.brhkq.enterprise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * ClassName:UserServiceImpl
 * Package:com.brhkq.enterprise.service.impl
 * Description:<br/>
 *
 * @date:2020/1/22 0022 21:50
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public CommonResult queryUser(String username, String password,String ip) {
        User user = userMapper.selectByUsernameAndPassword(username,password);
        CommonResult commonResult = new CommonResult();

        if(user == null){
            commonResult.setCode(Constants.code_500);
            commonResult.setMsg("用户名密码错误");
        }else if(user.getFailureTime().getTime() <= new Date().getTime()){
            commonResult.setCode(Constants.code_500);
            commonResult.setMsg("该用户已失效");
        }else if(user.getDisableIp().contains(ip)){
            commonResult.setCode(Constants.code_500);
            commonResult.setMsg("您的主机Ip被限制访问");
        }else {
            commonResult.setCode(Constants.code_200);
        }

        return commonResult;
    }
}
