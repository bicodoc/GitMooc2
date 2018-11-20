package reader.criteria;

/**
 *
 * @author albertdavis
 */

public class AtLeastOne implements Criterion {
    private Criterion[] criteria;
    
    public AtLeastOne(Criterion... c) {
        this.criteria = c;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion c : criteria) {
            if (c.complies(line)) {
                return true;
            }
        }        
        return false;
}
}
