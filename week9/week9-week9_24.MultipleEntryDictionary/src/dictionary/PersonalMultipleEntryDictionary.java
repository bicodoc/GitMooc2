package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author albertdavis
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;
    
    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
    }
    
    @Override
    public void add(String word, String entry) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, new HashSet<String>());
        }
        
        Set<String> finished = this.dictionary.get(word);
        finished.add(entry);
    }
    
    @Override
    public Set<String> translate(String word) {
        if (!dictionary.containsKey(word)) {
            return null;
        } else {
            return dictionary.get(word);
        }
    }
    
    @Override
    public void remove(String word) {
            if (dictionary.containsKey(word)) {
                dictionary.remove(word);
            }
    }
    
}
