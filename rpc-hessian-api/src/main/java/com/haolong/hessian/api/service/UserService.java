package com.haolong.hessian.api.service;

import com.haolong.hessian.api.entity.User;

/**
 * @project: Study-RPC
 * @description:
 * @author: haolong
 * @data: 2023/6/16 17:36
 */
public interface UserService {
    /**
     * 模拟用户登录方法
     * @param username 用户名
     * @param password 密码
     * @return 是否登录成功
     */
    public Boolean login(String username,String password);

    /**
     * 模拟用户注册方法
     * @param user 注册对象
     */
    public void register(User user);
}
