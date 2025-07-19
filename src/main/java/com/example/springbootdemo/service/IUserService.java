package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.pojo.dto.UserDto;

/**
 * @author 32035
 * @date 2025/7/19
 */
public interface IUserService {

    /**
     * 插入用户
     *
     * @param user
     * @return
     */
    User add(UserDto user);
}
