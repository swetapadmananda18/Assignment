package com.example.employee.employees.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "dob")
    private String dob;
    @Column(name = "salary")
    private int salary;
    @OneToOne
    @JoinColumn(name = "employee_address", referencedColumnName = "id")
    private Address address;

}
