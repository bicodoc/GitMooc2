package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.*;

/**
 *
 * @author albertdavis
 */
public class Packer implements Thing {
    private int boxesVolume;
    private List<Box> stuff;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        stuff = new ArrayList();
    }
    
    @Override
    public int getVolume() {
        return boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        for (Thing item : things) {
            Box box = new Box(boxesVolume);
            box.addThing(item);
            stuff.add(box);
        }        
        return stuff;
    }    
}

/*
package moving.logic;
 
import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;
 
public class Packer { 
    private int boxesVolume;
 
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
 
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
 
        for (Thing t : things) {
            Box ml = new Box(boxesVolume);
            ml.addThing(t);
            boxes.add(ml);
        }
 
        return boxes;
    }
}
*/