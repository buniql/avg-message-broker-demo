package avg.message.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(ProducerApplication.topicExchangeName, "avg.message", "Hello World!");
	}

}
