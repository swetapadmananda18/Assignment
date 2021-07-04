package com.example.employee.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.util.Set;

@SpringBootApplication
public class EmployeesApplication {
	Set<String> data;

	{
		data = new LinkedHashSet<String>();
		HashSet<String> set = new HashSet<>();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}

}
