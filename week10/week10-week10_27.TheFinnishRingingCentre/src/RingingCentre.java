
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author albertdavis
 */
public class RingingCentre {
    private Map<Bird, List<String>> sightings;
    
    public RingingCentre() {
        sightings = new HashMap();
    }
    
    public void observe(Bird bird, String place) {
        if (!sightings.keySet().contains(bird)) {
            sightings.put(bird, new ArrayList<String>());
        }
            sightings.get(bird).add(place);
    }
    
    public void observations(Bird bird) {
            if (sightings.containsKey(bird)) {
                System.out.println(bird + " observations: " + sightings.get(bird).size());
                for (String item : sightings.get(bird)) {
                    System.out.println(item);
                }
            } else {
                System.out.println(bird + " observations: 0");
            }
    }
}

/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class RingingCentre {
 
    private Map<Bird, List<String>> observationLocations;
 
    public RingingCentre() {
        observationLocations = new HashMap<Bird, List<String>>();
    }
 
    public void observe(Bird bird, String location) {
        if (!observationLocations.containsKey(bird)) {
            observationLocations.put(bird, new ArrayList<String>());
        }
        observationLocations.get(bird).add(location);
    }
 
    public void observations(Bird bird) {
        if (!observationLocations.containsKey(bird)) {
            System.out.println(bird + " observations: 0");
            return;
        }
 
        System.out.println(bird + " observations: " + observationLocations.get(bird).size());
        for (String location : observationLocations.get(bird)) {
            System.out.println(location);
        }
    }
}
*/