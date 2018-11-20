package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

/**
 *
 * @author albertdavis
 */

public class DrawingBoard extends JPanel implements Updatable{
    private int width;
    private int height;
    private WormGame wormGame;
    private int pieceLength;
    private Worm worm;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        super();
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Piece item : wormGame.getWorm().getPieces()) {
            graphics.setColor(Color.BLACK);
            graphics.fill3DRect(pieceLength * item.getX(), pieceLength * item.getY(), pieceLength, pieceLength, true);
        }
        graphics.setColor(Color.RED);
        graphics.fillOval(pieceLength * wormGame.getApple().getX(), pieceLength * wormGame.getApple().getY(), pieceLength, pieceLength);
    }
    
    @Override
    public void update() {
        super.repaint();
    }
}
