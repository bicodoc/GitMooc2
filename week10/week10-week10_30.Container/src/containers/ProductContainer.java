package containers;

/**
 *
 * @author albertdavis
 */
public class ProductContainer extends Container {
    private String productName;
    
    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }
    
    public String getName() {
        return productName;
    }

    public void setName(String newName) {
        productName = newName;
    }
    
    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
}

/*
package containers;
 
public class ProductContainer extends Container {
    private String name;
 
    public ProductContainer(String name, double capacity) {
        super(capacity);
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return name + ": " + super.toString();
    }
}
*/