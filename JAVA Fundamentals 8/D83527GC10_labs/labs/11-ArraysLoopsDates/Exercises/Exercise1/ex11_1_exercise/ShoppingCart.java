package ex11_1_exercise;

// import statements here:
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
	LocalDate orderDate;
	
        
	// Initialize the orderDate to the current date and time. Print it.
	orderDate = LocalDate.now();
	System.out.println("The order Date is: " + orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
	orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
	System.out.println("This is the order date with format ISO: "+orderDate);

		

    }
}