package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    public String Id; // 用户ID
    public String Username; // 真实姓名
    public String Password;
    public String Phone; // 使用 phone 和 password 登陆
    public String Email;
    public String Permission;
    public String createTime;
}

