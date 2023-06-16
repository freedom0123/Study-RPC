package com.haolong.hessian.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @project: Study-RPC
 * @description:
 * @author: haolong
 * @data: 2023/6/16 15:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
}
