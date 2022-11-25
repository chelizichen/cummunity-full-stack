package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    public String id; // 用户ID
    public String username; // 真实姓名
    public String password;
    public String phone; // 使用 phone 和 password 登陆
    public String email;
    public String permission;
    public String createTime;
}

