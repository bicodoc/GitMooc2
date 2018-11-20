package reader;

import reader.criteria.AllLines;
import reader.criteria.AtLeastOne;
import reader.criteria.Both;
import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.LengthAtLeast;
import reader.criteria.Not;

public class Main {

    public static void main(String[] args) {
/*
        //original Main code
//        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new ContainsWord("beer");

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
*/
/*      //Section 47.1  All Lines
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new AllLines();

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }        
    }
*/
/*
        //Section 47.2 Ends With
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new EndsWithQuestionOrExclamationMark();

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
*/
/*
        //Section 47.3 Length at Least
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new LengthAtLeast(40);

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
*/
/*
        //Section 47.4 Both
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new Both(
                    new EndsWithQuestionOrExclamationMark(),
                    new ContainsWord("beer")
                );

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
*/
/*
        //Section 47.5 Not
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new Not( new LengthAtLeast(10) );

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
*/
///*
        //Section 47.6 At Least One
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion =new AtLeastOne(
                    new ContainsWord("beer"),
                    new ContainsWord("milk"),
                    new ContainsWord("oil")
                );
        
        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }    
}
