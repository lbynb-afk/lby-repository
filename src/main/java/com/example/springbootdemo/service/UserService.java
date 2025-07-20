package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.pojo.dto.UserDto;
import com.example.springbootdemo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 32035
 * @date 2025/7/19
 */

@Service   //spring的bean，从ico容器里创建对象
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;

    //实现类，实现接口对应的方法
    @Override
    public User add(UserDto user) {

        User userPojo = new User();

        BeanUtils.copyProperties(user,userPojo);
        //调用数据访问层的方法
        return userRepository.save(userPojo);//参数必须是user类型

    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow(()->{
            try {
                throw new IllegalAccessException("用户不存在，参数异常！");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public User edit(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);
        //调用数据访问层的方法
        return userRepository.save(userPojo);//参数必须是user类型

    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }
}
