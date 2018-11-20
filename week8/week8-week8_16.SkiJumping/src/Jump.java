
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Jump {

    private Random random;
    private int jump;
    private List<Integer> votes;

    public Jump() {
        votes = new ArrayList<Integer>();
    }

    public void goJump() {
        int i = 0;
        while (i < 5) {
            votes.add(randomInt(10, 20));
            i++;
        }
        this.jump = randomInt(60, 120);
    }

    public int randomInt(int min, int max) {
        random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public int getJump() {
        return jump;
    }

    public int getScore() {
        Collections.sort(votes);
        int sum = 0;
        //add the votes up after sorting
        for (Integer item : votes) {
            sum += item;
        }

        //remove the lowest and highest scores
        sum -= Collections.min(votes);
        sum -= Collections.max(votes);
        //add the jump length
        sum += jump;

        //for a score total
        return sum;
    }

    @Override
    public String toString() {
        return "" + votes;
    }
}

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Jump {
 
    private int length;
    private List<Integer> stylePoints;
 
    public Jump(int length, List<Integer> stylePoints) {
        this.length = length;
        this.stylePoints = stylePoints;
    }
 
    public int getLength() {
        return length;
    }
 
    public List<Integer> getStylePoints() {
        return this.stylePoints;
    }
 
    public int totalPoints() {
        int sumOfStylePoints = 0;
        for (int points : restrictedStylePoints()) {
            sumOfStylePoints += points;
        }
 
        return sumOfStylePoints + length;
    }
 
    private List<Integer> restrictedStylePoints() {
        List<Integer> restricted = new ArrayList(this.stylePoints);
        restricted.remove(Collections.max(this.stylePoints));
        restricted.remove(Collections.min(this.stylePoints));
        return restricted;
    }
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
 
        sb.append("    length: ").append(this.length).append("\n");
        sb.append("    judge votes: ").append(this.stylePoints);
  
        return sb.toString();
    }
}
*/
