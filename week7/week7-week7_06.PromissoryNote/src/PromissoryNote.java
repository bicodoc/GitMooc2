
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertdavis
 */
public class PromissoryNote {
    private HashMap<String, Double> note;
    
    public PromissoryNote() {
        note = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        note.put(toWhom, value);        
    }
    
    public double howMuchIsTheDebt(String whose) {
        if(this.note.containsKey(whose)) {
            return this.note.get(whose);
        }
        return 0.0;
    }    
}

/*
import java.util.HashMap;
import java.util.Map;
 
public class PromissoryNote {
    private Map<String, Double> debt = new HashMap<String, Double>();
 
    public void setLoan(String toWhom, double value) {
        debt.put(toWhom, value);
    }
 
    public double howMuchIsTheDebt(String whose) {
        Double value = debt.get(whose);
        if (value == null) {
            return 0;
        }
 
        return value;
    }
}
*/