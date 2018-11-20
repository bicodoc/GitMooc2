package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> temps;

    public AverageSensor() {
        sensors = new ArrayList();
        temps = new ArrayList();
    }

    @Override
    public boolean isOn() {
        for (Sensor item : sensors) {
            if (item.isOn() == false) {         //if any sensor is off, isOn is false
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        if (!(sensors.isEmpty())) {             //turn all sensors on
            for (Sensor thing : sensors) {
                thing.on();
            }
        }
    }

    @Override
    public void off() {
        if (!(sensors.isEmpty())) {             //turn all sensors off
            for (Sensor thing : sensors) {
                thing.off();
            }
        }
    }

    @Override
    public int measure() {
        if (isOn() == false || sensors.isEmpty()) {
            if (sensors.isEmpty()) {
                return -99;
            }
            try {
                throw new IllegalStateException();
            } catch (Exception e) {
                on();
            }
        }
        
        int sumMeasures = 0;
        for (Sensor item : sensors) {
            sumMeasures += item.measure();
        }
        int average = sumMeasures / sensors.size();
        temps.add(average);
        return average;
    }
        
    public void addSensor(Sensor additional) {
        sensors.add(additional);                //thermometer is off when added; constant sensor is on
        if (additional.isOn()) {
            this.on();
        } else {
            this.off();
        }
    }

    public List<Integer> readings() {
        return temps;
    }
}

/*
package application;
 
import java.util.ArrayList;
import java.util.List;
 
public class AverageSensor implements Sensor {
     private List<Sensor> sensors;
    private List<Integer> readings;
 
    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        readings = new  ArrayList<Integer>();
    }
 
    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }
 
    public List<Integer> readings() {
        return readings;
    }
 
    @Override
    public boolean isOn() {
        if (sensors.isEmpty()) {
            return false;
        } 
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        } 
        return true;
    }
 
    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }
 
    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }
 
    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
 
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        } 
        int measurement = sum / sensors.size(); 
        readings.add(measurement); 
        return measurement;
    }
}
*/