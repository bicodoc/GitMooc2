package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import reference.comparator.FilmComparator;
import reference.domain.*;

/**
 *
 * @author albertdavis
 */
public class Reference {
    private RatingRegister ratings;
    private List<Film> films;
    
    public Reference(RatingRegister ratings) {
        this.ratings = ratings;
        films = new ArrayList();
    }
    
    public Film recommendFilm(Person person) {  //recommends films to people
        List<Film> films = new ArrayList(ratings.filmRatings().keySet());
        Collections.sort(films, new FilmComparator(ratings.filmRatings()));
//        return films.get(films.size() - 1);
        System.out.println("films after sorting is " + films);
        return films.get(0);
        }    
}
