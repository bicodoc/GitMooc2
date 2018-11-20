/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertdavis
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;
    
    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        weight = 0.1;
    }
    
    public double weight() {
        return weight;
    }
    
    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }

}








/*
public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;            
    private double weight = 0.1;
    
    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }
    
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }
    
    public double weight() {
        return weight;
    }

}
//--------------------------------------------------------

public class CD implements ToBeStored {
 
    private String artist;
    private String name;
    private int year;
 
    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
 
    public double weight() {
        return 0.1;
    }
 
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.year + ")";
    }
 
}
*/