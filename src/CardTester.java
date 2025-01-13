public class CardTester {
    public static void main(String [] args) {

        Card c = new Card("spades", 12);

        //call the mutator for suit
        c.setSuit("diamonds");

        System.out.println(c);

        System.out.println();

        //create a deck
        Deck d = new Deck();

        System.out.println(d);

        System.out.println();

        d.shuffle();
        System.out.println(d);

        Card [] hand = new Card[5];
        //draw 5 cards from the deck and save to hand
        //print hand to check

        for (int i = 0; i < 5; i++) {
            //hand[i] = d.draw();

            //same as:
            Card newCard = d.draw();
            hand[i]= newCard;
        }

        System.out.println();

        for(Card ca: hand) {
            //print the toString of each card in the hand
            System.out.println(ca);
        }
    }
}
