package people;

/**
 *
 * @author albertdavis
 */
public class Student extends Person {
    private int credits;
    
    public Student(String name, String address) {
        super (name, address);
//        this.credits = 0;
    }
    
    public int credits() {
        return credits;
    }
    
    public void study() {
        credits++;        
    }
    
    public String toString() {
        return super.toString() + "\n  credits " + credits;
    }
        
}

/*
package people;
 
public class Student extends Person {
 
    private int credits;
 
    public Student(String name, String address) {
        super(name, address);
    }
 
    public int credits() {
        return credits;
    }
 
    public void study() {
        credits++;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\n  credits " + credits;
    }
 
}
*/