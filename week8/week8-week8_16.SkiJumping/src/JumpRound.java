import java.util.*;
 
public class JumpRound {
 
    private int roundNumber;
    private List<Jumper> jumpOrder;
    private Map<Jumper, Jump> results;
 
    public JumpRound(int roundNumber, List<Jumper> jumpOrder) {
        this.roundNumber = roundNumber;
        this.jumpOrder = jumpOrder;
        this.results = new HashMap<Jumper, Jump>();
    }
 
    public List<Jumper> getJumpOrder() {
        return this.jumpOrder;
    }
 
    public int getRoundNumber() {
        return this.roundNumber;
    }
 
    public Jump getJump(Jumper jumper) {
        return this.results.get(jumper);
    }
 
    public void jump() {
        Random random = new Random();
 
        for (Jumper jumper : this.jumpOrder) {
            Jump jump = createJump(random);
            this.results.put(jumper, jump);
 
            jumper.addJump(jump);
        }
    }
 
    private Jump createJump(Random random) {
        List<Integer> jumpStylePoints = randomizeStylePoints(random);
        int hypynPituus = 60 + random.nextInt(61);
        return new Jump(hypynPituus, jumpStylePoints);
    }
 
    private List<Integer> randomizeStylePoints(Random random) {
        List<Integer> points = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            points.add(10 + random.nextInt(11));
        }
 
        return points;
    }
}