
package ex11_3_exercise;

public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60), 
                    new Item("WristBand",0), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    // Use a standard for loop to iterate through the items array, adding up the total price
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
<<<<<<< HEAD
	double total = 0;
	for ( int i = 0; i < 3; i++){
		if (items[i].isBackOrdered())
		  continue;
	total += items[i].getPrice();	
	}
        System.out.println("The order is: " + total);	
=======
	for (int i=1; items < 3;  i++){
		if(){
			
		}

	}
    
        
>>>>>>> origin/master
    }
}
