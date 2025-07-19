package com.example.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

/**
 * @author 32035
 * @date 2025/7/19
 */

//继承的接口实现增删改查功能
public interface UserRepository extends CrudRepository<User,Integer> {
}
