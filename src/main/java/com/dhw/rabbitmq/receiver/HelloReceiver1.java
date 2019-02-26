package com.dhw.rabbitmq.receiver;

import com.dhw.rabbitmq.entity.User;
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
@RabbitListener(queues = "object")
public class HelloReceiver1 {
    @RabbitHandler
    public void process(String hello){
        System.out.println("Recever 1:"+hello);
    }
    @RabbitHandler
    public void receiveObj(User user){
        System.out.println("Recever obj:"+ user);
    }
}
