package com.example.employee.employees.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employeeAddress")
public class Address {
    @Id
    private Long id;
    private String address;

}
