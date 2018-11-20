package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author albertdavis
 */
public class RatingRegister {
    private Rating rating;
    private Film noFilm;
    private List<Person> criticList;
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personRating;
    
    public RatingRegister() {
        noFilm = new Film("No Film");
        criticList = new ArrayList();
        filmRatings = new HashMap();
        personRating = new HashMap();
    }
    
    public void addRating(Film film, Rating rating) {   //creates the filmRatings HashMap
        if (filmRatings.containsKey(film)) {
            filmRatings.get(film).add(rating);
        } else {
            filmRatings.put(film, new ArrayList());
            filmRatings.get(film).add(rating);
        }
    }
    
    public List<Rating> getRatings(Film film) {         //gets a list of ratings for a film from filmRatings
        return filmRatings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings() {      //returns the map filmRatings of all films and all ratings
        return filmRatings;
    }
    
    public void addRating(Person person, Film film, Rating rating) {    //creates Map of person(one film, one rating)
        addRating(film, rating);
        if (personRating.containsKey(person)) {
            if (personRating.get(person).containsKey(film)) {
               System.out.println(person + " has already rated " + film + " as " + personRating.get(person).get(film));
            } else {
                personRating.get(person).put(film, rating);
            }
        } else {
            personRating.put(person, new HashMap());
            personRating.get(person).put(film, rating);
        }
    }

    public Rating getRating(Person person, Film film) { //returns a person's rating for one film'
        Rating retval = Rating.NOT_WATCHED;
        if (personRating.containsKey(person) && personRating.get(person).containsKey(film)) {
                retval = personRating.get(person).get(film);
        }
        return retval;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {    //returns one person's ratings for all films
        if (!(personRating.containsKey(person))) {
            personRating.put(person, new HashMap());
        }
        return personRating.get(person);
    }

    public List<Person> reviewers() {
        Set keySet = personRating.keySet();
        criticList.addAll(0, keySet);
        return criticList;
    }
}
