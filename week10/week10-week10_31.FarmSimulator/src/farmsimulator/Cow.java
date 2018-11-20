package farmsimulator;

import java.util.Random;

/**
 *
 * @author albertdavis
 */
public class Cow implements Milkable, Alive{
    private double udderCap;    //maximum udder capacity
    private String name;
    private double amount;  //amount of milk in the cows udder
    
    public Cow() {
        this.udderCap = 15 + new Random().nextInt(26);
        this.name = NAMES[new Random().nextInt(31)];
    }
    
    public Cow(String name) {
        this.udderCap = 15 + new Random().nextInt(26);
        this.name = name;
    }
    
    private static final String[] NAMES = new String[]{     //31 names
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public double milk() {          //milk in the cow's udder
        double retVal = amount;                
        this.amount = 0;
        return retVal;
    }
    
    public void liveHour() {
    this.amount += (7 + new Random().nextInt(20 - 7 + 1)) / 10.0;
    if (this.amount > this.udderCap) this.amount = this.udderCap;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        return this.udderCap;
    }
    
    public double getAmount() {    //how much milk is in the udder
        return this.amount;
    }
    
    public void resetAmount() {
        amount = 0;
    }
    
    @Override
    public String toString() {
        return name + " " + String.format("%.1f", Math.ceil(milk())) + "/" + String.format("%.1f", Math.ceil(udderCap));
    }
}

/*
package farmsimulator;
 
import java.util.Random;
 
public class Cow implements Milkable, Alive {
    private static final String[] NAMES = new String[] {
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };
 
    private Random random = new Random();
    private String name;
    private double capacity;
    private double amount;
 
    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }
 
    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + random.nextInt(26);
        this.amount = 0;
    }
 
    public String getName() {
        return name;
    }
 
    public double getCapacity() {
        return capacity;
    }
 
    public double getAmount() {
        return amount;
    }
 
    @Override
    public double milk() {
        double milkedAmount = amount;
        amount = 0;
        return milkedAmount;
    }
 
    @Override
    public void liveHour() {
        double producedAmount = 0.7 + random.nextDouble() * 1.3;
        if (amount + producedAmount > capacity) {
            amount = capacity;
        } else {
            amount += producedAmount;
        }
    }
 
    @Override
    public String toString() {
        return name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }
}
*/