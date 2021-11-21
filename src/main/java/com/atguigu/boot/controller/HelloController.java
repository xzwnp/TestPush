package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.atguigu.boot.controller
 *
 * @author xzwnp
 * 2021/11/20
 * 22:02
 * @Description ：
 * Steps：
 */
//相当于同时写了@RequestBody @Controller。@RequestBody表示返回值作为请求的body
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "hello springboot!";
    }
}
