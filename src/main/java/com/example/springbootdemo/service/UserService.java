package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.dto.UserDto;
import org.springframework.stereotype.Service;

/**
 * @author 32035
 * @date 2025/7/19
 */

@Service   //spring的bean，从ico容器里创建对象
public class UserService implements IUserService{

    //实现类，实现接口对应的方法
    @Override
    public void add(UserDto user) {
        //调用数据访问量的方法

    }
}
