package Customer;

import java.util.ArrayList;

import testing.*;

public class CustomerStorageComponent {
	public ArrayList<Customer> customers;

    public CustomerStorageComponent(){
     customers = new ArrayList<Customer>();
     Customer customer1 = new Customer("John","Johnsson","15.04.1975","US","Male", "1504750101",167);
     customers.add(customer1);
     Customer customer2 = new Customer("Bella","White","06.06.2006","Canada","Female", "0606060606",345);
     customers.add(customer2);
     Customer customer3 = new Customer("Georg"," Bjarnfredarson","14.04.1959","Iceland","Male","1404590459",5112);
     customers.add(customer3);
     
     }

    
    public ArrayList<Customer> getCustomerbyDob(String Dob) {
        ArrayList<Customer> results = new ArrayList<Customer>();

        for( int i = 0; i < customers.size(); i++ ) {
            
                results.add(customers.get(i));
        }
        return results;
       
    }
    
    public ArrayList<Customer> getCustomerbyLastName(String LastName) {
        ArrayList<Customer> results = new ArrayList<Customer>();

        for( int i = 0; i < customers.size(); i++ ) {
            
                results.add(customers.get(i));
        }
        return results;
       
    }
    
    public ArrayList<Customer> getCustomerbyID(int ID) {
        ArrayList<Customer> results = new ArrayList<Customer>();

        for( int i = 0; i < customers.size(); i++ ) {
            
                results.add(customers.get(i));
        }
        return results;
       
    }
    
    public ArrayList<Customer> getCustomerbyFLIGHT_NR(int FLIGHT_NR) {
        ArrayList<Customer> results = new ArrayList<Customer>();

        for( int i = 0; i < customers.size(); i++ ) {
            
                results.add(customers.get(i));
        }
        return results;
       
    }
   
    

}