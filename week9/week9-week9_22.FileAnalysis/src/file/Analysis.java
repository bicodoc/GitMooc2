package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class Analysis {

    private File file;
    private Scanner input;
    private List<String> lines;

    public Analysis(File file) throws Exception {
        this.file = file;
        lines = new ArrayList();
    }

    public int lines() throws Exception {
        Scanner input = new Scanner(file);

        int numlines = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            lines.add(line);
            numlines++;
        }
        input.close();
        return numlines;
    }

    public int characters() throws Exception {
        Scanner reader = new Scanner(file);
        int lineChars = 0;
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            lineChars += line.length() + 1;
        }
        reader.close();
        return lineChars;
    }
}

/*
package file;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Analysis { 
    private File file;
 
    public Analysis(File file) {
        this.file = file;
    }
 
    public int lines() {
        String content = readFile();
        return content.split("\n").length;
    }
 
    public int characters() {
        String content = readFile();
        return content.length();
    }
 
    private String readFile() {
        try {
            String str = "";
 
            Scanner reader = new Scanner(file);
 
            while (reader.hasNextLine()) {
                str += reader.nextLine();
                str += "\n";
            }
 
            return str;
        } catch (FileNotFoundException ex) {
            return "";
        }
    }
}
*/
