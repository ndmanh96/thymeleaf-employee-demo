package com.manhcode.springboot.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manhcode.springboot.thymeleaf.entity.Employee;
import com.manhcode.springboot.thymeleaf.service.EmployeeService;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	//inject service
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public List<Employee> showEmployee() {
		//get list form service
		List<Employee> list = employeeService.getEmployees();
		System.out.println(list);
		return list;
	}
}
