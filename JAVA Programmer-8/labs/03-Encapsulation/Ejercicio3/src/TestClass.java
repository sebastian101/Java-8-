/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebas
 */
public class TestClass {
    
       public static void main (String[] args){
           
           Manager manager1 = new Manager(10, "Sebastian", "Duque", "1016066857", 20.000, "Integracion");           
           manager1.addEmployee(1, "Camilo", "Duque", "9016066857", 5000000, "Service Desk");         
           
                  
           Admin admin1 = new Admin(2, "Sebastian", "Duque", "1016066857", 20.000);
           admin1.setName(10, "sebastian");
            
           Director director1 = new Director(10, "Sebastian", "Duque", "1016066857", 20.000, 5000000);
          
           if (director1.approveEnpense(5000000) == true ) {
               System.out.println ("Se aprueba el gasto");
           }
           else System.out.println ("No se aprueba el gasto");      
           
           
       }
    
}
