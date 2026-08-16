package com.duduprojeto.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duduprojeto.worker.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
}
