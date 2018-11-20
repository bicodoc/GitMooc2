package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class BlackHoleBox extends Box {
    private List<Thing> boxes;
    
    public BlackHoleBox() {
        super();
        boxes = new ArrayList();        
    }
    
    public void add(Thing thing) {
        boxes.add(thing);
    }
    
    public boolean isInTheBox(Thing thing) {
        return false;
    }    
}

/*
package boxes;
 
import java.util.ArrayList;
import java.util.List;
 
public class BlackHoleBox extends Box {
 
    private List<Thing> things;
 
    public BlackHoleBox() {
        this.things = new ArrayList<Thing>();
    }
 
    @Override
    public void add(Thing thing) {
        this.things.add(thing);
    }
 
    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
*/
