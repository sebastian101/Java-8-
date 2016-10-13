package ex11_1_exercise;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// import statements here:
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
<<<<<<< HEAD
	LocalDate orderDate;
	
        
	// Initialize the orderDate to the current date and time. Print it.
	orderDate = LocalDate.now();
	System.out.println("The order Date is: " + orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
	orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
	System.out.println("This is the order date with format ISO: "+orderDate);

		
=======
	LocalDateTime orderDate;
 
	// Initialize the orderDate to the current date and time. Print it.
	orderDate = LocalDateTime.now();
        System.out.println("Date of order: " + orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
	orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
>>>>>>> origin/master

    }
}