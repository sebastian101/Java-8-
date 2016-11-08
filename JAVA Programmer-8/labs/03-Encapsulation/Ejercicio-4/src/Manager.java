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
    
    
    /** Constructor clase Manager */
    public Manager(int idEmpleado,String nombre, String apellido, String documento, double salario, String nombreDepartamento){        
        super(idEmpleado, nombre, apellido, documento, salario);
        this.nombreDepartamento = nombreDepartamento;
    }
    
    public void setNombreDepartamento (String nombreDepartamento){
        this.nombreDepartamento = nombreDepartamento;
    }
    
    public String getNombreDepartamento(){
        return nombreDepartamento;
    }   
    
    public void addEmployee(int idEmpleado,String nombre, String apellido, String documento, double salario, String nombreDepartamento){
        setIdEmpledo(idEmpleado);
        setNombre(nombre);
        setApellido(apellido);
        setDocumento(documento);
        setSalario(salario); 
        setNombreDepartamento(nombreDepartamento);
        
        System.out.println("idEmpleado: " + getIdEmpleado() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nDocumento: " + getDocumento() + 
                "\nSalario: " + getSalario() + "\nDepartamento: " + getNombreDepartamento() + "\n");
    }
    
     public String toString () {
        return "Id empleado: " + getIdEmpleado() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nDocumento" + getDocumento() + "\nSalario: " + getSalario() + "\nDepartamento: " + nombreDepartamento;
    }
       
}
