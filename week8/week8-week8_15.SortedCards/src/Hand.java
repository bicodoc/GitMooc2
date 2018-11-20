
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author albertdavis
 */
public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue() );
    }
    
    public List<Card> getHand() {
        return hand;
    }

    public int compareTo(Hand other) {
        int handVal = 0;
        int otherVal = 0;
        for (Card vals : hand) {
            handVal += vals.getValue();
        }
        for (Card vals : other.getHand()) {
            otherVal += vals.getValue();
        }
        return handVal - otherVal;        
    }
    
    
}

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Hand implements Comparable<Hand> {
 
    private List<Card> cards = new ArrayList<Card>();
 
    public void add(Card k) {
        cards.add(k);
    }
 
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
 
    public void sort() {
        Collections.sort(cards);
    }
 
    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
 
    private int sumOfThevalues() {
        int s = 0;
 
        for (Card card : cards) {
            s += card.getValue();
        }
 
        return s;
    }
 
    @Override
    public int compareTo(Hand t) {
        return this.sumOfThevalues() - t.sumOfThevalues();
    }
}
*/