/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebas
 */
public class EmployeeStockPlan {
    
    
       public static double getGrantStock(Employee e){
           
           if (e instanceof Employee){
                return 0.01;
           }
           else if (e instanceof Manager){
                return 0.02;
           }
           else {
               return 0.03;
           }          
       
       } 
    
}
