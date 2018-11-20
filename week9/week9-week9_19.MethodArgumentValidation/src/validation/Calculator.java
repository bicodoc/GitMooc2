package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        while (true) {
            if (fromInteger < 0) {
                throw new IllegalArgumentException("multiplier must be greater than 0");
            } else {
                break;
            }
        }

        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        while (true) {
            if (setSize < 0 || subsetSize < 0) {
                throw new IllegalArgumentException("set and subset must be greater than 0");                
            } else if (setSize < subsetSize) {
                throw new IllegalArgumentException("subsetSize must be smaller tha setSize");
            } else {
                break;
            }
        }

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}

/*
package validation;
 
public class Calculator {
 
    public int multiplication(int fromInteger) {
        if (fromInteger < 0) {
            throw new IllegalArgumentException("Multiplication can be calculated only for non-negative integers.");
        }
 
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }
 
        return multiplication;
    }
 
    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0) {
            throw new IllegalArgumentException("Size of the set must be zero or bigger when calculating " +
                                               "binomial coefficient.");
        }
 
        if (subsetSize < 0) {
            throw new IllegalArgumentException("Size of the subset must be zero or bigger when calculating " +
                                               "binomial coefficient.");
        }
 
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("Size of the set must be bigger than the size of the subset " +
                                               "when calculating binomial coefficient.");
        }
 
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);
 
        return numerator / denominator;
    }
}
*/
