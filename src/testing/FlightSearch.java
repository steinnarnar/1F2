package testing;
/**
 * Created by Steinn Arnar on 29-Mar-17.
 */
import java.util.ArrayList;

public class FlightSearch {
	
	ArrayList<Flight> flights;

    public MockStorageComponent dbConnection = new MockStorageComponent();
   
        public ArrayList<Flight> searchByDate(String DATE) {
        	  ArrayList<Flight> flights = dbConnection.getFlightByDate(DATE);
        	  
        	  return flights;
        }

        public  ArrayList<Flight> searchByDepartureLocation(String DEPARTURE_AP) {
            ArrayList<Flight> flights = dbConnection.getFlightByDepartureLocation(DEPARTURE_AP);
            return flights;
        }

        public ArrayList<Flight> searchByArrivalLocation(String ARRIVAL_AP) {
        	  ArrayList<Flight> flights = dbConnection.getFlightByArrivalLocation(ARRIVAL_AP);
        	  
        	  return flights;
        }
        
        public  ArrayList<Flight> searchByDepartureTime(String DEPARTURE_DT) {
      	  ArrayList<Flight> flights = dbConnection.getFlightByDepartureTime(DEPARTURE_DT);
      	  
      	  return flights;
      }
        


}