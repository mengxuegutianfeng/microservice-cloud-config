package com.tianfeng.demo.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
@RabbitListener(queues = "topic.woman")//监听的队列名称 TestDirectQueue
public class RabbitmqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerApplication.class, args);
    }

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }


}
