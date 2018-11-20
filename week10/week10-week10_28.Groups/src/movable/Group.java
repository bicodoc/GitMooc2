package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class Group implements Movable {
    private List<Movable> orgs;
    
    public Group() {
        this.orgs = new ArrayList();
    }
    
    public void addToGroup(Movable movable) {
        this.orgs.add(movable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object item : orgs) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable item : orgs) {
            item.move(dx, dy);
        }
    }
}

/*
package movable;
 
import java.util.ArrayList;
import java.util.List;
 
public class Group implements Movable {
 
    private List<Movable> group;
 
    public Group() {
        this.group = new ArrayList<Movable>();
    }
 
    public void addToGroup(Movable s) {
        this.group.add(s);
    }
 
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : group) {
            movable.move(dx, dy);
        }
    }
 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable movable : group) {
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString();
    }
}
*/