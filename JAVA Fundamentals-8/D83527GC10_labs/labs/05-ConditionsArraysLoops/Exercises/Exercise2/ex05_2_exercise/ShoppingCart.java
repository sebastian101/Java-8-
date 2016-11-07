
package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
	String [] items = new String [4];
        
        items [0] = "Shirt";
        items [1] = "Leggins";
        items [2] = "Bracers";
        items [3] = "Shoulders";


        // Change message to show the number of items purchased.
        
	

        System.out.println(message+" "+items.length);
        // Print an element from the items array. 
	System.out.println(items[0]);
        
        
    }

}
