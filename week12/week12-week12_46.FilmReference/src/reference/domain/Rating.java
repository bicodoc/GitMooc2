package reference.domain;

/**
 *
 * @author albertdavis
 */

public enum Rating {
    BAD(-5),
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);
    private int val;
//    private String name;
    
    private Rating(int val) {
        this.val = val;
    }
    
    public int getValue() {
        return this.val;
    }
}



