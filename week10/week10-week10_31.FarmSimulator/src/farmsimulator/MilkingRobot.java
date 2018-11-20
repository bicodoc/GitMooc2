package farmsimulator;

/**
 *
 * @author albertdavis
 */
public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot() {
    }
    
    public BulkTank getBulkTank() {
        if (this.tank == null) {
            return null;
        } else {
            return this.tank;
        }
    }
    
    public void setBulkTank(BulkTank tank) {    //attaches the tank to the milking robot
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) {
        try {
            this.tank.addToTank(milkable.milk());            
        } catch (Exception e) {
            throw new IllegalStateException("No milking robot installed");
        }
    }    
}

/*
package farmsimulator;
 
public class MilkingRobot {
    private BulkTank tank = null;
 
    public BulkTank getBulkTank() {
        return tank;
    }
 
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
 
    public void milk(Milkable milkable) {
        if (tank == null) {
            throw new IllegalStateException("The bulk tank hasn't been installed");
        }
 
        tank.addToTank(milkable.milk());
    }
}
*/
