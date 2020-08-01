package com.tianfeng.springbootredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class SpringbootredisApplication {

    public static void main(String[] args) {
        HashMap<String,Object> hashMap = new HashMap<>();
        SpringApplication.run(SpringbootredisApplication.class, args);
    }

}
