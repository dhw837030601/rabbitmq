package com.dhw.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 段华微
 * @version V1.0
 * @description 描述
 * @ClassName: helloReceiver
 * @Date 2018/9/11 Copyright(c) 2015 www.wallet.com All rights
 * reserved
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver2 {
    @RabbitHandler
    public void process(String hello){
        System.out.println("Recever 2:"+hello);
    }
}
