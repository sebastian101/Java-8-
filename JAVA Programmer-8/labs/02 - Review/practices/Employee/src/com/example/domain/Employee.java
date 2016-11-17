/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author Sebas
 */
public class Employee {

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSSN=" + employeeSSN + ", employeeSalary=" + employeeSalary + '}';
    }
    
    public int employeeId;
    public String employeeName;
    public String employeeSSN;
    public double employeeSalary;
    
    
    public Employee() {
    
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSSN(String employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSSN() {
        return employeeSSN;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }
    
    
}
