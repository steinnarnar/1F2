package testing;
import java.util.ArrayList;

/**
 * Created by Steinn Arnar on 29-Mar-17.
 */

public class MockStorageComponent {
    public ArrayList<Flight> flights;

    public MockStorageComponent(){
     flights = new ArrayList<Flight>();
     Flight flight1 = new Flight("15.04.2017","RKV","AEY","1600","1645", 166,"Sat",35, true);
     flights.add(flight1);
     Flight flight2 = new Flight("15.04.2017","AEY","RKV", "2130", "2105", 167,"Sat",23, false);
     flights.add(flight2);
     Flight flight3 = new Flight("16.04.2017","RKV","IFJ", "0810", "0850", 16,"Sun",4, false);
     flights.add(flight3);
     Flight flight4 = new Flight("16.04.2017","IFJ","RKV", "0915", "0955", 17,"Sun",32, false);
     flights.add(flight4);
     Flight flight5 = new Flight("17.04.2017","RKV","EGS", "1320", "1420", 345,"Mon",74,  true);
     flights.add(flight5);
     Flight flight6 = new Flight("17.04.2017","EGS","RKV", "1500", "1600", 346,"Mon",34, false);
     flights.add(flight6);
     Flight flight7 = new Flight("18.04.2017","AEY","KEF", "04:30", "05:15", 5112,"Tue",47, true);
     flights.add(flight7);
     Flight flight8 = new Flight("18.04.2017","KEF","AEY", "05:45", "06:30", 5113,"Tue",25, true);
     flights.add(flight8);
     }

    public ArrayList<Flight> getFlightByDate(String DATE) {
        ArrayList<Flight> results = new ArrayList<Flight>();

        for( int i = 0; i < flights.size(); i++ ) {
            if(DATE.equals(flights.get(i).getDATE())) {
                results.add(flights.get(i));
            }
        }
        return results;
       
    }


    public ArrayList<Flight> getFlightByDepartureLocation(String DEPARTURE_AP) {
        ArrayList<Flight> results = new ArrayList<Flight>();

        for( int i = 0; i < flights.size(); i++ ) {
            if(DEPARTURE_AP.equals(flights.get(i).getDEPARTURE_AP())) {
                results.add(flights.get(i));
            }
        }
        return results;
    }

    public ArrayList<Flight> getFlightByArrivalLocation(String ARRIVAL_AP) {
        ArrayList<Flight> results = new ArrayList<Flight>();

        for( int i = 0; i < flights.size(); i++ ) {
            if(ARRIVAL_AP.equals(flights.get(i).getARRIVAL_AP())) {
                results.add(flights.get(i));
            }
        }
        return results;
    }

    public ArrayList<Flight> getFlightByDepartureTime(String DEPARTURE_DT) {
        ArrayList<Flight> results = new ArrayList<Flight>();
        for( int i = 0; i < flights.size(); i++ ) {
            if(DEPARTURE_DT.equals(flights.get(i).getDEPARTURE_DT())) {
            	   results.add(flights.get(i));
            }
        }
        return results;
    } 
    
    
   
}


