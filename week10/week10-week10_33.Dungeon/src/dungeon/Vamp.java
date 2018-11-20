package dungeon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class Vamp extends GamePiece {
    private String name;
    
    public Vamp(String name, int x, int y) {
        super(x, y);
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
        return name + " " + getX() + " " + getY();
    }
}
