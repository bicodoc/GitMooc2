package movingfigure;

import java.awt.Component;
import java.awt.Graphics;
//import java.awt.List;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author albertdavis
 */

public class CompoundFigure extends Figure {
    private List<Figure> figures;
        
    public CompoundFigure(int x, int y) {
        super(x, y);
        figures = new ArrayList();
    }
    
    public CompoundFigure() {
        figures = new ArrayList();
    }
    
    @Override
    public void draw(Graphics graphics) {
        for (Figure item : figures) {
            item.draw(graphics);
        }
    }
    
    public void add(Figure f) {
        figures.add(f);
    }
    
    public void move(int dx, int dy) {
        for (Figure item : figures) {
            item.move(dx, dy);
        }
    }    
}

/*
package movingfigure;
 
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
 
public class CompoundFigure extends Figure {
 
    private List<Figure> figures;
 
    public CompoundFigure() {
        super(0, 0);
        this.figures = new ArrayList();
    }
 
    public void add(Figure figure) {
        this.figures.add(figure);
    }
 
    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : this.figures) {
            figure.draw(graphics);
        }
    }
 
    @Override
    public void move(int dx, int dy) {
        for (Figure figure : this.figures) {
            figure.move(dx, dy);
        }
    }
}
*/
