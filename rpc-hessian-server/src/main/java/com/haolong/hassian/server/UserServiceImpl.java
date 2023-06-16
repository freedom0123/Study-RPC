package com.haolong.hassian.server;

import com.haolong.hessian.api.entity.User;
import com.haolong.hessian.api.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * @project: Study-RPC
 * @description:
 * @author: haolong
 * @data: 2023/6/16 20:19
 */
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public Boolean login(String username, String password) {
        log.debug("UserServiceImpl.login,参数信息为：{}，{}",username,password);
        if ("admin".equals(username) && "123456".equals(password)) {
            log.debug("登录成功");
            return true;
        }
        return false;
    }

    @Override
    public void register(User user) {
        log.debug("UserServiceImpl.register,参数为：{}",user);
        log.debug("模拟数据库层的操作");
    }
}
