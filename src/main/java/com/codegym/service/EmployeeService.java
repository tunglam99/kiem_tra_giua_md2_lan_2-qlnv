package com.codegym.service;

import com.codegym.model.Employee;
import com.codegym.model.EmployeeForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    Employee findById(Long id);
    void save(EmployeeForm employeeForm);
    void remove(Long id);
    Employee saveFileEmployee(EmployeeForm employeeForm);
    Page<Employee> findAllByNameContaining(String firstName, Pageable pageable);
}
