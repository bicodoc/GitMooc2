package application;

/**
 *
 * @author albertdavis
 */
public class ConstantSensor implements Sensor{
    private int sensorValue;
    
    public ConstantSensor(int sensorValue) {
        this.sensorValue = sensorValue;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }
    
    @Override
    public void on() {
    }
    
    @Override
    public void off() {
    }
    
    @Override
    public int measure() {
        return this.sensorValue;
    }
}

/*
package application;
 
public class ConstantSensor implements Sensor {
 
    private int value;
 
    public ConstantSensor(int value) {
        this.value = value;
    }
 
    @Override
    public boolean isOn() {
        return true;
    }
 
    @Override
    public void on() {
    }
 
    @Override
    public void off() {
    }
 
    @Override
    public int measure() {
        return value;
    }
}
*/
