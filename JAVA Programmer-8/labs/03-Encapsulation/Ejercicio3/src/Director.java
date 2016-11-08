/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebas
 */
public class Director extends Employee{
        private double presupuesto;
        
        public Director (int idEmpleado, String nombre, String apellido, String documento, double salario, double presupuesto){
             super (idEmpleado, nombre, apellido, documento, salario);
             this.presupuesto = presupuesto;        
        }
        
        public void setPresupuesto(double presupuesto){
            this.presupuesto = presupuesto;
        }
        
        public double getPresupuesto(){
            return presupuesto;
        }
        
        public boolean approveEnpense (double gasto){  
            
            if( gasto > getPresupuesto()) {
                return false;
            }
            return true;
        }
    
}
