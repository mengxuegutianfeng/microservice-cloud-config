package com.example.ifelse.Controller;


import com.example.ifelse.config.DayDayUp;
import com.example.ifelse.config.OrderHandlerType;
import com.example.ifelse.service.OrderHandler;
import com.example.ifelse.service.impl.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class OrderController {

    private Map<String, OrderHandler> orderHandleMap;

    @Autowired
    private TestService testService;

    @Autowired
    public void setOrderHandlerMap(List<OrderHandler> orderHandlers) {
        orderHandleMap = orderHandlers.stream().collect(
                Collectors.toMap(orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), OrderHandlerType.class).source(),
                        v -> v, (v1, v2) -> v1));
    }

    @GetMapping("/test/{source}")
    @ResponseBody
    public void orderService(@PathVariable("source") String source) {
        OrderHandler orderHandler = orderHandleMap.get(source);
        orderHandler.handle(source);
    }


    @GetMapping("/test")
    public void orderService() {
       try{
           testService.test();
       }catch(Exception e){
           System.out.println("出异常了啊!");
           e.printStackTrace();
       }
    }
}
