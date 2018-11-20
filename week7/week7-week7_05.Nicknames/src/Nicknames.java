
import java.util.HashMap;
//import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> nicknames = new HashMap<String, String>();
        
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");

        String translation = nicknames.get("mikael");
        System.out.println(translation);
    }
}

/*
import java.util.HashMap;
import java.util.Map;
 
public class Nicknames {
 
    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        Map<String, String> nicknames = new HashMap<String, String>();
        nicknames.put("matti", "mage");
        nicknames.put("arto", "arppa");
        nicknames.put("mikael", "mixu");
        System.out.println(nicknames.get("mikael"));
    }
}
*/