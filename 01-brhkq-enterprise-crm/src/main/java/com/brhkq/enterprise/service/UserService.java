package com.brhkq.enterprise.service;

import com.brhkq.enterprise.common.CommonResult;
import com.brhkq.enterprise.model.User;
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

    public CommonResult queryUser(String username, String password, String ip);
}
