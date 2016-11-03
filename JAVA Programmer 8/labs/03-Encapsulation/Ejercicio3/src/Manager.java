/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SEBAS
 */
public class Manager extends Employee {
    
    private String nombreDepartamento;
    
    public Manager(String nombre, String apellido, String documento, double salario){
        super(nombre, apellido, documento, salario);
    }
    
    public void setNombreDepartamento (String nombreDepartamento){
        this.nombreDepartamento = nombreDepartamento;
    }
    
    public String getNombreDepartamento(){
        return nombreDepartamento;
    }
    
    
    
    
    
}
