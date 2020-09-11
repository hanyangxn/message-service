package com.jd.listener;

import com.jd.common.dto.NotifyMessageDto;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author hy
 * @description:
 * @date 2020/09/11
 */

@Component
@RabbitListener(queues = "TestDirectQueue")
public class TopicManReceiver {

    @RabbitHandler
    public void process(NotifyMessageDto testMessage, Message message, Channel channel) throws IOException {
        System.out.println("TopicManReceiver消费者收到消息  : " + testMessage.toString());
        // 采用手动应答模式, 手动确认应答更为安全稳定
        try {
//            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
           // 是否批量true
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (IOException e) {
            e.printStackTrace();
            //true是返回队列，false 可以走死信队列
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
        }
    }
}