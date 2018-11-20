
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author albertdavis
 */
public class Container {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentContainerWeight;
    
    public Container(int maxWeight) {
        suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;        
    }
    
    public void addSuitcase(Suitcase suitcase) {
//        if (maxWeight - currentContainerWeight(1000) >= suitcase.totalWeight()) {
        if (currentContainerWeight < maxWeight) {
            suitcases.add(suitcase);
        }               
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + currentContainerWeight(maxWeight) + ") kg";
    }
    
    public int currentContainerWeight(int maxWeight) {
        currentContainerWeight = 0;
        for (Suitcase item : suitcases) {
            currentContainerWeight += item.totalWeight();
        }
        return currentContainerWeight;
    }

    public void printThings() {
        for (Suitcase item : suitcases) {
            item.printThings();
        }
    }
}
