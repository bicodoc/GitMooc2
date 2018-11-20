package reader.criteria;

import java.util.List;

/**
 *
 * @author albertdavis
 */

public class AllLines implements Criterion {
    private String line;
    
    public AllLines() {
        this.line = line;        
    }

    @Override
    public boolean complies(String line) {
        return line.contains(line);
    }    
}
