package com.javaee.dao;

import com.javaee.pojo.SysUser;

/**
 * @classname javawedTest
 * @Auther d3Lap1ace
 * @Time 28/4/2024 19:19 周日
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface UserDao {
    SysUser queryByUserName(String username);
    int insertSysUser(String username,String userPwd);
}