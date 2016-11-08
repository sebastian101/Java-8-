/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebas
 */
public class Admin extends Employee {

    public Admin(int idEmpleado, String nombre, String apellido, String documento, double salario) {
        super(idEmpleado, nombre, apellido, documento, salario);
    }

    public void setName(int idEmpleado, String nombre) {   
        if (getIdEmpleado() == idEmpleado){
            setNombre(nombre);
            System.out.println("Se asigno el nombre " + getNombre());
        }
        else System.out.println("No se asigno el nombre " + getNombre());
    }
        
    
    public void raiseSalary (int idEmpleado, double salario){
        if (getIdEmpleado() == idEmpleado){
            setSalario(salario);
            System.out.println ("Se incremento el salario del empleado con id: " + idEmpleado + "\nValor: " + salario);
        } 
        System.out.println ("No se pudo incrementar el salario");
        
    }
    
}
