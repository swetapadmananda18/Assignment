package com.example.employee.employees.service.impl;

import com.example.employee.employees.dto.EmployeeDto;
import com.example.employee.employees.entity.Employee;
import com.example.employee.employees.repository.AddressRepository;
import com.example.employee.employees.repository.EmployeeRepository;
import com.example.employee.employees.service.EmployeeService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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

//    @Override
//    public Employee getEmployee(Long empId) {
//        return employeeRepository.findById(empId);
//    }

//    public EmployeeDetailsRequestDto addEmployee(EmployeeDetailsRequestDto employeeDetailsRequestDto) throws Exception {
//
//        Employee employee = new Employee();
//        employee.setEmployeeAddress(employeeAddressDao.findById(employeeDetailsRequestDto.getEmployeeAddressId()).orElseThrow(()->  new Exception()));
//        employee.setDob(employeeDetailsRequestDto.getDob());
//        employee.setName(employeeDetailsRequestDto.getName());
//        employee.setSalary(employeeDetailsRequestDto.getSalary());
//        employeeDao.save(employee);
//        return employeeDetailsRequestDto;
//    }
//    @Override
//    public EmployeeDto createNew(EmployeeDto employee) {
//        Employee e1 = new Employee();
////        e1.setAddress(employeeRepository.findById(employee.getEmployeeAddressId()));
//
//    employeeRepository.findById(employee.getEmployeeAddressId()).orElseThrow(()->new NullPointerException()).setAddress(employee.se);
//        employee.setDob(employeeDetailsRequestDto.getDob());
//        employee.setName(employeeDetailsRequestDto.getName());
//        employee.setSalary(employeeDetailsRequestDto.getSalary());
//        employeeDao.save(employee);
//        return em;
//    }


    public  List<Employee> getEmployees(){

        return employeeRepository.findAll();
    }

    @Override
    public EmployeeDto createNew(EmployeeDto employeeDetailsRequestDto) throws Exception {
        Employee employee = new Employee();
        employee.setAddress(addressRepository.findById(employeeDetailsRequestDto.getEmployeeAddressId()).orElseThrow(()->  new Exception()));
        employee.setDob(employeeDetailsRequestDto.getDob());
        employee.setName(employeeDetailsRequestDto.getName());
        employee.setSalary(employeeDetailsRequestDto.getSalary());
        employeeRepository.save(employee);
        return employeeDetailsRequestDto;

    }


}
