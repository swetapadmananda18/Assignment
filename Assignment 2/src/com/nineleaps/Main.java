package com.nineleaps;

import com.nineleaps.impl.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
        // write your code
            List<Employee> employeeList= new ArrayList<Employee>();
            Scanner sc=new Scanner(System.in);
            for (int i=0;i<=9;i++){
                System.out.println("enter the element at "+i);
                String name= sc.nextLine();
             employeeList.add(new Employee(Integer.toString(i),name));
                System.out.println("employee with id "+i+" is"+ employeeList.get(i));
            }

                    System.out.println("do u want to add an employee?? press y or n");
            if(sc.next().equals("y")){

                System.out.println("Enter the new employee details");
            String name= sc.next();
            String id= sc.next();

                        Employee newEmployee = new Employee(id, name);
                        employeeList.add(newEmployee);
                System.out.println("the new number of employee is "+employeeList.size());

        }
    }
}
