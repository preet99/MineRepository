package com.employee.attendance.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.attendance.config.MessageConsumer;
import com.employee.attendance.entity.AttendanceData;
import com.employee.attendance.entity.Employee;
import com.employee.attendance.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private MessageConsumer messageConsumer;
	
	@Autowired
	private ObjectMapper objectMapper;

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestParam("employeeName") String employeeName )
	{
		
		employeeService.addEmployee(employeeName );
		AttendanceData data = messageConsumer.listen("attendance");
		System.out.println(data);
		System.out.println(data.getEmployeeId());
		System.out.println(data.getHours());
		System.out.println(data.getName());
		//messageProducer.sendMessage("my_topic", "I am all right");
		return "added employee";
	}
	
	@GetMapping("/findById")
	public Optional<Employee> findEmployee(@RequestParam long employeeId)
	{
		Optional<Employee> employee =employeeService.findEmployee(employeeId);
		return employee;
		
	}
}
