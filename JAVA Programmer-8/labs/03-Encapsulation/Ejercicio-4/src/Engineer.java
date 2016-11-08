/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SEBAS
 */
public class Engineer extends Employee {
    
    public Engineer (int idEmpleado, String nombre, String apellido, String documento, double salario){       
        /** Se envian los parametros al constructor padre (Employee) */
        super (idEmpleado, nombre, apellido, documento, salario);
    
    }
        
    
}
