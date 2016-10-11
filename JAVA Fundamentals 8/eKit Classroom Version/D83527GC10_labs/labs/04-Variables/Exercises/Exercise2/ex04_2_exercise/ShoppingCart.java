
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
	
        // Declare and initialize numeric fields: price, tax, quantity, and total.
	double price = 30.0;
	double tax = 1.6; 
        int quantity = 4;
	double total;
           
        
        // Modify message to include quantity 
        
        String message = custName + " wants to purchase " +quantity+" "+itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        total = price * quantity * tax;
	System.out.println("Total cost with tax is: "+total);
        
    }    
}
