package com.dhw.rabbitmq;

import com.dhw.rabbitmq.entity.User;
import com.dhw.rabbitmq.sender.HelloSender;
import com.dhw.rabbitmq.sender.HelloSender2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RabbitmqApplication {

    @Autowired
    private HelloSender helloSender;
    @Autowired
    private HelloSender2 helloSender2;

    @RequestMapping("/test")
    public String test(){
        for (int i=0;i<10;i++){
            helloSender.send(i);
            helloSender2.send(i);
        }
        User user = new User();
        user.setName("测试");
        user.setPassword("123456");
        helloSender.send(user);
        return "";
    }


    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
    }
}
