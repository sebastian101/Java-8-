
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	double price = 0.0;
	double tax = 0.0;
	int quantity = 0;
	
	double total;   

	String message = custName+"wants to purchase"+quantity+itemDesc;
        
	
	
        
        
        // Modify message to include quantity 
        
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        
	total = price * quantity * tax;

	System.out.println("Total cost with tax is:"+total);
        
    }    
}
