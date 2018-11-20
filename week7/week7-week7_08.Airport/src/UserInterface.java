
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class UserInterface {
    Scanner input = new Scanner(System.in);    
    Plane plane;
    Flight flight;
    
    public UserInterface() {
        plane = new Plane();
        flight = new Flight();        
    }

    public void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String choice = input.nextLine();
            if (choice.equals("1")) {
                //add plane
                System.out.print("Give plane ID: ");
                String planeID = input.nextLine();
                System.out.print("Give plane capacity: ");
                int cap = Integer.parseInt(input.nextLine());
                plane.addPlane(planeID, cap);
            } else if (choice.equals("2")) {
                //add flight
                System.out.print("Give plane ID: ");
                String planeID = input.nextLine();
                System.out.print("Give departure airport code: ");
                String depCode = input.nextLine();
                System.out.print("Give destination airport code: ");
                String desCode = input.nextLine();
                flight.addFlight(planeID, depCode, desCode);
            } else if (choice.equals("x")) {
                break;
            } else {
                //error
            }
        }
    }

    public void flightPanel() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String choice = input.nextLine();
            if (choice.equals("1")) {
                //print planes
                plane.printPlanes();
            }
            if (choice.equals("2")) {
                //print flights
                flight.printFlights(plane);
            }
            if (choice.equals("3")) {
                //print plane info
                System.out.print("Give plane ID: ");
                String ID = input.nextLine();
                System.out.println(plane.printPlaneInfo(ID));
            }
            if (choice.equals("x")) {
                //Quit
                break;
            }
        }
    }
}


/*
public class UserInterface {
    private Scanner input;
    private String ID;
    private String capacity;
    private String flightPlane;
    private String depCode;
    private String destCode;
    private Plane newPlane;
    private Flight newFlight;
    
    public UserInterface() {
    }
    
    public void printPanel() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.println("> ");
        input = new Scanner(System.in);
        String choice = input.nextLine();
        getPanel(choice);
    }
    
    public void getPanel(String choice) {
        if (choice.equals("1")) {
            addPlane();
            printPanel();
        } else if (choice.equals("2")) {
            addFlight();
            printPanel();
        } else if (choice.equals("x")) {
            printService();
        }
    }
    
    public void addPlane() {
        System.out.print("Give plane ID: ");
        this.ID = input.nextLine();
        System.out.print("Give plane capacity: ");
        this.capacity = input.nextLine();
        Plane newPlane = new Plane(ID, capacity);
        this.newPlane = newPlane;
        newPlane.addPlane(newPlane);
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        this.flightPlane = input.nextLine();
        System.out.print("Give departure airport code: ");
        this.depCode = input.nextLine();
        System.out.print("Give destination airport code: ");
        this.destCode = input.nextLine();
        Flight newFlight = new Flight(flightPlane, depCode, destCode);
        this.newFlight = newFlight;
        newFlight.addFlight(newFlight);
    }
    
    public void printService() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.println("> ");
        String select = input.nextLine();
        getService(select);
    }
    
    public void getService(String select) {
        if (select.equals("1")) {
            printPlanes();
        } else if (select.equals("2")) {
            printFlights();
        } else if (select.equals("3")) {
            //printPlaneInfo()
        } else if (select.equals("x")) {
            //exit program
        }
    }
    
    public void printPlanes() {
        for (Plane item : newPlane.getInfo()) {
            System.out.println(item);
        }
        printService();
    }
    
    public void printFlights() {
        for (Flight item : newFlight.getInfo()) {
            System.out.println(item);
        }
        printService();        
    }
    
    public void printInfo() {
        
    }
}
*/

