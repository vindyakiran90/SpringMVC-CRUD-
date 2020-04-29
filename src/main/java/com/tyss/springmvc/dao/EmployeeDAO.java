package com.tyss.springmvc.dao;

import java.util.List;

import com.tyss.springmvc.beans.Employee;

public interface EmployeeDAO {
	List<Employee> getAllEmployeeInfo();
	Employee getEmployeeDetail(int id);
	boolean createEmployeeInfo(Employee info);
	boolean updateEmployeeInfo(Employee info, int id);
	boolean deleteEmployeeInfo(int id);
}
