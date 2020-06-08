package com.example2020.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author linpeng.tan@gmail.com
 * @Date 2020/6/6 10:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    private String gender;
    private String name;
    private int age;
    private boolean isStudent;


}
