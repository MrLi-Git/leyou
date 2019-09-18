package com.leyou.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
//// user中的属性值从配置文件中获取
@Data
@Component
@ConfigurationProperties(prefix = "user")
// 会自动读取application.yml或application.properties配置文件
public class User implements Serializable{
    private int id;
    private String userName;
    private int age;
    private List<String> girlFriends;
}
