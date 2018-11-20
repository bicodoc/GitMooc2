package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private List<Vamp> vamps;
    private List<Vamp> removeVamps;
    private Scanner input;
    private int moveLength;
    private int turns;
    private boolean vampiresMove;
    private boolean gameOver;

    public Dungeon(int length, int height, int vampires, int turns, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        vamps = new ArrayList();
        removeVamps = new ArrayList();
        input = new Scanner(System.in);
        this.turns = turns;
        this.vampiresMove = vampiresMove;
        gameOver = false;
    }

    public void run() {
        Player player = new Player("@", 0, 0);
        makeVamps();
        drawBoard(length, height, player);
        while (gameOver == false) {
            playerMove(player, input);
            drawBoard(length, height, player);
        }
    }

    public void makeVamps() {
        while (vamps.size() < vampires) {
            Vamp newVamp = new Vamp("v", (int) (Math.random() * length - 1), (int) (Math.random() * height - 1));
            if (checkNewVamp(newVamp)) {
                vamps.add(newVamp);
            }
        }
    }

    public boolean checkNewVamp(Vamp newbie) {
        boolean addVamp = true;
        if (newbie.getX() == 0 && newbie.getY() == 0) {
            addVamp = false;
        }
        for (int i = 0; i < vamps.size(); i++) {
            if (newbie.getX() == vamps.get(i).getX() && newbie.getY() == vamps.get(i).getY()) {
                addVamp = false;
            }
        }
        return addVamp;
    }

    public void drawBoard(int length, int height, Player player) {
        System.out.println(turns + "\n");
        System.out.println(player);
        for (Vamp item : vamps) {
            System.out.println(item);
        }
        System.out.println("");
        int count = 0;
        while (count < height) {
            System.out.println(makeLine(length, height, player, vamps, count));
            count++;
        }
        System.out.println("");
    }

    public StringBuilder makeLine(int length, int height, Player player, List<Vamp> vamps, int count) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < length; i++) {
            line.append(".");
        }
        if (player.getY() == count) {
            line.setCharAt(player.getX(), '@');
        }
        for (Vamp item : vamps) {
            if (item.getY() == count) {
                line.setCharAt(item.getX(), 'v');
            }
        }
        return line;
    }

    public void playerMove(Player player, Scanner input) {
        char step;
        String playerMoves = input.nextLine();
        moveLength = playerMoves.length();
        for (int i = 0; i < moveLength; i++) {
            step = playerMoves.charAt(i);
            if (step == 'w') {                      //up
                if (validatePY(player, -1)) {
                    player.setY(player.getY() - 1);
                }
            } else if (step == 's') {               //down
                if (validatePY(player, 1)) {
                    player.setY(player.getY() + 1);
                }
            } else if (step == 'a') {               //left
                if (validatePX(player, -1)) {
                    player.setX(player.getX() - 1);
                }
            } else if (step == 'd') {               //right
                if (validatePX(player, 1)) {
                    player.setX(player.getX() + 1);
                }
            }
            killVamps(player);
            vampsMove(player, 1);

        }
        removeVamps(removeVamps);
        if (vamps.size() == 0) {
            endGame();
        }
        this.turns--;
        if (turns == 0) {
            endGame();
        }
    }

    public boolean validatePY(Player player, int Y) {
        boolean onBoard = true;
        if (player.getY() + Y < 0 || player.getY() + Y > (height - 1)) {
            onBoard = false;
        }
        return onBoard;
    }

    public boolean validatePX(Player player, int X) {
        boolean onBoard = true;
        if (player.getX() + X < 0 || player.getX() + X > (length - 1)) {
            onBoard = false;
        }
        return onBoard;
    }

    public void killVamps(GamePiece player) {   //player moves to kill vamp
        for (Vamp item : vamps) {
            if (player.getX() == item.getX() && player.getY() == item.getY()) {
                removeVamps.add(item);
            }
        }
    }

    public void vampDeath(Player player, Vamp vamp) {      //vamp kills self by moving to player
        if (vamp.getX() == player.getX() && vamp.getY() == player.getY()) {
            removeVamps.add(vamp);
        }
    }

    public void removeVamps(List<Vamp> removeVamps) {
        for (Vamp item : removeVamps) {
            vamps.remove(item);
        }
    }

    public void vampsMove(Player player, int moveLength) {
        if (vampiresMove == true) {
            int dir;
            int count = 0;
            while (count < moveLength) {
                for (Vamp item : vamps) {
                    dir = (int) (Math.random() * 4 + 1);
                    if (dir == 1) {                         //up
                        if (movePrepY(item, -1)) {
                            item.setY(item.getY() - 1);
                            vampDeath(player, item);
                        }
                    } else if (dir == 2) {                  //down
                        if (movePrepY(item, 1)) {
                            item.setY(item.getY() + 1);
                            vampDeath(player, item);
                        }
                    } else if (dir == 3) {                  //left
                        if (movePrepX(item, -1)) {
                            item.setX(item.getX() - 1);
                            vampDeath(player, item);
                        }
                    } else if (dir == 4) {                  //right
                        if (movePrepX(item, 1)) {
                            item.setX(item.getX() + 1);
                            vampDeath(player, item);
                        }
                    }
                }
                count++;
            }
        }
        removeVamps(removeVamps);
        if (vamps.size() == 0) {
            endGame();
        }
    }

    public boolean movePrepX(Vamp vamp, int X) {  //onBoard?, not duplicate?; if returns true then proceed w/ move
        boolean doMove = true;
        for (Vamp item : vamps) {
            if (vamp.getX() + X == item.getX() && vamp.getY() == item.getY()) { //check for dupe
                doMove = false;
            }
            if (vamp.getX() + X < 0 || vamp.getX() + X >= length) {    //check for on board
                doMove = false;
            }
        }
        return doMove;
    }

    public boolean movePrepY(Vamp vamp, int Y) {  //onBoard?, not duplicate?; if returns true then proceed w/ move
        boolean doMove = true;
        for (Vamp item : vamps) {
            if (vamp.getY() + Y == item.getY() && vamp.getX() == item.getX()) { //check for dupe
                doMove = false;
            }
            if (vamp.getY() + Y < 0 || vamp.getY() + Y >= height) {    //check for on board
                doMove = false;
            }
        }
        return doMove;
    }

    public void endGame() {
        if (turns == 0) {
            gameOver = true;
            System.out.println("YOU LOSE");
        } else if (vamps.size() == 0) {
            gameOver = true;
            System.out.println("YOU WIN");
        }
//        System.exit(0);
    }
}

/*
package dungeon;
 
import java.util.Scanner;
 
public class Dungeon {
 
    private Game game;
 
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.game = new Game(length, height, vampires, moves, vampiresMove);
    }
 
    public void run() {
 
        Scanner reader = new Scanner(System.in);
 
        while (!game.finished()) {
            System.out.println(game.situation());
 
            String command = reader.nextLine();
 
            game.execute(command);
        }
 
        if (game.didThePlayerWin()) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }
    }
}
*/
