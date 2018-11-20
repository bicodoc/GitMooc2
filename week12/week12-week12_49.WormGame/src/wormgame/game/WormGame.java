package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.gui.Updatable;
import wormgame.domain.Worm;

public class WormGame extends Timer implements ActionListener {
    private int width;
    private int height;
//    private int startX;
//    private int startY;
    private Direction startDir;
    private Worm worm;
    private Random rand;        
    private int appX;
    private int appY;
    private Apple apple;
    private boolean continues;
    private Updatable updatable;
    

        public WormGame(int width, int height) {
        super(1000, null);
        this.width = width;
        this.height = height;
//        this.startX = width / 2;
//        this.startY = height / 2;
        this.startDir = Direction.DOWN;
        this.worm = new Worm(width / 2, height / 2, startDir);
        this.appX = new Random().nextInt(width + 1);
        this.appY = new Random().nextInt(height + 1);
        this.apple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
        this.continues = true;
        addActionListener(this);
        setInitialDelay(2000);
        while (worm.runsInto(apple)) {
            this.apple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
        }
    }
    
    public Worm getWorm() {
        return this.worm; 
    }
    
    public void setWorm(Worm worm) {
        this.worm = worm;
    }
    
    public Apple getApple() {
        return this.apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            worm.move();
            while (worm.runsInto(apple)) {
                this.apple = new Apple(new Random().nextInt(this.width), new Random().nextInt(this.height));
            }
        } else if (worm.runsIntoItself()) {
            continues= false;
        } else if (worm.head().getX() == width + 1 || worm.head().getX() < -1) {
            continues = false;
        } else if (worm.head().getY() == height + 1 || worm.head().getY() < -1) {
            continues = false;
        }
        updatable.update();
        setDelay(2000 / worm.getLength());        
    }
}
