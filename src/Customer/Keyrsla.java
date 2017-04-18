package Customer;
import testing.*;

import java.util.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
public class Keyrsla {
	Connection conn=null;
	public ArrayList<Customer> customers;
	
	public static void main(String [] args){
		
		System.out.println("Insert 1 to search by departure location or 2 to search by date  DD.MM.YYYY");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i){
	    case 1:
	    	Keyrsla a = new Keyrsla();
			a.searchFlightLocation();
	        break;
	    case 2: 
			Keyrsla b = new Keyrsla();
			b.searchFlightDate();
	        break;
		}
		
		System.out.println("Do you want to book a flight?  1=Yes, 2 = No");
		Scanner sd = new Scanner(System.in);
		int j = sd.nextInt();
		switch (j){
	    case 1:
	    	Keyrsla c = new Keyrsla();
			c.CustomerStorageComponent();
	        break;
	    case 2: 
			System.out.println("Thank you and have a nice day!");
	        break;
		}
	}

	public static Connection dbconnector(){
		try{
			Connection conn = DriverManager.getConnection("jdbc:sqlite:./data.sqlite");
			return conn;
		}
		catch(SQLException g){
			JOptionPane.showMessageDialog(null, g);
			return null;
		}
	}
	public void insert(String f2, String f3, String f4, String f5, String f6, String f7, int f1) {
        String sql = "INSERT INTO data(FirstName,LastName, Dob, Gender,Country, ID, FLIGHT_NR) VALUES(?,?,?,?,?,?,?)";
        
        try (Connection conn = Keyrsla.dbconnector();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, f2);
            pstmt.setString(2, f3);
            pstmt.setString(3, f4);
            pstmt.setString(4, f5);
            pstmt.setString(5, f6);
            pstmt.setString(6, f7);
            pstmt.setInt(7, f1);
            pstmt.executeUpdate();
        } catch (SQLException g) {
            System.out.println(g.getMessage());
        }
		
	}
	
	private void searchFlightLocation(){
		FlightSearch s = new FlightSearch();
		System.out.println("Insert Location");
		Scanner a = new Scanner(System.in);
		String location = a.nextLine();
		System.out.println(s.searchByDepartureLocation(location));
	}
	private void searchFlightDate(){
		FlightSearch t = new FlightSearch();
		System.out.println("Insert Date");
		Scanner b = new Scanner(System.in);
		String date = b.nextLine();
		System.out.println(t.searchByDate(date));
	}
	
	private void CustomerStorageComponent(){
		new CustomerStorageComponent();
		System.out.println("Flight number: ");
		Scanner e1 = new Scanner(System.in);
		int f1 = e1.nextInt();
		e1.nextLine();
		System.out.println("First name: ");
		Scanner e2 = new Scanner(System.in);
		String f2 = e2.next();
		e2.nextLine();
		System.out.println("Last name: ");
		Scanner e3 = new Scanner(System.in);
		String f3 = e3.next();
		e3.nextLine();
		System.out.println("Date of birth: ");
		Scanner e4 = new Scanner(System.in);
		String f4 = e4.next();
		e4.nextLine();
		System.out.println("Gender: ");
		Scanner e5 = new Scanner(System.in);
		String f5 = e5.next();
		e5.nextLine();
		System.out.println("Social security number: ");
		Scanner e6 = new Scanner(System.in);
		String f6 = e6.next();
		e6.nextLine();
		System.out.println("Country: ");
		Scanner e7 = new Scanner(System.in);
		String f7 = e7.next();
		e7.nextLine();
				
		
		System.out.println("Is this order correct? 1=Yes, 2=No: ");
		System.out.print("First Name:" + f2 + "\n" +
        "Last Name: "+ f3 + "\n" +
        "Date of Birth: "+ f4 + "\n" +
        "Country: " + f7 + "\n" +
        "Gender: " + f5 + "\n" +
        "ID: " + f6 + "\n" +
		"Flight number: " + f1);
		
		
		Scanner fl = new Scanner(System.in);
		int l = fl.nextInt();
		String f8 = Integer.toString(f1);
		switch (l){
	    case 1:
			List<Customer> customers = new ArrayList<Customer>();
			Customer customer1 = new Customer(f2,f3,f4,f7,f5,f6,f1);
			customers.add(customer1);
			System.out.println("Thank you and have a nice day!");
			Keyrsla app = new Keyrsla();
	        app.insert(f2,f3,f4,f7,f5,f6,f1);
	    	break;
	    case 2: 
			System.out.println("Please start over again");
	        break;
		}		
	}
}