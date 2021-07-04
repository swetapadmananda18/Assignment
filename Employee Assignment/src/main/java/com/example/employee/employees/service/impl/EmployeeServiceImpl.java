package com.example.employee.employees.service.impl;

import com.example.employee.employees.dto.EmployeeDto;
import com.example.employee.employees.entity.Employee;
import com.example.employee.employees.repository.AddressRepository;
import com.example.employee.employees.repository.EmployeeRepository;
import com.example.employee.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.*;



@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public  List<Employee> getEmployees(Integer empId){

        return employeeRepository.findAll();
    }
    public Employee getallEmployee(Integer empId)
    {
        return employeeRepository.findById();

    }

    @Override
    public EmployeeDto AddEmployee(EmployeeDto employeeDetailsRequestDto) throws Exception {
        Employee employee = new Employee();
        employee.setAddress(addressRepository.findById(employeeDetailsRequestDto.getEmployeeAddressId()).orElseThrow(()->  new Exception()));
        employee.setDob(employeeDetailsRequestDto.getDob());
        employee.setName(employeeDetailsRequestDto.getName());
        employee.setSalary(employeeDetailsRequestDto.getSalary());
        employeeRepository.save(employee);
        return employeeDetailsRequestDto;

    }


}
