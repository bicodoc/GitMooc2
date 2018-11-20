package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author albertdavis
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> stringSet;
    private int duplicates;
    
    public PersonalDuplicateRemover() {
        stringSet = new HashSet<String>();
        duplicates = 0;
    }
    
    @Override
    public void add(String characterString) {
        boolean added = stringSet.add(characterString);
        if (!added) {
            duplicates++;
        }
    }
    
    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }
    
    @Override
    public Set<String> getUniqueCharacterStrings() {
        return stringSet;
    }
    
    @Override
    public void empty() {
        stringSet.clear();
        duplicates = 0;
        
    }
}

/*
package tools;
 
import java.util.HashSet;
import java.util.Set;
 
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> strings = new HashSet<String>();
    private int numberOfDuplicates;
 
    @Override
    public void add(String characterString) {
        boolean added = strings.add(characterString);
        if (!added) {
            numberOfDuplicates++;
        }
    }
 
    @Override
    public int getNumberOfDetectedDuplicates() {
        return numberOfDuplicates;
    }
 
    @Override
    public Set<String> getUniqueCharacterStrings() {
        return strings;
    }
 
    @Override
    public void empty() {
        strings.clear();
        numberOfDuplicates = 0;
    }
}
*/