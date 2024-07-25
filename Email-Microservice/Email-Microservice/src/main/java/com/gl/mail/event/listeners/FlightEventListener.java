package com.gl.mail.event.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class FlightEventListener {

	private static final String TOPIC_NAME="flight-events";
	
	@KafkaListener(topics= {TOPIC_NAME})
	public void consumeMessage(String message) {
		System.out.println("FlightEventListener : " + message);
	}
}
