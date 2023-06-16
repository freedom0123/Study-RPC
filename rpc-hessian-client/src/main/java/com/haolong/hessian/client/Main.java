package com.haolong.hessian.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.haolong.hessian.api.entity.User;
import com.haolong.hessian.api.service.UserService;
import lombok.extern.slf4j.Slf4j;

import java.net.MalformedURLException;

/**
 * @project: Study-RPC
 * @description:
 * @author: haolong
 * @data: 2023/6/16 18:00
 */
@Slf4j
public class Main {
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/rpc-hessian/userServiceRPC";
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        // 创建远端 RPC 服务的代理对象
        UserService userService = (UserService) hessianProxyFactory.create(UserService.class, url);
        Boolean flag = userService.login("admin", "123456");
        log.debug("获取到的结果：{}",flag);
        userService.register(new User());
    }
}

