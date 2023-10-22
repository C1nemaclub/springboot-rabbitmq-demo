package com.cinema.rabbitdemo;

import com.cinema.rabbitdemo.config.RabbitMQConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class RabbitDemoApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext context = new AnnotationConfigApplicationContext(RabbitMQConfig.class);
		Queue myQueue = context.getBean("queue", Queue.class);

		System.out.println("My Queue is: " + myQueue.getName().toString());

	}

}
