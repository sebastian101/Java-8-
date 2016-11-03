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
    
    private String nombre;
    private String apellido;
    private String documento;
    private double salario;
    
    
    public Employee (String nombre, String apellido, String documento, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento =documento;
        this.salario = salario;
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
     
}