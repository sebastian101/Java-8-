
package ex11_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.  
	name = args[0];	
	age = Integer.parseInt(args[1]);

	// Print an error message if fewer than 2 args are passed in.
	if(args.length != 2){
		System.out.println("Please enter at least 2 values");
	}
	else
	System.out.println("Name: " + name + " " + "Age: " + age );  
	      
        
    }
}
