package wormgame.domain;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import wormgame.Direction;

/**
 *
 * @author albertdavis
 */

public class Worm {
    private int originalX;
    private int originalY;
    private Direction originalDirection;
//    private LinkedList<Piece> pieces;
    private List<Piece> pieces;
    private boolean growBool = false;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = originalDirection;
//        this.pieces = new LinkedList();
        this.pieces = new ArrayList();
        pieces.add(new Piece(originalX, originalY));
    }
    
    public Direction getDirection() {
        return originalDirection;
    }
    
    public void setDirection(Direction dir) {
        originalDirection = dir;
    }
    
    public int getLength() {
        return getPieces().size();
    }
    
//    public LinkedList<Piece> getPieces() {
    public List<Piece> getPieces() {    
        return pieces;
    }

    public void move() { //moves the worm one piece forward; it moves by adding to the head and deleting the tail
//        pieces.addLast(makePiece(pieces.getLast(), originalDirection));
        pieces.add(makePiece(pieces.get(pieces.size() - 1), originalDirection));
        if (pieces.size() > 3 && growBool == false) {
//            pieces.removeFirst();
            pieces.remove(0);
        }
        growBool = false;
    }
    
    public void grow() { //grows the worm by one piece at the next move() call
        growBool = true;
    }
    
    public boolean runsInto(Piece piece) {  //returns true if any piece of the worm runs into parameter piece
//if the worm runs into Apple, (Piece item : pieces) is wrong        
        for (Piece item : pieces) {
            if (piece.getX() == item.getX() && piece.getY() == item.getY()) {
                return true;
            }        
        }
        return false;
    }
    
    public boolean runsIntoItself() {   //returns true if worm collides w/ any piece of itself
//        Piece testPiece = pieces.getLast();
        Piece testPiece = pieces.get(pieces.size() - 1);
        for (int i = 0; i < pieces.size() - 1; i++) {
            if (testPiece.getX() == pieces.get(i).getX() && testPiece.getY() == pieces.get(i).getY()) {
                return true;
            }
        }
        return false;
    }

    public Piece makePiece(Piece piece, Direction direction) {
        int newX = 0;
        int newY = 0;
        switch (direction) {
            case UP:
                newX = piece.getX();
                newY = piece.getY() - 1;
                break;
            case RIGHT:
                newX = piece.getX() + 1;
                newY = piece.getY();
                break;
            case DOWN:
                newX = piece.getX();
                newY = piece.getY() + 1;
                break;
            case LEFT:
                newX = piece.getX() - 1;
                newY = piece.getY();
                break;            
        }
        Piece newPiece = new Piece(newX, newY);
        return newPiece;        
    }
    
        public Piece head() {
//        return pieces.getLast();
        return pieces.get(pieces.size() - 1);
    }
}
