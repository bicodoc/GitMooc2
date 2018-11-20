package containers;

/**
 *
 * @author albertdavis
 */
public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory newContHx;
//    private double volume;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        double volume = initialVolume;
        this.newContHx = new ContainerHistory();
//        newContHx.add(volume);
        addToTheContainer(volume);
    }
    
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        newContHx.add(getVolume());

/*
        if (amount < 0) {
            volume = 0;
        } else if (amount <= getCurrentCapacity()) {
            volume = volume + amount;
        } else {
            volume = capacity;
        }
        newContHx.add(volume);
*/
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double value = super.takeFromTheContainer(amount);
        newContHx.add(getVolume());
        return value;
/*
        if (amount <= 0) {
            return 0.0;
        } else if (amount > volume) {
            newContHx.add(volume);
            return volume;
        } else {
            volume = volume - amount;
            newContHx.add(volume);
            return amount;
        }
*/        
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + newContHx.maxValue());
        System.out.println("Smallest product amount: " + newContHx.minValue());
        System.out.println("Average: " + newContHx.average());
        System.out.println("Greatest change: " + newContHx.greatestFluctuation());
        System.out.println("Variance: " + newContHx.variance());
    }
    
    public String history() {
        return newContHx.toString();
    }    
}

/*
package containers;
 
public class ProductContainerRecorder extends ProductContainer {
 
    private ContainerHistory history;
 
    public ProductContainerRecorder(String name, double capacity, double initialVolume) {
        super(name, capacity);
        history = new ContainerHistory();
        addToTheContainer(initialVolume);
    }
 
    public String history() {
        return history.toString();
    }
 
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
 
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(getVolume());
    }
 
    @Override
    public double takeFromTheContainer(double amount) {
        double value = super.takeFromTheContainer(amount);
        history.add(getVolume());
        return value;
    }
}
*/