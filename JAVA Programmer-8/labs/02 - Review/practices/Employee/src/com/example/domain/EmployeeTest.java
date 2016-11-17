package com.example.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sebas
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instance of Employee
        Employee employee1 = new Employee ();
        employee1.setEmployeeId(101);
        employee1.setEmployeeName("Jane Smith");
        employee1.setEmployeeSSN("012-34-5678");
        employee1.setEmployeeSalary(120_345.27);
        
        Employee employee2 = new Employee ();
        employee2.setEmployeeId(102);
        employee2.setEmployeeName("Sebastian Duque");
        employee2.setEmployeeSSN("012-34-58452");
        employee2.setEmployeeSalary(180_345.27);
        
        
        System.out.println(employee1 + "\n" + employee2 );
        
    }
    
}
