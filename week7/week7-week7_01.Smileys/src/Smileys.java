
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString) {
        String smiley = ":)";
        int row = characterString.length() + 6;
        if ((row % 2) != 0) {
            characterString = characterString + " ";
            row += 2;
        }
        
        printSmileyRow(row/2);
        System.out.print(smiley + " " + characterString + " " + smiley + "\n");
        printSmileyRow(row/2);
        System.out.println("");
        
    }
    
    public static void printSmileyRow(int row) {
        String smiley = ":)";
        for (int i = 0; i < row; i++) {
            System.out.print(smiley);
        }
        System.out.print("\n");
    }
}

/*
public class Smileys {
 
    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
 
    private static void printWithSmileys(String characterString) {
        String middleString = createTheStringInTheMiddle(characterString);
        int number = middleString.length() / 2 + 2;
 
        printSmileys(number);
        System.out.println(":)" + middleString + ":)");
        printSmileys(number);
    }
 
    private static String createTheStringInTheMiddle(String characterString) {
        String returnCharacterString = " " + characterString + " ";
        if (characterString.length() % 2 == 1) {
            return returnCharacterString + " ";
        }
 
        return returnCharacterString;
    }
 
    private static void printSmileys(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(":)");
        }
 
        System.out.println("");
    }
}
*/
