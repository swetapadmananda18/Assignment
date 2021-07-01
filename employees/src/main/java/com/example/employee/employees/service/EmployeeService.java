package com.example.employee.employees.service;

import com.example.employee.employees.dto.EmployeeDto;
import com.example.employee.employees.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    List<Employee> getEmployees();


    EmployeeDto createNew(EmployeeDto employee) throws Exception;


}
