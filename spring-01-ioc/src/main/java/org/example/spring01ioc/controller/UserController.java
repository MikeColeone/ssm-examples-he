package org.example.spring01ioc.controller;

import org.example.spring01ioc.bean.Person;
import org.example.spring01ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/*

找到就直接注入 找不到就报错
自动注入
按照名字
按照类型
 */
@Controller
public class UserController {

    //推荐使用构造器注入 不适用autowire 脱离了Spring一样可以适应
    @Autowired
    UserService userService;
    @Autowired
    Person hangman;

    //基于set方法注入
    @Autowired

}
