package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
        if (this.weight < 0) {
            throw new IllegalArgumentException("Weight must be >= 0");
        }

    }

    public Thing(String name) {
        this(name, 0);
        if (this.weight < 0) {
            throw new IllegalArgumentException("Weight must be >= 0");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    public boolean contains(Thing thing) {
        if (this.name == thing.getName()) {
            return true;
        }
        return false;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

/*
package boxes;
 
public class Thing {
 
    private String name;
    private int weight;
 
    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight must be 0 or bigger.");
        }
 
        this.name = name;
        this.weight = weight;
    }
 
    public Thing(String name) {
        this(name, 0);
    }
 
    public String getName() {
        return name;
    }
 
    public int getWeight() {
        return weight;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
}
*/