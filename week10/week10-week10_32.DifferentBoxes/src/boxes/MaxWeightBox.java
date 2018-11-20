package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> maxWeightThings;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        maxWeightThings = new ArrayList();        
    }
    
    public void add(Thing thing) {
        int sum = 0;
        for (Thing item : maxWeightThings) {
            sum += item.getWeight();
        }
        if (thing.getWeight() <= (maxWeight - sum)) {
            maxWeightThings.add(thing);
//            currWeight += thing.getWeight();
        }            
    }
    
    public boolean isInTheBox(Thing thing) {
        if (maxWeightThings.contains(thing)) {
            return true;
        }
        return false;
    }
}

/*
package boxes;
 
import java.util.ArrayList;
import java.util.List;
 
public class MaxWeightBox extends Box {
 
    private List<Thing> things;
    private int maxWeight;
 
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
 
    @Override
    public void add(Thing thing) {
        if (this.weightOfThings() + thing.getWeight() > this.maxWeight) {
            return;
        }
 
        this.things.add(thing);
    }
 
    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }
 
    private int weightOfThings() {
        int weight = 0;
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }
 
        return weight;
    }
}
*/
