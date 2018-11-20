package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author albertdavis
 */

public class KeyboardListener implements KeyListener {
    private Figure figure;
    private Component component;
        
//    public KeyboardListener(Component DrawingBoard, Figure figure) {
        public KeyboardListener(Component component, Figure figure) {
        this.figure = figure;
        this.component = component;
    }
    
    public void repaint(){        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 1);
        }        
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }    
}

/*
package movingfigure;
 
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
public class KeyboardListener implements KeyListener {
 
    private Component component;
    private Figure figure;
 
    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }
 
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 1);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        }
 
        component.repaint();
    }
 
    @Override
    public void keyTyped(KeyEvent ke) {
    }
 
    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
*/
