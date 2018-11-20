
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = reader.nextLine();
        
        if (isAWeekDay(string)) {
            System.out.println("The form is fine");
        } else {
            System.out.println("The form is wrong");
        }
        
        if (allVowels(string)) {
            System.out.println("The form is fine");
        } else {
            System.out.println("The form is wrong");
        }
        
        if (clockTime(string)) {
            System.out.println("The form is fine");
        } else {
            System.out.println("The form is wrong");
        }
    }
    
    public static boolean isAWeekDay(String string) {
        return string.matches("sun|mon|tue|wed|thu|fri|sat");
    }
    
    public static boolean allVowels(String string) {
        return (string.matches("(a|e|i|o|u|ä|ö)*"));
    }
        
    public static boolean clockTime(String string) {
        return (string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]"));
    }
}

/*
public class Main {
    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
 
    public static boolean allVowels(String string) {
        return string.matches("[aeiouåäö]*");
    }
 
    public static boolean clockTime(String string) {
        return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
    }
 
    public static void main(String[] args) {
        // write test code here
    }
}
*/