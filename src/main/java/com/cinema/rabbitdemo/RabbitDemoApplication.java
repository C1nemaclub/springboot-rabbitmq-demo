package com.cinema.rabbitdemo;

import com.cinema.rabbitdemo.config.RabbitMQConfig;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class RabbitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitDemoApplication.class, args);
		System.out.println("RabbitMQ Demo Application Started Successfully...");
		//Print rabbit configuration
		 ApplicationContext context = new AnnotationConfigApplicationContext(RabbitMQConfig.class);
		 Queue myQueue = context.getBean("queue", Queue.class);
		 System.out.println("My Queue is: " + myQueue.getName().toString());

	}

}
