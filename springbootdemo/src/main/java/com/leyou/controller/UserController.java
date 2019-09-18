package com.leyou.controller;

import com.leyou.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//相当于@Controller和@ResponseBody
@Slf4j
@RequestMapping("/user")
public class UserController {

    /* @GetMapping(path = "/hello",name = "springBoot的初次使用")
     public String hello(){
         return "hello SpringBoot";
     }*/
    @Autowired
    private User user;

    @GetMapping("/hello")
    public String hello() {
        log.debug(user.getUserName());
        return "hello" + user.getUserName();
    }
    @GetMapping("/hello1")
    public String hello1() {
        log.debug(user.getUserName());
        return "hello" + user.getAge();
    }
}
