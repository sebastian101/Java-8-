
package ex08_2_exercise;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
	item1.setItemFields("Bread", 20, 125.20);
	item1.displayItem();	
        

        // Call the 4-arg setItemFields method, checking the return value.  
	if( item1.setItemFields("Bread", 20, 125.20, 'B') > 0 ){
	item1.displayItem();
	}
	else System.out.println( "Invalid Color Message" );
	
	// Test your code for both valid and invalid values
 
        
        
    }
}
