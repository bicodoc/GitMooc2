/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author albertdavis
 */
public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;
    
    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
    
    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }

    @Override
    public int compareTo(Item o) {
        return this.getVolume() - o.getVolume();
    }
}

/*
package moving.domain;
 
public class Item implements Thing, Comparable<Item> { 
    private String name;
    private int volume;
 
    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
 
    public String getName() {
        return name;
    }
 
    @Override
    public int getVolume() {
        return volume;
    }
 
    @Override
    public int compareTo(Item t) {
        return this.volume - t.getVolume();
    }
 
    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }
}
*/