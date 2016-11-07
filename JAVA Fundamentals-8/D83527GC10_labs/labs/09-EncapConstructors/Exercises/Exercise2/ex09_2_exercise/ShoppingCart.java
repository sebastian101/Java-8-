package ex09_2_exercise;


public class ShoppingCart {

    public static void main(String args[]) {
        // Declare, instantiate, and initialize a Customer object
	Customer newCustomer = new Customer ("Sebastian", "Duque");
	

	// Print the customer object name
	System.out.println("Nombre: " + newCustomer.getName() + " Apellido: " + newCustomer.getSSN());	
        
    }
}
