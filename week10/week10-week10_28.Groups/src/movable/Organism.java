package movable;

/**
 *
 * @author albertdavis
 */
public class Organism implements Movable {
    private int x;
    private int y;
    
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int newX) {
        this.x = newX;
    }
    
    public void setY(int newY) {
        this.y = newY;
    }
    
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
            
            
    @Override
    public String toString() {
        return "x: " + getX() + "; y: " + getY();
    }
}



























/*
    private int x;
    private int y;
    
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public String toString() {
        return "x: " + x + "; " + "y: " + y;
    }
*/

