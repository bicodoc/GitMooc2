
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertdavis
 */
public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    public double weight() {
        return weight;
    }
    
    @Override
    public String toString() {
        return writer + ": " + name;
    }

}




/*
public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;
    
    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    public String toString() {
        return writer + ": " + name;
    }

    public double weight() {
        return weight;
    }
    
}
//------------------------------------------------------------------------------
/*
public class Book implements ToBeStored {
 
    private double weight;
    private String author;
    private String name;
 
    public Book(String writer, String name, double weight) {
        this.weight = weight;
        this.author = writer;
        this.name = name;
    }
 
    public double weight() {
        return this.weight;
    }
 
    public String toString() {
        return this.author + ": " + this.name;
    }
 
}
*/
