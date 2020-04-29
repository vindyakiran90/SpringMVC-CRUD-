package com.tyss.springmvc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyss.springmvc.beans.Employee;
import com.tyss.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/add")
	public String getEmployeeForm() {
		return "addEmployee";
	}

	@PostMapping("/added")
	public String submitForm(Employee info, ModelMap map) {
		boolean added = service.createEmployeeInfo(info);
		if(added) {
			return "hello";
		} else {
			return "addEmployee";
		}
	}

	@GetMapping("/search")
	public String getSearchForm() {
		return "searchEmp";
	}

	@GetMapping("/searchEmployee")
	public String getSearchDetails(int id, ModelMap map) {
		Employee bean = service.getEmployeeDetail(id);
		if(bean != null) {
			map.addAttribute("bean", bean);
			return "searched";
		} else {
			return "searchEmp";
		}
	}

	@GetMapping("/employeeList")
	public String getAll() {
		return "allDetails";
	}

	@GetMapping("/allDetailsOfEmployee")
	public String getAllEmployee(ModelMap map) {
		List<Employee> list = service.getAllEmployeeInfo();
		map.addAttribute("list", list);
		if(list != null) {
			return "allDetailsOfEmployee";
		} else {
			return "No data found";
		}
	}

	@GetMapping("/delete")
	public String delete() {
		return "deleteEmp";
	}

	@GetMapping("/deleteEmp")
	public String deleteEmp(int id, ModelMap map) {
		boolean deleted = service.deleteEmployeeInfo(id);
		if(deleted) {
			map.addAttribute("hello", "Record deleted");
			return "hello";
		} else {
			return "deleteEmp";
		}
	}
	
	@GetMapping("/update")
	public String update() {
		return "updateEmp";
	}
	
	@GetMapping("/updateEmp")
	public String updateEmp(Employee info, int id, ModelMap map) {
		boolean updated = service.updateEmployeeInfo(info, id);
		if(updated) {
			map.addAttribute("hello", "Record updated");
			return "hello";
		} else {
			return "updateEmp";
		}
		
	}
}
