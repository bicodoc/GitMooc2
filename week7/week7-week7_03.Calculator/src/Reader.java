/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author albertdavis
 */
public class Reader {
    private Scanner reader;

    
    public Reader() {
        reader  = new Scanner(System.in);
    }
    
    public String readString() {
        return reader.nextLine();
    }
        
    public int readInteger() {
        return Integer.parseInt(reader.nextLine());
    }
}

/*
import java.util.Scanner;
 
public class Reader {
 
    private Scanner reader;
 
    public Reader() {
        reader = new Scanner(System.in);
    }
 
    public String readString() {
        return reader.nextLine();
    }
 
    public int readInteger() {
        return Integer.parseInt(reader.nextLine());
    }
}
*/
