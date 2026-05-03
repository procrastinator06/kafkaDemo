package com.demo.kafka.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMsgToTopic(String msg) {
		kafkaTemplate.send("kafka_topic",msg);
	}
}
