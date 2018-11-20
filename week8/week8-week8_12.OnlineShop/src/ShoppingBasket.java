
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author albertdavis
 */

public class ShoppingBasket {
    private Map<String, Purchase> items;
    
    public ShoppingBasket() {
        items = new HashMap<String, Purchase>();
    }
        
    public void add(String product, int price) {
        Purchase p = new Purchase(product, 1, price);
        if (items.containsKey(product)) {
            items.get(product).increaseAmount();
        } else {
            items.put(product, p);
        }    
    }
    
    public int price() {    //summarize basket total for all purchases
        int variable = 0;
        for (Purchase p : items.values()) {
            variable += p.price();
        }
        return variable;
    }
    
    public void print() {
        for (String item : items.keySet())
            System.out.println(items.get(item));
    }
}

/*
import java.util.*;
 
public class ShoppingBasket { 
    private Map<String, Purchase> purchases;
    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }
 
    public int price() {
        int price = 0;
        for (Purchase purchase : this.purchases.values()) {
            price += purchase.price();
        } 
        return price;
    }
 
    public void add(String product, int price) {
        Purchase purchase = this.purchases.get(product);
        if (purchase == null) {
            purchase = new Purchase(product, 0, price);
        }
        purchase.increaseAmount();
        this.purchases.put(product, purchase);
    }
 
    public void print() {
        for (Purchase purchase : this.purchases.values()) {
            System.out.println(purchase);
        }
    }
}
*/

     

