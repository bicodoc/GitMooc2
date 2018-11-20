import java.util.Scanner;
import java.util.HashMap;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("  add - add a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the the user interface");

        System.out.print("\nStatement: ");

        while (true) {
            String command = reader.nextLine();
            if (command.equals("add")) {
                System.out.print("In Finnish: ");
                String finnWord = reader.nextLine();
                System.out.print("Translation: ");
                String engWord = reader.nextLine();
                dictionary.add(finnWord, engWord);
                System.out.println("");
            } else if (command.equals("translate")) {
                System.out.print("Give a word: ");
                String finnWord = reader.nextLine();
                System.out.println("translate: " + dictionary.translate(finnWord));
                System.out.println("");
            } else if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("list")) {
                System.out.println(dictionary.translationList());
            } else System.out.println("Unknown statement\n");
                System.out.print("Statement: ");
            }
        }
    }

/*
import java.util.Scanner;
 
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
 
    public TextUserInterface(Scanner reader, Dictionary dict) {
        this.reader = reader;
        this.dict = dict;
    }
 
    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
        System.out.println("");
 
        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            handleStatement(input);
            System.out.println("");
        }
 
        System.out.println("Cheers!");
    }
 
    private void handleStatement(String statement) {
        if (statement.equals("add")) {
            add();
        } else if (statement.equals("translate")) {
            translate();
        } else {
            System.out.println("Unknown statement.");
        }
    }
 
    private void add() {
        System.out.print("In Finnish: ");
        String word = this.reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        this.dict.add(word, translation);
    }
 
    private void translate() {
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
 
        if (this.dict.translate(word) == null) {
            System.out.println("Unknown word!");
        } else {
            System.out.println("Translation: " + this.dict.translate(word));
        }
    }
}
*/
