import java.util.ArrayList;

/**
 *
 * @author albertdavis
 */
public class Suitcase {

    private ArrayList<Thing> things;
    private int weightLimit;
    private int currentWeight;

    public Suitcase(int weightLimit) {
        things = new ArrayList<Thing>();
        this.weightLimit = weightLimit;
    }

    public void addThing(Thing thing) {
        currentWeight = currentWeight(thing);
        if (weightLimit - currentWeight >= thing.getWeight()) {
            things.add(thing);
            currentWeight += thing.getWeight();
        }
    }

    public int currentWeight(Thing thing) {
//        int currentWeight = 0;
        for (Thing load : things) {
            currentWeight += load.getWeight();
        }
        return currentWeight;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing item : things) {
             totalWeight += item.getWeight();            
        }
        return totalWeight;
    }
    
    public Thing heaviestThing() {
            currentWeight = 0;
            Thing heaviestThing = null;
        for (Thing item : things) {
             if (item.getWeight() > currentWeight) {
                 currentWeight = item.getWeight();
                 heaviestThing = item;
             }             
        }
        return heaviestThing;        
    }
    
    public void printThings() {
        for (Thing item : things) {
            System.out.println(item);
        }
    }
    
    public String toString() {
//        if (things.size() == 0) {
        if (things.isEmpty()) {
            return ("empty (" + currentWeight + " kg)");
        } else if (things.size() == 1){
//          return (things.size() + " thing (" + currentWeight + " kg)");
          return (things.size() + " thing (" + totalWeight() + " kg)");
        } else {            
//            return (things.size() + " things (" + currentWeight + " kg)");
            return (things.size() + " things (" + totalWeight() + " kg)");
        }
    }
}
