
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author albertdavis
 * 
 */
public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    public Storehouse() {
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
        
    }
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product) {
        if (prices.containsKey(product)) {
            return prices.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return stocks.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (stocks.containsKey(product) && stocks.get(product) > 0) {
            stocks.replace((product), (stocks.get(product) - 1));
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        return prices.keySet();
        }
    }

/*
import java.util.*;
 
public class Storehouse {
 
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
 
    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
 
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
 
    public int price(String product) {
        if (!this.prices.containsKey(product)) {
            return -99;
        }
 
        return this.prices.get(product);
    }
 
    public int stock(String product) {
        if (!this.stocks.containsKey(product)) {
            return 0;
        }
 
        return this.stocks.get(product);
    }
 
    public boolean take(String product) {
        if (!this.stocks.containsKey(product)) {
            return false;
        }
 
        int saldo = this.stocks.get(product);
        if (saldo == 0) {
            return false;
        }
 
        this.stocks.put(product, saldo - 1);
        return true;
    }
 
    public Set<String> products() {
        return this.stocks.keySet();
    }
}
*/