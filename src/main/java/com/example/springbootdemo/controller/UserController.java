package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.pojo.dto.ResponseMessage;
import com.example.springbootdemo.pojo.dto.UserDto;
import com.example.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author 32035
 * @date 2025/7/19
 */
@RestController//接口方法返回对象转换成json文本
@RequestMapping("/user")//localhost:8080/user/***
public class UserController {

    @Autowired//把对象自动装配进来
     IUserService userService;

    //REST
    //增加
    @PostMapping    //localhost:8080/user   method:post
    public ResponseMessage add(@Validated @RequestBody UserDto user){
        User userNew = userService.add(user);
        return ResponseMessage.success(userNew);

    }

    //查询
    @GetMapping("/{userId}")
    public ResponseMessage get(@PathVariable Integer userId){
        User userNew = userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }

    //修改
    @PutMapping
    @GetMapping
    public ResponseMessage edit(@Validated @RequestBody UserDto user){
        User userNew = userService.edit(user);
        return ResponseMessage.success(userNew);
    }

    //删除
    @DeleteMapping("/{userId}")
    public ResponseMessage delete(@PathVariable Integer userId){
         userService.delete(userId);
        return ResponseMessage.success();
    }
}
