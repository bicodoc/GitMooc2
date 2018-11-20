package reader.criteria;

/**
 *
 * @author albertdavis
 */

public class Both implements Criterion {
    private Criterion a;
    private Criterion b;
    
        public Both(Criterion a, Criterion b) {
            this.a = a;
            this.b = b;
    }
    
    @Override
    public boolean complies(String line) {
        return a.complies(line) && b.complies(line);
    }
}
