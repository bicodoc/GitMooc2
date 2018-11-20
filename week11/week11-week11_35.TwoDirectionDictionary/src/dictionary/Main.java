package dictionary;

public class Main {

    public static void main(String[] args) {
        // Test your dictionary here

/*        
      // section 35.2  
        MindfulDictionary dict = new MindfulDictionary();
        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("ohjelmointi", "programming");
        dict.add("alla oleva", "below");
        dict.remove("apina");
        dict.remove("banana");
        dict.remove("alla oleva");

        System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("monkey"));
        System.out.println(dict.translate("banana"));
        System.out.println(dict.translate("banaani"));
        System.out.println(dict.translate("ohjelmointi"));
        System.out.println(dict.translate("alla oleva"));
    }
}
*/

/*
    //section 35.3
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("ohjelmointi") );
        System.out.println( dict.translate("alla oleva") );
    }
}
*/


  //section 35.4
        MindfulDictionary dict = new MindfulDictionary("src/words_1.txt");
        dict.load();

        dict.add("tietokone", "computer");
        dict.remove("monkey");

        System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("ohjelmointi"));
//        System.out.println(dict.translate("alla oleva"));
        System.out.println(dict.translate("tietokone"));

        dict.save();
        
        }
    }

