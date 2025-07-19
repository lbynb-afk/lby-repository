package com.example.springbootdemo.repository;

import com.example.springbootdemo.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 32035
 * @date 2025/7/19
 */

//继承的接口实现增删改查功能
@Repository //注册为bean（数据访问层）
public interface UserRepository extends CrudRepository<User,Integer> {
}
