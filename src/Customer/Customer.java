
package Customer;
import testing.*;

public class Customer {

	    public String FirstName;
	    public String LastName;
	    public String Dob;
	    public String Country;
	    public String Gender;
	    private String ID;
	    private int FLIGHT_NR;
	    
	    public Customer(String FirstName, String LastName, String Dob, String Country, String Gender, String ID, int FLIGHT_NR){
	                this.FirstName = FirstName;
	                this.LastName = LastName;
	                this.Dob = Dob;
	                this.Country = Country;
	                this.Gender = Gender;
	                this.ID = ID;
	                this.FLIGHT_NR=FLIGHT_NR;

	    }

	    public String getFirstName() {
	        return FirstName;
	    }

	    public void setFirstName(String FirstName) {
	        this.FirstName = FirstName;
	    }

	    public String  getLastName(){
	        return LastName;
	    }

	    public void setLastName(String LastName) {
	        this.LastName = LastName;
	    }

	    public String getDob() {
	        return Dob;
	    }

	    public void setDob(String Dob) {
	        this.Dob = Dob;
	    }

	    public String getCountry() {
	        return Country;
	    }

	    public void setCountry(String Country) {
	        this.Country = Country;
	    }

	    public String getGender() {
	        return Gender;
	    }

	    public void setGender(String Gender) {
	        this.Gender = Gender;
	    }

	    public String getID() {
	        return ID;
	    }

	    public void setID(String ID) {
	        this.ID = ID;
	    }
	    
	    public int getFLIGHT_NR() {
	        return FLIGHT_NR;
	    }

	    public void setFLIGHT_NR(int FLIGHT_NR) {
	        this.FLIGHT_NR = FLIGHT_NR;
	    }
	    

	  
	    public String toString() {
	        return ("First Name:" + this.getFirstName() + "\n" +
	                    "Last Name: "+ this.getLastName() + "\n" +
	                    "Date of Birth: "+ this.getDob() + "\n" +
	                    "Country: " + this.getCountry() + "\n" +
	                    "Gender: " + this.getGender() + "\n" +
	                    "ID: " + this.getID() + "\n" +
	        			"Flight number: " + this.getFLIGHT_NR());
	   }
	}
