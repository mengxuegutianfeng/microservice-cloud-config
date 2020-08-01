package com.example.ifelse.service.impl;

import com.example.ifelse.config.OrderHandlerType;
import com.example.ifelse.service.OrderHandler;
import org.springframework.stereotype.Component;


@OrderHandlerType(source = "mobile")
@Component
public class MobileOrderHandler implements OrderHandler {

    @Override
    public void handle(String order) {
        System.out.println("处理移动端订单!");
    }
}
