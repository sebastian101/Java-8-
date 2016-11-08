/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SEBAS
 */
public class Employee {        
    
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String documento;
    private double salario;
    
    
    public Employee (int idEmpleado, String nombre, String apellido, String documento, double salario){
        this.idEmpleado = idEmpleado;                
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento =documento;
        this.salario = salario;
    }
    
    public void setIdEmpledo(int idEmpleado){
        this.idEmpleado = idEmpleado;
    }
    
    public int getIdEmpleado(){
        return idEmpleado;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;    
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
        
    public String getApellido (){
        return apellido;
    }
    
    public void setDocumento (String documento){
        this.documento = documento;
    }
    
    public String getDocumento (){
        return documento;
    }
    
    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public double getSalario (){
        return salario;
    }
    
    
    //* Sobrescritura del metodo toString() */
    public String toString () {
        return "Id empleado: " + idEmpleado +"\nNombre: " + nombre +"\nApellido: " + apellido + "\nDocumento" + documento + "\nSalario: " + salario;
    }
     
}