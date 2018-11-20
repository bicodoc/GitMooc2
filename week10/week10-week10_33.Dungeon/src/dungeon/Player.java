package dungeon;

/**
 *
 * @author albertdavis
 */
public class Player extends GamePiece {
    private String name;
    
    public Player (String name, int x, int y) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
         return name + " " + getX() + " " + getY();
    }
}

/*
package dungeon;
 
public class Player {
 
    private int x;
    private int y;
    private int moves;
    private Game game;
 
    public Player(Game game, int x, int y, int numberOfMoves) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.moves = numberOfMoves;
    }
 
    public int getX() {
        return x;
    }
 
    public int getY() {
        return y;
    }
 
    public void move() {
        moves--;
    }
 
    public boolean zeroMovesLeft() {
        return moves == 0;
    }
 
    public int numberOfMoves() {
        return moves;
    }
 
    void execute(char c) {
        int newX = x;
        int newY = y;
 
        if (c == 'w') {
            newY--;
        } else if (c == 's') {
            newY++;
        } else if (c == 'a') {
            newX--;
        } else if (c == 'd') {
            newX++;
        } else {
            //throw new Error("");
        }
        if (game.check(newX, newY)) {
            x = newX;
            y = newY;
        }
    }
 
}
*/
