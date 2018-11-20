


import java.util.ArrayList;
import java.util.List;

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int points;
    private List<Integer> jumps;

    public Jumper(String name) {
        this.name = name;
        jumps = new ArrayList<Integer>();
    }

    public void addJump(int points, int jump) {
        this.points += points;
        jumps.add(jump);
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Jumper jumper) {
        return jumper.points - this.points;
        }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return name + " (" + points + " points)";
    }

    public void printJumps() {
        System.out.print("            jump lengths: ");        
        int i = 0;
        for (Integer item : jumps) {
            if (i < jumps.size() - 1) {
                System.out.print(item + "m, ");
            } else {
                System.out.print(item + "m");
            }
            System.out.print("");
            i++;
        }
    }
}

/*
import java.util.ArrayList;
import java.util.List;
 
public class Jumper implements Comparable<Jumper> {
 
    private String name;
    private List<Jump> jumps;
 
    public Jumper(String name) {
        this.name = name;
        this.jumps = new ArrayList<Jump>();
    }
 
    public String getName() {
        return this.name;
    }
 
    public void addJump(Jump jump) {
        this.jumps.add(jump);
    }
 
    public int totalPoints() {
        int points = 0;
        for (Jump jump : this.jumps) {
            points += jump.totalPoints();
        }
 
        return points;
    }
 
    public List<Jump> getJumps() {
        return jumps;
    }
 
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
 
        if (getClass() != object.getClass()) {
            return false;
        }
 
        Jumper comparable = (Jumper) object;
 
        if (this.name == null || !this.name.equals(comparable.getName())) {
            return false;
        }
 
        return true;
    }
 
    @Override
    public int hashCode() {
        if (this.name == null) {
            return 7;
        }
 
        return this.name.hashCode();
    }
 
    @Override
    public int compareTo(Jumper t) {
        return this.totalPoints() - t.totalPoints();
    }
 
    @Override
    public String toString() {
        int totalPoints = this.totalPoints();
        if (totalPoints == 1) {
            return this.name + " (" + totalPoints + " point)";
        }
 
        return this.name + " (" + totalPoints + " points)";
    }
}*/
