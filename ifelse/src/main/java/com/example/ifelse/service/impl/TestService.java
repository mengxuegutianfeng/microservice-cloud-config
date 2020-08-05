package com.example.ifelse.service.impl;


import com.example.ifelse.config.DayDayUp;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    @DayDayUp
    public void test(){
        System.out.println("异常");
        int i = 1/0;
    }
}
