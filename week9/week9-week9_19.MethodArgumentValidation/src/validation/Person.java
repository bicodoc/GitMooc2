package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        try {
            if (name == null) {
                System.out.println("Name is null");
                throw new IllegalArgumentException("name cannot be \"null\" ");
            }
        } catch (NullPointerException e) {
            System.out.println(e + " NullPointerException caught");
        }
        
        if (name.equals("")) {
            throw new IllegalArgumentException("name cannot be \"\" ");
        }

        if (name.length() > 40) {
            throw new IllegalArgumentException("Name must be less than 40 characters");
        }
        
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age out of range");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

/*
package validation;
 
public class Person {
 
    private String name;
    private int age;
 
    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name of the person can't be null, empty or longer than 40 characters.");
        }
 
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("The age should be between [0-120].");
        }
 
        this.name = name;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
}
*/
