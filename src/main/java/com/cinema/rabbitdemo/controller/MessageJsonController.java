package com.cinema.rabbitdemo.controller;


import com.cinema.rabbitdemo.dto.User;
import com.cinema.rabbitdemo.publisher.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {

    private final RabbitMQJsonProducer producer;

    public MessageJsonController(RabbitMQJsonProducer producer) {
        this.producer = producer;
    }

    @PostMapping("publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        producer.sendMessage(user);
        return ResponseEntity.ok("Json Message Published Successfully");
    }
}
