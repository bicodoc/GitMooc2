package farmsimulator;

/**
 *
 * @author albertdavis
 */
public class BulkTank {
    private double capacity = 2000;
    private double volume;
    
    public BulkTank() {
        this.capacity = capacity;
        this.volume = volume;
    }
    
    public BulkTank(double capacity) {  //capacity of the tank
        this.capacity = capacity;
    }
    
    public double getCapacity() {
        return this.capacity;
    }
    
    public double getVolume() {         //volume of milk in the tank
        return this.volume;
    }
    
    public double howMuchFreeSpace() {  //free space in the tank
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount) {  //add milk to tank
            volume += amount;
            if (volume > capacity) volume = capacity;
    }
    
    public double getFromTank(double amount) {  //take milk from tank
        if (amount > volume) amount = volume;
        return volume -= amount;
    }
    
    public String toString() {
        return String.format("%.2f", Math.ceil(volume)) + "/" + String.format("%.2f", Math.ceil(capacity));
    }
}

/*
package farmsimulator;
 
public class BulkTank {
    private double capacity;
    private double volume = 0;
 
    public BulkTank() {
        this(2000);
    }
 
    public BulkTank(double capacity) {
        this.capacity = capacity;
    }
 
    public double getCapacity() {
        return capacity;
    }
 
    public double getVolume() {
        return volume;
    }
 
    public double howMuchFreeSpace() {
        return capacity - volume;
    }
 
    public void addToTank(double amount) {
        double newVolume = volume + amount;
        if (newVolume > capacity) {
            newVolume = capacity;
        }
        volume = newVolume;
    }
 
    public double getFromTank(double amount) {
        double takenAmount = amount;
        if (takenAmount > volume) {
            takenAmount = volume;
        }
        volume -= takenAmount;
        return takenAmount;
    }
 
    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}
*/
