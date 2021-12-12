package com.chaitanya.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaitanya.department.entity.Department;
import com.chaitanya.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Chaitanya Jadhav
 *
 */
@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department save(Department department) {
		log.info("Inside DepartmentService.save() ");
		return departmentRepository.save(department);
	}

	public Department findById(Long id) {
		departmentRepository.findAll();
		return departmentRepository.findByDepartmentId(id);
	}
}
