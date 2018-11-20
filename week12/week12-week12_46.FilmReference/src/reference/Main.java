package reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Main {

    public static void main(String[] args) {
        // Test your code here

/*
        //test code for 46.3, RatingRegister, Part 1
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");

        RatingRegister reg = new RatingRegister();
        reg.addRating(eraserhead, Rating.BAD);
        reg.addRating(eraserhead, Rating.BAD);
        reg.addRating(eraserhead, Rating.GOOD);

        reg.addRating(theBridgesOfMadisonCounty, Rating.GOOD);
        reg.addRating(theBridgesOfMadisonCounty, Rating.FINE);

        System.out.println("All ratings: " + reg.filmRatings());
        System.out.println("Ratings for Eraserhead: " + reg.getRatings(eraserhead));
//        System.out.println("Ratings for TBOMC: " + reg.getRatings(theBridgesOfMadisonCounty));
*/

/*
        //test code for 46.4, RatingRegister, Part 2
        RatingRegister ratings = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film eraserhead = new Film("Eraserhead");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");

        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        ratings.addRating(matti, eraserhead, Rating.FINE);

        ratings.addRating(pekka, goneWithTheWind, Rating.GOOD);
        ratings.addRating(pekka, eraserhead, Rating.GOOD);

        System.out.println("Matti's rating for Eraserhead is " + ratings.getRating(matti, eraserhead));
        System.out.println("Ratings for Eraserhead: " + ratings.getRatings(eraserhead));
        System.out.println("Ratings for GWTW: " + ratings.getRatings(goneWithTheWind));        
        System.out.println("Matti's ratings: " + ratings.getPersonalRatings(matti));
        System.out.println("Reviewers: " + ratings.reviewers());
*/
 
/*
        //test code for 46.5, PersonComparator
        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikke = new Person("Mikke");
        Person thomas = new Person("Thomas");

        Map<Person, Integer> peopleIdentities = new HashMap<Person, Integer>();
        peopleIdentities.put(matti, 42);
        peopleIdentities.put(pekka, 134);
        peopleIdentities.put(mikke, 8);
        peopleIdentities.put(thomas, 82);

        List<Person> ppl = Arrays.asList(matti, pekka, mikke, thomas);
        System.out.println("People before sorting: " + ppl);

        Collections.sort(ppl, new PersonComparator(peopleIdentities));
        System.out.println("People after sorting: " + ppl);
*/

/*
        //test code for 46.6, FilmComparator
        RatingRegister ratings = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikke = new Person("Mikke");

        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(matti, eraserhead, Rating.FINE);

        ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
        ratings.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
        ratings.addRating(pekka, eraserhead, Rating.MEDIOCRE);

        ratings.addRating(mikke, eraserhead, Rating.BAD);

        Map<Film, List<Rating>> filmRatings = ratings.filmRatings();
//        System.out.println("filmRatings in Main is " + filmRatings);

        List<Film> films = Arrays.asList(goneWithTheWind, theBridgesOfMadisonCounty, eraserhead);
        System.out.println("The films before sorting: " + films);

        Collections.sort(films, new FilmComparator(filmRatings));
        System.out.println("The films after sorting: " + films);
*/
 
///*
        //test code for 46.7, Reference part1
        RatingRegister ratings = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");
//        Film saksiKasi = new Film("saksiKasi");
//        Film haifisch = new Film("haifisch");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikke = new Person("Mikke");
        
//        Person jukka = new Person("Jukka");

        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(matti, eraserhead, Rating.FINE);

        ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
        ratings.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
        ratings.addRating(pekka, eraserhead, Rating.MEDIOCRE);

//        ratings.addRating(pekka, eraserhead, Rating.FINE);
//        ratings.addRating(pekka, saksiKasi, Rating.FINE);
//        ratings.addRating(saksiKasi, Rating.FINE);
//        ratings.addRating(saksiKasi, Rating.GOOD);
//        ratings.addRating(haifisch, Rating.BAD);
//        ratings.addRating(haifisch, Rating.BAD);

        Reference ref = new Reference(ratings);
        
        Film recommended = ref.recommendFilm(mikke);
        System.out.println("The film recommended to Michael is: " + recommended);
//*/
    }
}
