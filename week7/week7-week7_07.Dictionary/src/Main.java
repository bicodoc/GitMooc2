
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();
        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();

/*
//        Dictionary dictionary = new Dictionary();
        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("cembalo", "harpsichord");

        ArrayList<String> translations = dict.translationList();
        for (String translation : translations) {
            System.out.println(translation);
        }

        System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("porkkana"));
    }
*/
    }
}
