package com.demo.kafka.sevice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "kafka_topic", groupId = "demo_group")
	public void listenToTopic(String recievedMsg) {
		System.out.println("The message is recieved : "+recievedMsg);
	}
}
