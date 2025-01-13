//composition of Card objects - you need objects
//of another class to represent this
public class Deck {

    //objects or arrays can be instance vars
    private Card [] cards;

    private int top;

    public Deck() {
        top = 0;

        //populate the cards array with every
        // possible combination of cards

        //need to initialize the array length
        cards = new Card [52];

        //index of where we are in the deck
        int current = 0;

        //fill the array with objects
        for (int i = 1; i <= 13; i++) {
            Card n = new Card("spades", i);
            cards[current] = n;
            //don't use i (or i-1) bc the later loops
            //iterate through the same i values
            current++;
        }

        for (int i = 1; i <= 13; i++) {
            cards[current] = new Card("diamonds", i);
            current++;
        }

        for (int i = 1; i <= 13; i++) {
            cards[current] = new Card("clubs", i);
            current++;
        }

        for (int i = 1; i <= 13; i++) {
            cards[current] = new Card("hearts", i);
            current++;
        }

    }

    public void shuffle() {
        //randomize position
        for (int i = 0; i< 52; i++) {
            //i is one position
            //r is the random position
            //swap the cards at i and r
            int r = (int)(Math.random() * 52);

            //temp is whatever the data (class type) type of the array is
            Card temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
    }

    //output in sequence the individual toStrings of each card object
    public String toString() {
        String output = "deck:";
        for (int i = 0; i < 52; i++) {
            output += "\n" + cards[i].toString();
        }
        return output;
    }

    //draw method - methods can return objects
    public Card draw() {
        //need to return the card at top
        //AND advance the top position

        Card drawn = cards[top];
        top++;
        return drawn;

        //this wouldn't return the correct card
//        top++;
//        return cards[top];
    }
}
