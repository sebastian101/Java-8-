/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author Sebas
 */


import com.example.domain.Employee;

public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSsn("012-34-5678");
        emp.setSalary(120_345.27);
        
        
        
        
    }
    
}
