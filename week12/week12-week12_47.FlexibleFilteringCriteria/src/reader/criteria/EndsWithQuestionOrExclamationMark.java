package reader.criteria;

/**
 *
 * @author albertdavis
 */

public class EndsWithQuestionOrExclamationMark implements Criterion {
    private String line;

    public EndsWithQuestionOrExclamationMark() {
        this.line = line;
    }

    @Override
    public boolean complies(String line) {
        if (line.length() > 0) {
            return line.charAt(line.length() - 1) == '!' || line.charAt(line.length() - 1) == '?';
        }
        return false;
    }
}
