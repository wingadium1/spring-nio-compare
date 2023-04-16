package com.mk.sample.service;

import org.springframework.data.domain.Page;

import com.mk.sample.model.Employee;

public interface EmployeeService {

    Employee findEmployeeById(Long id);

    Page<Employee> getAllEmployees(Integer page, Integer size);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);

}
