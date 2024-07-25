package com.gl.mail.event.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PassengerEventListener {

private static final String TOPIC_NAME="events";
	
	@KafkaListener(topics= {TOPIC_NAME})
	public void consumeMessage(String message) {
		System.out.println("PassengerEventListener : " + message);
	}
}
