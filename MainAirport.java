/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author jaredmcgowan
 */

public class MainAirport {
   public static void main(String[] Container) {   
    Scanner reader = new Scanner(System.in);
    
    AirportUi airport = new AirportUi(reader);
    
    airport.airportService(); 
    airport.flightService();
   }   
}      
