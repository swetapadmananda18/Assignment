package com.example.employee.employees.service;

import com.example.employee.employees.dto.EmployeeDto;
import com.example.employee.employees.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    List<Employee> getEmployees(Integer empId);


    EmployeeDto AddEmployee(EmployeeDto employee) throws Exception;


    Employee getallEmployee(Integer empId);
}
