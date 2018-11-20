package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author albertdavis
 */
public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> filmRatingsMap;
    private Map<Film, Double> avgRatingsMap = new HashMap();
    
    public FilmComparator(Map<Film, List<Rating>> filmRatingsMap) {
        this.filmRatingsMap = filmRatingsMap;
        Set<Film> filmKeys = filmRatingsMap.keySet();
        for (Film item : filmKeys) {
            getAverage(item, filmRatingsMap.get(item));
        }
    }
    
    public void getAverage(Film film, List<Rating> listOfRatings) {
        double avg = 0;
        double divisor = listOfRatings.size();        
        for (Rating item : listOfRatings) {
            avg += item.getValue();
        }
        avg /= divisor;
        System.out.println("average for " + film + " is " + avg);
        avgRatingsMap.put(film, avg);
        System.out.println("avgRatingsMap is " + avgRatingsMap);
    }

    @Override
    public int compare(Film o1, Film o2) {
        System.out.println("compare results o1, o2 is " +o1 + ", " + o2 + " " + (avgRatingsMap.get(o2) - avgRatingsMap.get(o1)));
        return (int)(avgRatingsMap.get(o2) - avgRatingsMap.get(o1));
    }
}
