
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author albertdavis
 */
public class Purchase {           //purchase = factory(?)
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
           
    public int price() {
        return amount * unitPrice;        
    }
            
    public void increaseAmount() {
        this.amount++;
    }
    
    public String toString() {
        return this.product + ": " + this.amount;
    }
}

/*
public class Purchase {
 
    private String product;
    private int amount;
    private int unitPrice;
 
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
 
    public int price() {
        return this.amount * this.unitPrice;
    }
 
    public void increaseAmount() {
        this.amount++;
    }
 
    @Override
    public String toString() {
        return this.product + ": " + this.amount;
    }
}
*/