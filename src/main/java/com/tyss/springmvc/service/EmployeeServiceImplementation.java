package com.tyss.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.springmvc.beans.Employee;
import com.tyss.springmvc.dao.EmployeeDAO;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public List<Employee> getAllEmployeeInfo() {
		return dao.getAllEmployeeInfo();
	}

	@Override
	public Employee getEmployeeDetail(int id) {
		if(id < 1) {
			return null;
		}
		return dao.getEmployeeDetail(id);
	}

	@Override
	public boolean createEmployeeInfo(Employee info) {
		if(info == null) {
			return false;
		}
		return dao.createEmployeeInfo(info);
	}

	@Override
	public boolean updateEmployeeInfo(Employee info, int id) {
		if(info == null) {
			return false;
		}
		return dao.updateEmployeeInfo(info, id);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		if(id < 1) {
			return false;
		}
		return dao.deleteEmployeeInfo(id);
	}

}
