package com.spdock.listener;

import com.spdock.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "rabbit.queue.name")
    public void handleNotification(Notification notification) {
        System.out.println(notification.toString());
    }
}
