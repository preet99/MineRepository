package com.employee.attendance.service;

import org.springframework.http.ResponseEntity;

import com.employee.attendance.entity.SwipeDetail;

public interface SwipeDetailService {

	ResponseEntity<SwipeDetail> addSwipeInDetails(long employeeId);
	
	ResponseEntity<SwipeDetail> addSwipeOutDetails(long employeeId);

	long getTotalHours(long employeeId);
}
