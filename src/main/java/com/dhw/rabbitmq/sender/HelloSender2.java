package com.dhw.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 段华微
 * @version V1.0
 * @description 描述
 * @ClassName: HelloSender
 * @Date 2018/9/11 Copyright(c) 2015 www.wallet.com All rights
 * reserved
 */
@Component
public class HelloSender2 {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "hello " + System.currentTimeMillis() + "========" +i;
        //System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
