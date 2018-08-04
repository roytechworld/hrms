package com.pts.procureline.service;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import org.springframework.stereotype.Service;

import com.pts.procureline.model.Employee;

@Service
public interface EmployeeService {
	public int employeeData(Employee emp);
}
