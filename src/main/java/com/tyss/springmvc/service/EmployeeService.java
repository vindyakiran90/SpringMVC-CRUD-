package com.tyss.springmvc.service;

import java.util.List;

import com.tyss.springmvc.beans.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployeeInfo();
	Employee getEmployeeDetail(int id);
	boolean createEmployeeInfo(Employee info);
	boolean updateEmployeeInfo(Employee info, int id);
	boolean deleteEmployeeInfo(int id);
}
