/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.domain;

import java.text.NumberFormat;

/**
 *
 * @author Sebas
 */
public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
    
    
    public void raiseSalary(double increase){
        salary = increase;
    }
    
    public void printEmployee(){        
        
        System.out.println("----------------");
        System.out.println("Employee id:        " + empId);
        System.out.println("Employee Name:      " + name);
        System.out.println("Employee SSN:       " + ssn);
        System.out.println("Employee Salary:    " + NumberFormat.getCurrencyInstance().format((double)getSalary()));
        
        
    }
  
    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + '}';
    }

}
