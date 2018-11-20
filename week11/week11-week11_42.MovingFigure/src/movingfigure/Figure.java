package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author albertdavis
 */
public abstract class Figure {
    private int x;
    private int y;
    
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Figure() {
        
    }
        
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public abstract void draw(Graphics graphics);
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }    
}

/*
package movingfigure;
 
import java.awt.Graphics;
 
public abstract class Figure {
 
    private int x;
    private int y;
 
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public int getX() {
        return x;
    }
 
    public int getY() {
        return y;
    }
 
    public void move(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
 
    public abstract void draw(Graphics graphics);
}
*/
