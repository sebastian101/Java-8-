package ex09_2_exercise;


public class Customer {
    private String name;
    private String ssn;
   
    //Add a custom constructor
    public Customer (String pName, String pSSN){
	this.name = pName;
	this.ssn = pSSN;

    }
    
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
}
