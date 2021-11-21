package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * com.atguigu.boot
 *
 * @author xzwnp
 * 2021/11/20
 * 21:57
 * @Description ：主程序
 * Steps：
 */

/**
 * 主程序类
 * @SpringBootApplication 告诉springboot这是一个springboot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
