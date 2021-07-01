package com.example.employee.employees.repository;

import com.example.employee.employees.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
