package clicker.applicationlogic;

/**
 *
 * @author albertdavis
 */
public class PersonalCalculator implements Calculator {
    private int value;
    
    public PersonalCalculator() {
        value = 0;        
    }
    
    @Override
    public int giveValue() {
        return value;        
    }
    
    @Override
    public void increase() {
        value++;
    }    
}

/*
package clicker.applicationlogic;
 
public class PersonalCalculator implements Calculator {
 
    private int value;
 
    public PersonalCalculator() {
        this.value = 0;
    }
 
    @Override
    public int giveValue() {
        return this.value;
    }
 
    @Override
    public void increase() {
        this.value++;
    }
}
*/