
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author albertdavis
 */
public class PhoneBook {

    private String name;
    private String phoneNum;
    private String street;
    private String city;
    private Map<String, List<String>> numMap;
    private Map<String, String> address;
    private List<String> nums;
    private List<String> values;
    private List<String> widgets;

    public PhoneBook() {
        this.name = name;
        this.phoneNum = phoneNum;
        this.numMap = new HashMap();
        this.address = new HashMap();
        this.values = new ArrayList();
        this.widgets = new ArrayList();
        this.nums = new ArrayList();
    }

    public void addNum(String name, String phoneNum) {          //add new phone#
        if (!numMap.containsKey(name)) {
            numMap.put(name, new ArrayList());
        }
        this.nums = numMap.get(name);
        nums.add(phoneNum);
    }

    public List<String> numsByPerson(String name) {             //given name, return number
        if (numMap.containsKey(name)) {
            nums = numMap.get(name);
            return nums;
        } else {
            System.out.println(" not found");
            return null;
        }
    }

    public void searchByPhoneNum(String phoneNum) {             //given number, return name
        Set<String> names = numMap.keySet();
        for (String item : names) {
            for (int i = 0; i < names.size(); i++) {
                if (numMap.get(item).get(i).equals(phoneNum)) {
                    System.out.println(" " + item);
                    return;
                }
            }
        }
        System.out.println(" not found");
    }

    public void addAddress(String name, String street, String city) {
        if (!numMap.containsKey(name)) {
            numMap.put(name, new ArrayList());
        }
        String addr = street + " " + city;
        address.put(name, addr);
    }

