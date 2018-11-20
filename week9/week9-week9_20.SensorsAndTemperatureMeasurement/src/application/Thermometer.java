package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author albertdavis
 */
public class Thermometer implements Sensor {
    private boolean state;
    
    public Thermometer() {
        this.state = false;     //false is off; true is on
    }
    
    @Override
    public boolean isOn() {
        return this.state;
    }
    
    @Override
    public void on() {
        this.state = true;
    }
    
    @Override
    public void off() {
        this.state = false;
    }        
    
    @Override
    public int measure() {
        on();
        if (this.state = true) {
            Random rand = new Random();
            int temperature = rand.nextInt((30 + 30) + 1) -30;
            return temperature;
        }
        if (this.state = false) {
            throw new IllegalStateException("state is off");
        }
        return -99;
    }    
}

/*
package application;
 
import java.util.Random;
 
public class Thermometer implements Sensor { 
    private boolean on;
 
    @Override
    public boolean isOn() {
        return on;
    }
 
    @Override
    public void on() {
        on = true;
    }
 
    @Override
    public void off() {
        on = false;
    }
 
    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
 
        Random random = new Random();
        return random.nextInt(60 + 1) - 30;
    }
}
*/
