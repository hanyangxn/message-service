package com.jd.controller;

import com.jd.entity.NotifyMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hy
 * @description:
 * @date 2020/09/10
 */
@RestController
public class TestController {

    @Autowired
    MongoTemplate mongoTemplate;  //使用RabbitTemplate,这提供了接收/发送等等方法

    @GetMapping("/test")
    public String test() {
        NotifyMessage notifyMessage =new NotifyMessage();
        notifyMessage.setBusiId("123");
        notifyMessage.setContent("test");
        mongoTemplate.save(notifyMessage);
        return "ok";
    }
}
