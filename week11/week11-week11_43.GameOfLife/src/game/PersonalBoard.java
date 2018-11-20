package game;

import gameoflife.GameOfLifeBoard;

/**
 *
 * @author albertdavis
 */

public class PersonalBoard extends GameOfLifeBoard {
    private int width;
    private int height;
    private int count;
    
    public PersonalBoard(int width, int height) {
        super(width, height);
        count = 0;
    }
    
    @Override
    public void initiateRandomCells(double d) {
        boolean[][] board = getBoard();
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                if (Math.random() <= d) {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (x >= 0 && x < getWidth() && y >= 0 && y < getHeight()) {
            if (getBoard()[x][y] == true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        count = 0;
        for (int i = (x - 1); i <= (x + 1); i++) {
            for (int j = (y - 1); j <= (y + 1); j++) {
                if (i == x && j == y) {
                    continue;
                } else if (isAlive(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (x >= 0 && x < getWidth() && y >= 0 && y < getHeight()) {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (x >= 0 && x < getWidth() && y >= 0 && y < getHeight()) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (getBoard()[x][y] == true) {
            if (livingNeighbours < 2) {
                getBoard()[x][y] = false;
            } else if (livingNeighbours < 4) {
                getBoard()[x][y] = true;
            } else if (livingNeighbours >= 4) {
                getBoard()[x][y] = false;
            }
        } else if (isAlive(x, y) == false) {
            if (livingNeighbours == 3) {
                getBoard()[x][y] = true;
            }
        }
    }    
}

/*
package game;
 
import gameoflife.GameOfLifeBoard;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class PersonalBoard extends GameOfLifeBoard {
 
    private List<Integer> viewDirection;
 
    public PersonalBoard(int width, int height) {
        super(width, height);
        viewDirection = new ArrayList<Integer>();
        viewDirection.add(-1);
        viewDirection.add(0);
        viewDirection.add(1);
    }
 
    @Override
    public boolean isAlive(int x, int y) {
        if (!isInsideTheBoard(x, y)) {
            return false;
        }
 
        boolean[][] board = getBoard();
        return board[x][y];
    }
 
    @Override
    public void turnToLiving(int x, int y) {
        if (!isInsideTheBoard(x, y)) {
            return;
        }
 
        boolean[][] board = getBoard();
        board[x][y] = true;
    }
 
    @Override
    public void turnToDead(int x, int y) {
        if (!isInsideTheBoard(x, y)) {
            return;
        }
 
        boolean[][] board = getBoard();
        board[x][y] = false;
    }
 
    @Override
    public void initiateRandomCells(double probability) {
        Random rnd = new Random();
 
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                if (rnd.nextDouble() < probability) {
                    turnToLiving(x, y);
                } else {
                    turnToDead(x, y);
                }
            }
        }
    }
 
    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int livingNeighbours = 0;
 
        for (int xNeighbour : viewDirection) {
            for (int yNeigbour : viewDirection) {
                if (xNeighbour == 0 && yNeigbour == 0) {
                    continue;
                }
 
                if (!isAlive(x + xNeighbour, y + yNeigbour)) {
                    continue;
                }
 
                livingNeighbours++;
            }
        }
 
        return livingNeighbours;
    }
 
    @Override
    public void manageCell(int x, int y, int neighbours) {
        if (!isAlive(x, y)) {
            if (neighbours == 3) {
                turnToLiving(x, y);
            }
 
            return;
        }
 
        if (neighbours < 2 || neighbours > 3) {
            turnToDead(x, y);
        }
    }
 
    public boolean isInsideTheBoard(int x, int y) {
        if (x >= getWidth() || x < 0) {
            return false;
        }
 
        if (y >= getHeight() || y < 0) {
            return false;
        }
 
        return true;
    }
}
*/