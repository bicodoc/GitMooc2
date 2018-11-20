
import java.util.HashMap;

/**
 *
 * @author albertdavis
 */
public class Plane {    
    private HashMap<String, Integer> planes;

    public Plane() {
        planes = new HashMap<String, Integer>();
    }

    public void addPlane(String ID, int cap) {
        planes.put(ID, cap);
    }
        
    public String printPlaneInfo(String ID) {
        return ID + " (" + planes.get(ID) + " ppl)";
    }
    
    public void printPlanes() {
        for (String item : planes.keySet()) {
            System.out.println(item + " (" + planes.get(item) + " ppl)");
        }
    }
}

/*
public class Plane {
    private String ID;
    private String capacity;
    private List<Plane> planes;
    
    public Plane(String ID, String capacity) {
        this.ID = ID;
        this.capacity = capacity;
        this.planes = new ArrayList();
    }
    
    public void addPlane(Plane newPlane) {
        if (!(planes.contains(newPlane))) {
            planes.add(newPlane);
        }
        System.out.println("planes is " + planes);
    }
    
    public List<Plane> getInfo() {
        return planes;
    }
    
    public Plane getPlane(Plane plane) {
        return plane;
    }
    
    @Override
    public String toString() {
        return ID + " (" + capacity + " ppl)";
    }    
}

*/