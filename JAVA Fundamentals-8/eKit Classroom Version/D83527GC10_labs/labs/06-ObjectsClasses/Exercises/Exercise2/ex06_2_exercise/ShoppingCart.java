

package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String args[]) {
        // Declare and initialize 2 Item objects
	
	Item item1 = new Item();
	Item item2 = new Item();

	item1.desc = "To wash cloth";
	item2.desc = "To repair cloth";		

	// Print both item descriptions and run code.
	System.out.println(item1.desc + " & " + item2.desc);

	// Assign one item to another and run it again.
	
	//item2 = item1;
     }
 
} 
