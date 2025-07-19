package com.example.springbootdemo.pojo;

import jakarta.persistence.*;

/**
 * @author 32035
 * @date 2025/7/19
 */

@Table(name="tb_user")
@Entity//相当于把这个类映射成了表
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键id
    @Column(name="user_id")//修改映射的数据库表名
    private Integer userId;
    @Column(name="user_name")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;


    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
