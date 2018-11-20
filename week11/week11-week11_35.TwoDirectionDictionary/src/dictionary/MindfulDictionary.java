package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class MindfulDictionary {

    private Map<String, String> words;
    private String word;
    private String file;

    public MindfulDictionary() {
        words = new HashMap();
    }

    public MindfulDictionary(String file) {
        words = new HashMap();
        this.file = file;
    }
    
    public void add(String word, String translation) {
        words.putIfAbsent(word, translation);
    }

    public String translate(String word) {
            if (words.containsKey(word)) {
                return words.get(word);
            } else if (words.containsValue(word)) {
                for (String item : words.keySet()) {
                    if (words.get(item).equals(word)) {
                        return item;
                    }
                }
            }
        return words.get(word);
    }

    public void remove(String word) {
        HashMap<String, String> removeIt = new HashMap();

        if (words.containsKey(word)) {
            words.remove(word, words.get(word));
        } else if (words.containsValue(word)) {
            for (String item : words.keySet()) {
                if (words.get(item).equals(word)) {
                    removeIt.put(item, words.get(item));
                }
            }
            removeIt(removeIt);
            removeIt.clear();
        }
    }

    public void removeIt(HashMap<String, String> trash) {
        for (String item : trash.keySet()) {
            words.remove(item, words.get(item));
        }
    }

    public boolean load() {
        File newFile = new File(file);
        try {
        Scanner fileReader = new Scanner(newFile);
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(":");   // the line is split at :
            words.put(parts[0], parts[1]);
        }
        } catch (Exception e) {
            System.out.println("We couldn't read the file. Error: " + e.getMessage());
        }
        return true;
    }
    
    public boolean save() {
        try {
            FileWriter writer = new FileWriter(file);
            for (String item : words.keySet()) {
                String writeItem = item + ":" + words.get(item);
                writer.write(writeItem + "\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("We couldn't write the file. Error: " + e.getMessage());
        }
    return true;
    }
    
    public Map getWords() {
        return words;
    }
}

/*
package dictionary;
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
 
public class MindfulDictionary {
 
    private Map<String, String> words;
    private String file;
 
    public MindfulDictionary() {
        words = new HashMap<String, String>();
    }
 
    public MindfulDictionary(String file) {
        this();
        this.file = file;
    }
 
    public boolean load() {
        try {
            Scanner reader = new Scanner(new File(file));
            readFileIntoDictionary(reader);
            reader.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
 
    public boolean save() {
        try {
            FileWriter writer = new FileWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
 
    public void add(String word, String translation) {
        if (words.containsKey(word)) {
            return;
        }
 
        words.put(word, translation);
        words.put(translation, word);
    }
 
    public String translate(String word) {
        return words.get(word);
    }
 
    public void remove(String word) {
        String translation = translate(word);
 
        words.remove(word);
        words.remove(translation);
    }
 
    private void readFileIntoDictionary(Scanner reader) {
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] parts = line.split(":");
 
            words.put(parts[0], parts[1]);
            words.put(parts[1], parts[0]);
        }
    }
 
    private void saveWords(FileWriter writer) throws IOException {
        List<String> alreadyInFile = new ArrayList<String>();
 
        for (String word : words.keySet()) {
 
            String translation = words.get(word);
 
            if (!alreadyInFile.contains(word)) {
                String pair = word + ":" + words.get(word);
                writer.write(pair + "\n");
                alreadyInFile.add(translation);
            }
        }
    }
}
*/