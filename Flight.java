package javaapplication1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jaredmcgowan
**/

public class Flight {
    
    private String depCode;
    private String destCode;
    AirplaneAirport airplane;
    

    public Flight(AirplaneAirport airplane, String depCode, String destCode) {
        this.airplane = airplane;
        this.depCode = depCode;
        this.destCode = destCode;
        
    }
    
    public String toString() {
        return this.airplane + " (" + this.depCode + "-" + this.destCode +")";
    } 
}