package Airport2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jaredmcgowan
**/

public class AirplaneAirport {
    
 
    private String planeId;
    private int planeCap;
    

 
    public AirplaneAirport(String id, int cap) {
        this.planeId = id;
        this.planeCap = cap;
        
    }
    
   public String toString() {
        return this.planeId + " (" + this.planeCap + " ppl)";
    }
    
    public String getName() {
       return this.planeId;
    }
    
    public int getCap() {
        return this.planeCap;
    }
}