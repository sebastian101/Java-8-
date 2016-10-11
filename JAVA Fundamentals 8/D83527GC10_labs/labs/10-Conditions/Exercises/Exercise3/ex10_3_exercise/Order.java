
package ex10_2_exercise;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {	
	
	switch(custType) {
	
	case 'N':		
		if (total > 900){	
			discount = 10.0;	
		}
		else{ 
			discount = 5.0;
		}
		break;

	case 'P':
		if (total > 900){	
			discount = 7.0;	
		}
		else{ 
			discount = 0.0;
		}
		break;

	case 'C':
		if (total < 500){	
			discount = 8.0;	
		}
		else{ 
			discount = 5.0;
		}
		break;

	default:
		System.out.println("Enter a valid type of Customer");
		break;		
	}
	
         
    }
}
