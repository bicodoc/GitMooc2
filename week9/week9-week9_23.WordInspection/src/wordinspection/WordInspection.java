package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class WordInspection {

    private File file;
    private Scanner input;
    private List<String> words;

    public WordInspection(File file) throws Exception {
        input = new Scanner(file, "UTF-8");
        words = new ArrayList();
        while (input.hasNext()) {
            words.add(input.next());
                }

    }

    public int wordCount() {
        int counter = 0;
        for (String item : words) {
            counter++;
        }
        return counter;
    }

    public List<String> wordsContainingZ() {
        List<String> zWords = new ArrayList();
        for (String item : words) {
            if (item.contains("z")) {
                zWords.add(item);
            }
        }
        return zWords;
    }
    

    public List<String> wordsEndingInL() {
        List<String> LWords = new ArrayList();
        for (String item : words) {
            if (item.endsWith("l")) {
                LWords.add(item);
            }
        }
        return LWords;
    }

    public List<String> palindromes() {
        List<String> palWord = new ArrayList();
        for (String item : words) {
            String revWord = "";
            for (int i = (item.length() - 1); i >= 0; i--) {
                revWord += item.charAt(i);
            }
            if (revWord.equals(item)) {
                palWord.add(item);
            }
        }
        return palWord;
    }

    public List<String> wordsWhichContainAllVowels() { // aeiouyäö
        List<String> vowels = new ArrayList();
        for (String item : words) {
            if (item.contains("a")) {
                if (item.contains("e")) {
                    if (item.contains("i")) {
                        if (item.contains("o")) {
                            if (item.contains("u")) {
                                if (item.contains("y")) {
                                    if (item.contains("ä")) {
                                        if (item.contains("ö")) {
                                            vowels.add(item);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return vowels;
    }
}

/*
package wordinspection;
 
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class WordInspection { 
    private final String vowels = "aeiouyäö";
    private List<String> words;
 
    public WordInspection(File file) {
        try {
            this.words = readWords(file);
        } catch (Exception e) {
            this.words = new ArrayList<String>();
        }
    }
 
    private List<String> readWords(File file) throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> readLines = new ArrayList();
 
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            line = line.trim();
 
            if (!line.isEmpty()) {
                readLines.add(line);
            }
        }
        return readLines;
    }
 
    public int wordCount() {
        return this.words.size();
    }
 
    public List<String> wordsContainingZ() {
        List<String> toBeReturned = new ArrayList<String>();
        for (String word : this.words) {
            if (word.contains("z")) {
                toBeReturned.add(word);
            }
        } 
        return toBeReturned;
    }
 
    public List<String> wordsEndingInL() {
        List<String> toBeReturned = new ArrayList<String>();
        for (String word : this.words) {
            if (word.endsWith("l")) {
                toBeReturned.add(word);
            }
        } 
        return toBeReturned;
    }
 
    public List<String> palindromes() {
        List<String> toBeReturned = new ArrayList<String>();
        for (String word : this.words) {
            if (word.equals(reverse(word))) {
                toBeReturned.add(word);
            }
        } 
        return toBeReturned;
    }
 
    private String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
 
    public List<String> wordsWhichContainAllVowels() {
        List<String> toBeReturned = new ArrayList<String>();
        for (String word : this.words) {
            if (containsAllVowels(word)) {
                toBeReturned.add(word);
            }
        } 
        return toBeReturned;
    }
 
    private boolean containsAllVowels(String word) {
        for (char vowel: this.vowels.toCharArray()) {
            if (!word.contains("" + vowel)) {
                return false;
            }
        }
        return true;
    }
}
*/