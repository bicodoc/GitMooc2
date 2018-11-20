
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class Printer {
    private String filename = "src/textfile.txt";
    private Scanner input;

    public Printer(String filename) throws Exception {
        this.filename = filename;
        
    }

    public void printLinesWhichContain(String word) throws Exception {
        File file = new File(filename);
        input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
        input.close();
    }
}

/*
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Printer { 
    private List<String> lines;
 
    public Printer(String t) throws Exception {
        Scanner tdst = new Scanner(new File(t));
        lines = new ArrayList<String>();
 
        while (tdst.hasNextLine()) {
            lines.add(tdst.nextLine());
        }
    }
 
    public void printLinesWhichContain(String word) {
        for (String line : lines) {
            if (word.isEmpty() || line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}
*/