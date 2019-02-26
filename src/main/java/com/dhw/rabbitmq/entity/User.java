package com.dhw.rabbitmq.entity;

import java.io.Serializable;

/**
 * @author 段华微
 * @version V1.0
 * @description 描述
 * @ClassName: PayOrderStatusEnum
 * @Date 2018/9/11 Copyright(c) 2015 www.wallet.com All rights
 * reserved
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7275228872302899928L;

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("password", password)
                .toString();
    }
}
