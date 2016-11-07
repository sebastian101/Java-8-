package ex12_3_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item item = new Item();
        item.display();
        // call the display method on the object, then the getColor method
	if (item instanceof Shirt){	
	System.out.println(((Shirt)item).getColor());
	}
	else{
	System.out.println( "This is not a Shirt" );
	}
    }
}
