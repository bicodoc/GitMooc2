
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author albertdavis
 */
public class Flight {
    private HashMap<String, String> flights;
    
    public Flight() {
        flights = new HashMap<String, String>();
    }

    public void addFlight(String flightID, String origin, String destination) {
       String path = "(" + origin + "-" + destination + ")";
       flights.put(path, flightID);   
    }

    public void printFlights(Plane plane) {
            for (String item : flights.keySet()) {
                System.out.println(plane.printPlaneInfo(flights.get(item)) + " " +item);
            }
        }
    }

/*
public class Flight {
    private String ID;
    private String depCode;
    private String destCode;
    private List<Flight> flights;
    
    public Flight(String ID, String depCode, String destCode) {
        this.ID = ID;
        this.depCode = depCode;
        this.destCode = destCode;
        flights = new ArrayList();
    }
    
    public void addFlight(Flight newFlight) {
        if (!(flights.contains(newFlight))) {
            flights.add(newFlight);
        }
    }
    
    public List<Flight> getInfo() {
        return flights;
    }
    
    @Override
    public String toString() {
        return "";        
    }    
}

*/