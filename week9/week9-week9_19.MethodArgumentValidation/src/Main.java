
import java.util.Scanner;
import validation.*;

/**
 *
 * @author albertdavis
 */
public class Main {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int multiplier = input.nextInt();
        Calculator calc = new Calculator();
        calc.multiplication(multiplier);
        
        System.out.print("Enter a binomial set size: ");
        int setSize = input.nextInt();
        System.out.print("Enter a subset size: ");
        int subset = input.nextInt();
        calc.binomialCoefficient(setSize, subset);
        
        System.out.print("Enter a person's name: ");
        String name = input.next();
        System.out.print("Enter a person's age: ");
        int age = input.nextInt();
        Person person = new Person(name, age);
    }
}
