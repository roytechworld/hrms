package com.pts.procureline.service;

import org.springframework.stereotype.Service;


import com.pts.procureline.model.VmsEmployeeMaster;

@Service
public interface EmployeeService {
	public int employeeData(VmsEmployeeMaster emp);
}
