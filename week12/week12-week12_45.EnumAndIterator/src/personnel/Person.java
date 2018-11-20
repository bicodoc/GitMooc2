package personnel;

import java.util.List;

/**
 *
 * @author albertdavis
 */

public class Person {
    private String name;
    private Education title;
    
    public Person(String name, Education title) {
        this.name = name;
        this.title = title;        
    }
    
    public Education getEducation() {
        return title;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name + ", " + title;
    }
}

/*
package personnel;
 
public class Person {
 
    private String name;
    private Education education;
 
    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }
 
    @Override
    public String toString() {
        return name + ", " + education;
    }
 
    public Education getEducation() {
        return education;
    }
}
*/
