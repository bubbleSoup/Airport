
package Airport2;

import java.util.Scanner;



public class MainAirport {
   public static void main(String[] Container) {   
    Scanner reader = new Scanner(System.in);
    
    AirportUi airport = new AirportUi(reader);
    
    airport.airportService(); 
    airport.flightService();
   }   
}      
