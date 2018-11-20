package reader.criteria;

/**
 *
 * @author albertdavis
 */

public class LengthAtLeast implements Criterion {
    private int len;

    public LengthAtLeast(int len) {
        this.len = len;
    }
        
    @Override
    public boolean complies(String line) {
        return line.length() > len;
    }
}
