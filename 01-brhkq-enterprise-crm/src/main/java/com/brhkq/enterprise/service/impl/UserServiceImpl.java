package com.brhkq.enterprise.service.impl;

import com.brhkq.enterprise.dao.UserMapper;
import com.brhkq.enterprise.model.User;
import com.brhkq.enterprise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

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
    public User queryUser(String username, String password) {

        User user = new User();
        //获取到一个用户
        user = UserMapper.selectUser();

        //判断如果验证通过
        if(user==null){
            return "账号密码不正确";
        }


        return  user;
    }
}
