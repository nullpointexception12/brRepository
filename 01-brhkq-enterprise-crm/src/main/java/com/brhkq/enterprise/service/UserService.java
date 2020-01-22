package com.brhkq.enterprise.service;

import com.brhkq.enterprise.model.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserService
 * Package:com.brhkq.enterprise.service
 * Description:<br/>
 *
 * @date:2020/1/22 0022 21:50
 */
@Service
public interface UserService {

    public User queryUser(String username, String password);
}
