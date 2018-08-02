package com.pts.procureline.service;

import org.springframework.stereotype.Service;

import com.pts.procureline.model.Employee;

@Service
public interface EmployeeService {
	public int employeeData(Employee emp);
}
