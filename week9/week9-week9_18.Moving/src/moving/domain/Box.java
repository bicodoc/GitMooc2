/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author albertdavis
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        things = new ArrayList();
    }
    
    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= maximumCapacity) {
            things.add(thing);
            return true;
        }
        return false;
    }
    
    @Override
    public int getVolume() {
        int sumThings = 0;
        for (Thing widget : things) {
            sumThings += widget.getVolume();
    }
        return sumThings;
    }
    
    public String toString(Thing thing) {
        return  "\nThing is " + thing + " volume is " + thing.getVolume();
    }
}

/*
package moving.domain;
 
import java.util.ArrayList;
import java.util.List;
 
public class Box implements Thing { 
    private List<Thing> things = new ArrayList<Thing>();
    private int maximumCapacity;
 
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
 
    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() > this.maximumCapacity) {
            return false;
        }
 
        this.things.add(thing);
        return true;
    }
 
    @Override
    public int getVolume() {
        int weight = 0;
        for (Thing t : this.things) {
            weight += t.getVolume();
        }
 
        return weight;
    }
}
*/
