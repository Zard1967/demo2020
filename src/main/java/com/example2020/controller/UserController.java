package com.example2020.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author linpeng.tan@gmail.com
 * @Date 2020/6/6 9:37
 */
@RestController
public class UserController {
    @GetMapping("/hi")
    public User hi() {


        User user = new User();
        user.setAge(26);
        user.setName("jack");
        user.setStudent(true);
        user.setGender("man");
        return user;
    }
}
