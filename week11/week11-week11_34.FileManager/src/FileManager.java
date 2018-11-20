import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class FileManager {
    
    public List<String> read(String file) throws FileNotFoundException {
        List<String> readFile = new ArrayList<String>();
        File fileObject = new File(file);
        Scanner reader = new Scanner(fileObject);
        while (reader.hasNext()) {
            readFile.add(reader.nextLine());
        }
        return readFile;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (int i = 0; i < texts.size(); i++) {
            fileWriter.write(texts.get(i) + "\n");
        }
        fileWriter.close();
    }
}

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class FileManager {
 
    public List<String> read(String file) throws FileNotFoundException {
        Scanner reader = new Scanner(new File(file));
        List<String> lines = new ArrayList<String>();
 
        while (reader.hasNextLine()) {
            lines.add(reader.nextLine());
        }
        return lines;
    }
 
    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }
 
    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (String text : texts) {
            writer.write(text);
            writer.write("\n");
        }
        writer.close();
    }
}
*/