import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Dictionary {
    private HashMap<String, String> wordList;
    
    public Dictionary() {
        this.wordList = new HashMap<String, String>();
}
    
    public String translate(String word) { //translate finnish word to english
        stringCleaner(word);
        if(this.wordList.containsKey(word)) {
            return this.wordList.get(word);
        } 
        return null;        
    }
    
        public ArrayList<String> translationList() {  //print a list of all the value(finnish)/key(english) pairs in the dictionary
        ArrayList<String> translations = new ArrayList<String>();
        for ( String key : wordList.keySet() ) {
            translations.add(key + " = " + wordList.get(key));
        }
        return translations;
    }
    
    public void add(String word, String translation) {  //add a finnish word and the english translation to the dictionary
        stringCleaner(word);
        stringCleaner(translation);
        wordList.put(word, translation);
    }
    
    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
    
    public int amountOfWords() {  //print number of word pairs in the dictionary
        return wordList.size();
    }
}

/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Dictionary {
 
    private Map<String, String> translations; 
    public Dictionary() {
        this.translations = new HashMap<String, String>();
    }
 
    public String translate(String word) {
        return this.translations.get(word);
    }
 
    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
 
    public List<String> translationList() {
        List<String> translationList = new ArrayList<String>();
        for (String key : this.translations.keySet()) {
            String translation = key + " = " + this.translations.get(key);
            translationList.add(translation);
        }
 
        return translationList;
    }
 
    public int amountOfWords() {
        return this.translations.size();
    }
}
*/