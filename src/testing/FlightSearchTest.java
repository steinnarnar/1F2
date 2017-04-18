package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test; 
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.not;
public class FlightSearchTest {	
	FlightSearch fs;
	
	private Flight flug1;
			
	
		
		@Before
		public void setUp(){
		fs = new FlightSearch();	
		flug1 = new Flight("15.04.2017","RKV","AEY","1600","1645", 166,"Sat",35, true);
		}
		
		@After
		public void tearDown(){
			fs = null;
		}

		@Test
		public void searchDepartureAirports() {
			ArrayList<Flight> flights = fs.searchByDepartureLocation("AEY");
			assertNotNull(flights);
			System.out.print(flights);
		}
		

		
		@Test
		public void searchByDepartureTime(){
			ArrayList<Flight> flights = fs.searchByDepartureTime("1743");
			assertThat(flights, not(equalTo(flug1)));
		} 
		
		
		@Test
		public void searchByDepartureLocation(){
			
			ArrayList<Flight> flights = fs.searchByDepartureLocation("IFJ");
			assertEquals(1, flights.size());

		}
		
	
		
		
		
	}