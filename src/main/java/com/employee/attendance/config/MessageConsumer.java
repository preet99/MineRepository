package com.employee.attendance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.employee.attendance.entity.AttendanceData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MessageConsumer {
	
	@Autowired
	private ObjectMapper objectMapper;

    @KafkaListener(topics = "baeldung", groupId = "my-group-id")
    public AttendanceData listen(String message) {
    	System.out.println("message is "+message);
    	AttendanceData myObject = null;
        try {
            myObject = objectMapper.readValue(message, AttendanceData.class);
            // Now you can use myObject
        } catch (JsonProcessingException e) {
            // handle exception
        }
        return myObject;
    }

}