    public void searchForPersInfo(String name) {                //do all the printing here
        if (numMap.containsKey(name)) {

            if (address.get(name) == null) {
                System.out.println("  address unknown");
            }

            if (!(address.get(name) == null)) {
                System.out.print("  address: ");
                System.out.println(address.get(name));
            }

            System.out.println("  phone numbers:");
            if (!(numsByPerson(name).isEmpty())) {
                for (int i = 0; i < nums.size(); i++) {
                    String item = numsByPerson(name).get(i);
                    System.out.println("   " + item);
                }
            } else {
                System.out.println("   phone number not found");
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void delInfo(String name) {
        if (numMap.containsKey(name)) {
            numMap.remove(name);
        }
        if (address.containsKey(name)) {
            address.remove(name);
        }
    }

    public void filteredList(String keyWord) {
        boolean found = false;
        widgets.clear();
        widgets.addAll(numMap.keySet());
        Collections.sort(widgets);
        if (keyWord.equals("")) {                               //print all if keyWord is empty
            Collections.sort(widgets);
            for (String item : widgets) {
                System.out.println(" " + item);
                searchForPersInfo(item);
                System.out.println("");
            }
            return;
        }
        
        for (String item : widgets) {                           //widgets is the list of all names
            if (item.contains(keyWord)) {
                found = true;
                System.out.println(" " + item);
                searchForPersInfo(item);
            } else if (!(address.get(item) == null) && (address.get(item).contains(keyWord))) {
                found = true;
                System.out.println(" " + item);
                searchForPersInfo(item);
            } 
        }
        if (found == false) {
            System.out.println(" keyword not found");
        }
    }
}

/*
package phonesearch;
 
import phonesearch.logic.NumberAndAddressService;
import java.util.*;
import phonesearch.logic.Person;
 
public class PhoneSearch {
 
    private Scanner reader;
    private Map<String, String> commands;
    private NumberAndAddressService service;
 
    public PhoneSearch(Scanner reader) {
        this.reader = reader;
        service = new NumberAndAddressService();
 
        commands = new TreeMap<String, String>();
        commands.put("1", "1 add a number");
        commands.put("2", "2 search for a number");
        commands.put("3", "3 search for a person by phone number");
        commands.put("4", "4 add an address");
        commands.put("5", "5 search for personal information");
        commands.put("6", "6 delete personal information");
        commands.put("7", "7 filtered listing");
        commands.put("x", "x quit");
    }
 
    public void start() {
        System.out.println("phone search");
        printInstructions();
        while (true) {
            System.out.println();
            System.out.print("command: ");
            String command = reader.nextLine();
            if (!commands.keySet().contains(command)) {
                System.out.println("invalid command.");
                printInstructions();
            }
 
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addNumber();
            } else if (command.equals("2")) {
                getNumbers();
            } else if (command.equals("3")) {
                getPerson();
            } else if (command.equals("4")) {
                addAddress();
            } else if (command.equals("5")) {
                getPersonalInformation();
            } else if (command.equals("6")) {
                deletePerson();
            } else if (command.equals("7")) {
                list();
            }
 
        }
    }
 
    private void getNumbers() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        Collection<String> numbers = service.getPhoneNumbers(name);
        if (numbers.isEmpty()) {
            System.out.println("  not found");
            return;
        }
 
        for (String number : numbers) {
            System.out.println(" " + number);
        }
    }
 
    private void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        service.addPhoneNumber(name, number);
    }
 
    private void printInstructions() {
        System.out.println("available operations: ");
        for (String command : commands.values()) {
            System.out.println(" " + command);
        }
    }
 
    private void getPerson() {
        System.out.print("number: ");
        String number = reader.nextLine();
        String name = service.getName(number);
        if (name == null) {
            System.out.println(" not found");
            return;
        }
        System.out.println(" " + name);
    }
 
    private void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        service.addAddress(name, street, city);
    }
 
    private void getPersonalInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        Person person = service.searchByName(name);
        if (person == null) {
            System.out.println("  not found");
            return;
        }
 
        printPersonalInformation(person);
    }
 
    private void printPersonalInformation(Person person) {
        printAddress(person);
        printPhoneNumbers(person);
    }
 
    private void printAddress(Person person) {
        if (person.getStreet() == null || person.getCity() == null) {
            System.out.println("  address unknown");
            return;
        }
 
        System.out.println("  address: " + person.getStreet() + " " + person.getCity());
    }
 
    private void printPhoneNumbers(Person person) {
        if (person.getPhoneNumbers().isEmpty()) {
            System.out.println("  phone number not found");
            return;
        }
 
        System.out.println("  phone numbers:");
        for (String number : person.getPhoneNumbers()) {
            System.out.println("   " + number);
        }
    }
 
    private void deletePerson() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        service.remove(name);
    }
 
    private void list() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        Set<Person> found = service.get(keyword);
        if (found.isEmpty()) {
            System.out.println(" keyword not found");
            return;
        }
 
        for (Person h : service.get(keyword)) {
            System.out.println();
            System.out.println(" " + h.getName());
            printPersonalInformation(h);
        }
    }
}

================================ New Class - NumberAndAddressService ================
package phonesearch.logic;
 
import java.util.*;
 
public class NumberAndAddressService {
 
    private Map<String, Person> personsByName;
    private Map<String, Person> personsByPhoneNumber;
 
    public NumberAndAddressService() {
        personsByName = new TreeMap<String, Person>();
        personsByPhoneNumber = new TreeMap<String, Person>();
    }
 
    public void addPhoneNumber(String name, String number) {
        Person person = searchAndCreateIfDoesntExist(name);
 
        person.addPhoneNumber(number);
        personsByPhoneNumber.put(number, person);
    }
 
    public Collection<String> getPhoneNumbers(String name) {
        Person person = personsByName.get(name);
        if (person == null) {
            return new ArrayList<String>();
        }
 
        return personsByName.get(name).getPhoneNumbers();
    }
 
    public String getName(String number) {
        Person person = personsByPhoneNumber.get(number);
        if (person == null) {
            return null;
        }
 
        return personsByPhoneNumber.get(number).getName();
    }
 
    public void addAddress(String name, String street, String city) {
        Person person = searchAndCreateIfDoesntExist(name);
        person.setAddress(street, city);
    }
 
    public Person searchByName(String name) {
        for (Person h : personsByName.values()) {
            if (h.getName().equals(name)) {
                return h;
            }
        }
        return null;
    }
 
    private Person searchAndCreateIfDoesntExist(String name) {
        Person person = searchByName(name);
        if (person == null) {
            person = new Person(name);
            personsByName.put(name, person);
        }
        return person;
    }
 
    public void remove(String name) {
        Person h = searchByName(name);
 
        if (h == null) {
            return;
        }
 
        for (String number : h.getPhoneNumbers()) {
            personsByPhoneNumber.remove(number);
        }
 
        personsByName.remove(name);
    }
 
    public Set<Person> get(String keyword) {
        Set<Person> found = new TreeSet<Person>();
 
        for (Person person : personsByName.values()) {
            if (entryExists(person, keyword)) {
                found.add(person);
            }
        }
 
        return found;
    }
 
    private boolean entryExists(Person person, String keyword) {
        String lowerCaseKeyword = keyword.toLowerCase();
 
        if (person.getName().toLowerCase().contains(lowerCaseKeyword)) {
            return true;
        } else if (person.getStreet() != null && person.getStreet().toLowerCase().contains(lowerCaseKeyword)) {
            return true;
        }
        return person.getCity() != null && person.getCity().toLowerCase().contains(lowerCaseKeyword);
    }
}

================================ New Class - Person ===========================

package phonesearch.logic;
 
import java.util.*;
 
public class Person implements Comparable<Person> {
 
    private String name;
    private Set<String> phoneNumbers;
    private String street;
    private String city;
 
    public Person(String name) {
        this.name = name;
        phoneNumbers = new TreeSet<String>();
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }
 
    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
 
    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }
 
    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }
 
    @Override
    public String toString() {
        return name + " " + phoneNumbers;
    }
 
    @Override
    public int compareTo(Person t) {
        return name.compareTo(t.name);
    }
}
*/