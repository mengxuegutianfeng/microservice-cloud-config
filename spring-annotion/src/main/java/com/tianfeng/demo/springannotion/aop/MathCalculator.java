package com.tianfeng.demo.springannotion.aop;

import org.springframework.stereotype.Component;

@Component
public class MathCalculator {

    public void div(int i,int j){
        System.out.println("div......");
    }
}
