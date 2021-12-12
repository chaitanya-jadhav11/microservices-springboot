package com.chaitanya.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaitanya.department.entity.Department;
import com.chaitanya.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department save(@RequestBody Department department) {
		log.info("Inside DepartmentController.save() ");
		return departmentService.save(department);
	}

	@GetMapping("/{id}")
	public Department get(@PathVariable("id") Long id) {
		log.info("Inside DepartmentController.get() ");
		return departmentService.findById(id);
	}

}
