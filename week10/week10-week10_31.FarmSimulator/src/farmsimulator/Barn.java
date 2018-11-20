package farmsimulator;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class Barn {
    private MilkingRobot barnRobot;
    private BulkTank barnTank;
    
    public Barn(BulkTank tank) {
        this.barnTank = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.barnTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barnRobot = new MilkingRobot();
        this.barnRobot.setBulkTank(barnTank);
    }
    
    public void takeCareOf(Cow cow) {
        try {
            barnRobot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException("No milking robot installed");
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        for (Cow item : cows) {
            try {
                barnRobot.milk(item);
        } catch (Exception e) {
            throw new IllegalStateException("No milking robot installed");
            }
        }
    }

    public String toString() {
        return "" + barnTank;
    }    
}

/*
package farmsimulator;
 
import java.util.Collection;
 
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
 
    public Barn(BulkTank tank) {
        this.tank = tank;
    }
 
    public BulkTank getBulkTank() {
        return tank;
    }
 
    public void installMilkingRobot(MilkingRobot robot) {
        robot.setBulkTank(tank);
        this.robot = robot;
    }
 
    public void takeCareOf(Cow cow) {
        if (robot == null) {
            throw new IllegalStateException("The milking robot hasn't been installed");
        }
 
        robot.milk(cow);
    }
 
    public void takeCareOf(Collection<Cow> cows) {
        for (Cow cow : cows) {
            takeCareOf(cow);
        }
    }
 
    @Override
    public String toString() {
        return tank.toString();
    }
}
*/