
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author albertdavis
 * This class uses the ToBeStored interface as a data type in the ArrayList things so that Books and CDs can be stored, 
 * and takes advantage of the interface to obtain item weights (in the weight() and add() methods) from the Book and CD classes.
 * 
 */


public class Box implements ToBeStored {    // this demos interface as a method parameter (public void add) and 
    private double maxWeight;               // also as the type for items in an ArrayList
    private ArrayList<ToBeStored> things;
    
    public Box (double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item) {
        if (maxWeight - weight() > item.weight()) {
            things.add(item);
        }
    }
    
    @Override
    public double weight() {
        double mass = 0;
        for (ToBeStored items : things) {
            mass += items.weight();
        }
        return mass;
    }
    
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }

}


/*

public class Box implements ToBeStored{
    private double maxWeight;
    private List <ToBeStored> things;
        
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();  //use the arrayList to store (book and CD) ToBeStored objects
    }
    
    public double weight() {  // it calculates the total weight of the things which have been stored
        double weight = 0;        
        for (ToBeStored tbs : things) {
            weight += tbs.weight();
        }        
        return weight;
    }
    
    public void add(ToBeStored item) {  //ToBeStored is an interface used as a parameter
        if (maxWeight - weight() > item.weight() ) {
            things.add(item);
        }
    }
    
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg"; 
    }
    
}

*/
