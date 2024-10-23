package com.example.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {


    @RabbitListener(queues = "hello")
    public void receive(String message){
        System.out.println("Received: " + message);
    }

}
