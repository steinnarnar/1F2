package testing;
/**
 * Created by Steinn Arnar on 29-Mar-17.
 */
public class Flight {

    private String DATE;
    private String DEPARTURE_AP;
    private String ARRIVAL_AP;
    private String DEPARTURE_DT;
    private String ARRIVAL_DT;
    private int FLIGHT_NR;
    private String DEPARTURE_WD;
    private int PASSENGERS;
    private boolean XTRA_LUGGAGE;

    public Flight(String DATE, String DEPARTURE_AP, String ARRIVAL_AP, String DEPARTURE_DT, String ARRIVAL_DT, int FLIGHT_NR, String DEPARTURE_WD, int PASSENGERS, boolean XTRA_LUGGAGE){
                this.DATE = DATE;
                this.DEPARTURE_AP = DEPARTURE_AP;
                this.ARRIVAL_AP = ARRIVAL_AP;
                this.DEPARTURE_DT = DEPARTURE_DT;
                this.ARRIVAL_DT = ARRIVAL_DT;
                this.FLIGHT_NR = FLIGHT_NR;
                this.DEPARTURE_WD = DEPARTURE_WD;
                this.PASSENGERS = PASSENGERS;
                this.XTRA_LUGGAGE = XTRA_LUGGAGE;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String  getDEPARTURE_AP(){
        return DEPARTURE_AP;
    }

    public void setDEPARTURE_AP(String DEPARTURE_AP) {
        this.DEPARTURE_AP = DEPARTURE_AP;
    }

    public String getARRIVAL_AP() {
        return ARRIVAL_AP;
    }

    public void setARRIVAL_AP(String ARRIVAL_AP) {
        this.ARRIVAL_AP = ARRIVAL_AP;
    }

    public String getDEPARTURE_DT() {
        return DEPARTURE_DT;
    }

    public void setDEPARTURE_DT(String DEPARTURE_DT) {
        this.DEPARTURE_DT = DEPARTURE_DT;
    }

    public String getARRIVAL_DT() {
        return ARRIVAL_DT;
    }

    public void setARRIVAL_DT(String ARRIVAL_DT) {
        this.ARRIVAL_DT = ARRIVAL_DT;
    }

    public int getFLIGHT_NR() {
        return FLIGHT_NR;
    }

    public void setFLIGHT_NR(int FLIGHT_NR) {
        this.FLIGHT_NR = FLIGHT_NR;
    }

    public String getDEPARTURE_WD() {
        return DEPARTURE_WD;
    }

    public void setDEPARTURE_WD(String DEPARTURE_WD) {
        this.DEPARTURE_WD = DEPARTURE_WD;
    }

    public int getPASSENGERS() {
        return PASSENGERS;
    }

    public void setPASSENGERS(int PASSENGERS) {
        this.PASSENGERS = PASSENGERS;
    }

    public Boolean getXTRA_LUGGAGE() {
        return XTRA_LUGGAGE;
    }

    public void setXTRA_LUGGAGE(Boolean XTRA_LUGGAGE) {
        this.XTRA_LUGGAGE = XTRA_LUGGAGE;
    }
    public String toString() {
        return ("Date of flight: " + this.getDATE() + "\n" +
                    "Departure Airport: "+ this.getDEPARTURE_AP() + "\n" +
                    "Arrival Airport: "+ this.getARRIVAL_AP() + "\n" +
                    "Time of departure: " + this.getDEPARTURE_DT() + "\n" +
                    "Time of arrival: " + this.getARRIVAL_DT() + "\n" +
                    "Flight number: " + this.getFLIGHT_NR() + "\n" +
                    "Weekday: " + this.getDEPARTURE_WD() +  "\n" +
                    "Number of passengers: " + this.getPASSENGERS() +  "\n" +
                    "Excess baggage allowed?: " + this.getXTRA_LUGGAGE() +  "\n" + "\n");
   }
}
