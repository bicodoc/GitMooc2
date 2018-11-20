package wormgame.domain;

/**
 *
 * @author albertdavis
 */

public class Piece {
    private int x;
    private int y;
    
    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public boolean runsInto(Piece piece) {
        return x == piece.getX() && y == piece.getY();
    }
    
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }    
}
