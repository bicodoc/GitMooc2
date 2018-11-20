package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class OneThingBox extends Box {
    private List<Thing> boxes;
    
    public OneThingBox() {
        super();
        boxes = new ArrayList();        
    }
    
    public void add(Thing thing) {
        if (boxes.isEmpty()) {
            boxes.add(thing);
        }
    }
    
    public boolean isInTheBox(Thing thing) {
        if (boxes.contains(thing)) {
            return true;
        }
        return false;
    }    
}

/*
package boxes;
 
public class OneThingBox extends Box {
 
    private Thing thing;
 
    public OneThingBox() {
    }
 
    @Override
    public void add(Thing thing) {
        if (this.thing != null) {
            return;
        }
 
        this.thing = thing;
    }
 
    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thing != null && this.thing.equals(thing);
    }
}
*/
