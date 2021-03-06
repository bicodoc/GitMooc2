package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author albertdavis
 */

public class Employees {
    private List<Person> persons;

    public Employees() {
        persons = new ArrayList<Person>();
    }

    public void add(Person person) {
        persons.add(person);
    }
    
    public void add(List<Person> persons) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            this.persons.add(iterator.next());
        }
    }
    
    public void print() {
        for (Person item : persons) {
            System.out.println(item);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }
        
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}

/*
package personnel;

 

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;
 
public class Employees {
 
    private List<Person> persons;
 
    public Employees() {
        persons = new ArrayList<Person>();
    }
 
    public void add(Person person) {
        persons.add(person);
    }
 
    public void add(List<Person> persons) {
        for (Person person : persons) {
            add(person);
        }
    }
 
    public void print() {
        Iterator<Person> iterator = persons.iterator();
 
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
 
    }
 
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
 
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
 
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
 
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
*/
