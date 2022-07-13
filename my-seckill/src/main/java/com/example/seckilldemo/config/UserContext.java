package com.example.seckilldemo.config;

import com.example.seckilldemo.entity.TUser;

/**
 * 将用户信息存入当前线程的ThreadLocal中
 */
public class UserContext {

    private static ThreadLocal<TUser> userThreadLocal = new ThreadLocal<>();

    public static void setUser(TUser tUser) {
        userThreadLocal.set(tUser);
    }

    public static TUser getUser() {
        return userThreadLocal.get();
    }
}
