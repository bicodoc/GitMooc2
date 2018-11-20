package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory() {
        history = new ArrayList();
    }
    
    public void add(double situation) {
        history.add(situation);
    }
    
    public double maxValue() {
        return Collections.max(history);

/*
        double maxValue = 0;
        if (history.size() > 0) {
            for (Double item : history) {
                if (item > maxValue) maxValue = item;
            }
        }
        return maxValue;
*/        
    }
    
    public double minValue() {
        return Collections.min(history);
/*
        double minValue = 0;
        if (history.size() > 0) minValue = history.get(0);    
        if (history.size() > 0) {
            for (Double item : history) {
                if (item < minValue) minValue = item;
            }
        }
        return minValue;    
*/
        }
    
    public double average() {
        double average = 0;
        if (history.size() > 0) {
            for (Double item : history) {
                average += item;
            }
            average /= history.size();
        }
        return average;
    }
    
    public double greatestFluctuation() {
        double maxFlux = 0;
        double flux = 0;
        if (history.size() > 1) {
            for (int i = 0; i < history.size() - 1; i++) {
                flux = Math.abs(history.get(i) - history.get(i + 1));
                if (flux > maxFlux) maxFlux = flux;
            }
        }
        return maxFlux;
    }
    
    public double variance() {
        double variance = 0;
        double avg = average();
        double sum = 0;
        if (history.size() > 1) {
            for (Double item : history) {
                sum += ((item - avg) * (item - avg));
            }
            variance = sum / (history.size() - 1);
        }
        return variance;
    }
    
    public void reset() {
        history.clear();
    }
    
    public String toString() {
        return history.toString();
    }    
}

/*
package containers;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class ContainerHistory {
 
    private List<Double> history;
 
    public ContainerHistory() {
        history = new ArrayList<Double>();
    }
 
    public void add(double situation) {
        history.add(situation);
    }
 
    public void reset() {
        history.clear();
    }
 
    public double minValue() {
        return Collections.min(history);
    }
 
    public double maxValue() {
        return Collections.max(history);
    }
 
    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
 
        double sum = 0;
        for (double situation : history) {
            sum += situation;
        }
 
        return sum / history.size();
    }
 
    public double greatestFluctuation() {
        if (history.isEmpty()) {
            return 0;
        }
 
        double biggest = 0;
 
        for (int i = 0; i < history.size() - 1; i++) {
            double previousChange = Math.abs(history.get(i) - history.get(i + 1));
            if (previousChange > biggest) {
                biggest = previousChange;
            }
        }
 
        return biggest;
    }
 
    public double variance() {
        double average = average();
 
        double subSquareSum = 0;
        for (double number : history) {
            double subtraction = number - average;
            double subtractionSquare = subtraction * subtraction;
            subSquareSum += subtractionSquare;
        }
 
        return subSquareSum / (history.size() - 1);
    }
 
    @Override
    public String toString() {
        return history.toString();
    }
}
*/