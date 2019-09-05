package Airport2;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author jaredmcgowan
 * 
**/

public class AirportUi { 
    
    private HashMap<String, Flight> flights;
    private HashMap<String, AirplaneAirport> planes;
    private Scanner reader;
   
    
    
    public AirportUi(Scanner reader) {
        this.reader = reader;
        this.flights = new HashMap<String, Flight>();
        this.planes = new HashMap<String, AirplaneAirport>();
        
    }

    public void airportService() {
        System.out.println("Airport panel: \n" 
                   + "__________________");

        while (true) {  
        System.out.println("Choose operation: \n"
                   + "[1] Add airplane\n"
                   + "[2] Add flight\n"
                   + "[x] Exit\n"
                   + "> ");
            String command = reader.nextLine();

            if (command.equals("x")) {
                System.out.println("SEEYUH!");
                break;
            } else if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addFlight();
            }
        }
    }
   
     public void addPlane() {  //adds new trans to dicitonary
        System.out.println("Give plane ID: ");
        String planeId = reader.nextLine();
        System.out.println("Give plane capacity: ");
        int planeCap = Integer.parseInt(reader.nextLine());
        
        AirplaneAirport airplane = new AirplaneAirport(planeId, planeCap);
        
        planes.put(planeId, airplane);

    }
    
     public void addFlight() {   
        System.out.println("Give plane ID: ");
        String planeID = reader.nextLine();
        AirplaneAirport airp = planes.get(planeID);
        System.out.println("Give plane departure airport code: ");
        String depCode = reader.nextLine();
        System.out.println("Give destination airport code: ");
        String destCode = reader.nextLine();

        Flight newFlight = new Flight(airp, depCode, destCode);
        
        flights.put(planeID, newFlight);
            
    } 
     
    public void flightService() {
            System.out.println("Flight panel: \n" 
                       + "__________________\n");
                                
          while (true) {     
            System.out.println("Choose operation: \n"
                       + "[1] Print planes\n"
                       + "[2] Print flights\n"
                       + "[3] Print plane info\n"
                       + "[x] Quit\n"
                       + "> ");
            
            String command = reader.nextLine();

            if (command.equals("x")) {
                System.out.println("SEEYUH!");
                break;
            } else if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printPlaneInfo();
            }
        } 
    } 
    
    public void printPlanes() {
        
      for (AirplaneAirport ap : planes.values()) {
          System.out.println(ap); 
      }      
    }
    
    public void printFlights() {
      for (Flight fl : flights.values()) {
          System.out.println(fl);
      }    
    }
    
    public void printPlaneInfo() {
        System.out.println("Give plane ID: ");
        String planeID = reader.nextLine();   
        
        System.out.println(planes.get(planeID));
    }
}
