/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise;

import com.exercise.domain.Admin;
import com.exercise.domain.Director;
import com.exercise.domain.Employee;
import com.exercise.domain.Engineer;
import com.exercise.domain.Manager;


/**
 *
 * @author Sebas
 */
public class EmployeeTest {
    
    
    public static void main(String[] args) { 
        
     Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
     eng.printEmployee();
     
     Manager mng = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
     mng.printEmployee();
     
     Admin admin = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
     admin.printEmployee();
     
     Director direc = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
     direc.printEmployee();
     direc.setName("Sebastian duque");
     direc.raiseSalary(10_000_000.00);
     direc.printEmployee();
     
     
     
     
     
     
     
     
 }    
}
