
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class UserInterface {

    private String name;
    private String phoneNum;
    private Scanner input;

    public UserInterface() {
        this.name = name;
        this.phoneNum = phoneNum;
//        String reader = "1\n" + "al\n" + "8185\n" +
//                "1\n" + "al\n" + "9876\n" +
//                "1\n" + "max\n" + "6380\n" +
//                "1\n" + "max\n" + "1234\n" +
//                "4\n" + "al\n" + "forest\n" + "atlanta\n" +
//                "4\n" + "max\n" + "brook\n" + "camden\n";
        this.input = new Scanner(System.in);
        System.out.println("phone search");
    }

    public void showMenu() {
        System.out.println("available operations:");
        System.out.println(" 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        getMenuChoice();
    }

    public void getMenuChoice() {
        PhoneBook newPB = new PhoneBook();
        while (true) {
            System.out.print("\ncommand: ");
            String choice = input.nextLine();
            if (choice.equals("1")) {
                System.out.print("whose number: ");
                name = input.nextLine();
                System.out.print("number: ");
                phoneNum = input.nextLine();
                newPB.addNum(name, phoneNum);
            } else if (choice.equals("2")) {
                System.out.print("whose number: ");
                name = input.nextLine();
                if (!(newPB.numsByPerson(name) == null)) {
                    for (int i = 0; i < newPB.numsByPerson(name).size(); i++) {
                        String item = newPB.numsByPerson(name).get(i);
                        System.out.println(" " + item);
                    }
                }
            } else if (choice.equals("3")) {
                System.out.print("number: ");
                phoneNum = input.nextLine();
                newPB.searchByPhoneNum(phoneNum);                
            } else if (choice.equals("4")) {
                System.out.print("whose address: ");
                name = input.nextLine();
                System.out.print("street: ");
                String street = input.nextLine();                
                System.out.print("city: ");                
                String city = input.nextLine();
                newPB.addAddress(name, street, city);
            } else if (choice.equals("5")) {
                System.out.print("whose information: ");
                name = input.nextLine();
                newPB.searchForPersInfo(name);
            } else if (choice.equals("6")) {
                System.out.print("whose information: ");
                name = input.nextLine();
                newPB.delInfo(name);
            } else if (choice.equals("7")) {
                System.out.print("keyword (if empty, all listed): ");
                name = input.nextLine();
                System.out.println("");
                newPB.filteredList(name);
            }
            
            else if (choice.equals("x")) {
                break;
            }
        }
    }
}
