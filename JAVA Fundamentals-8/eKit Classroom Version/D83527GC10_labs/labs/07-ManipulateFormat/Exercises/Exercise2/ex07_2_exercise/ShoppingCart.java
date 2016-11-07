
package ex07_2_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
          
	//Instantiate and initialize sb to firstName.
	sb = new StringBuilder(firstName);
	

	// Put the full name back together, using StringBuilder append method.
	sb.append(" Smith");
	//   You can just enter the String literal for the last name.
	
	//   Print the full name.
	System.out.println(sb);
        
    }
}
