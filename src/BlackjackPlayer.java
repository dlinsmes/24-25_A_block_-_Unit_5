import java.util.ArrayList;
public class BlackjackPlayer {

    private ArrayList<Card> hand;
    private String name;

    public BlackjackPlayer(String name) {
        this.name = name;
        //need to call the ArrayList constructor to
        //initialize it and be able to add objects
        hand = new ArrayList<Card>();
    }

    public String getName() { return name; }

    public void addCard(Card c) {
        hand.add(c);
    }

    public String toString() {
        return "Name: " + name + "\nScore: " + getScore() + "\nHand: " + hand;
    }

    public int getScore() {
        //calculate the optimal score using the
        //cards in the hand
        //-numerical cards get a score the same as the value
        //-jqk are worth 10
        //-ace is 1 or 11 depending on which is more
        //beneficial to the player
        int score = 0;
        int nAces = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card current = hand.get(i);
            int currentValue = current.getValue();
            //face cards
            if (currentValue > 10)
                score += 10;
            else if (currentValue > 1)
                //numerical cards
                score += currentValue;
            else
                //ace
                //don't calculate ace values until AFTER
                //the rest of the hand has been accounted for
                nAces += 1;

        }
        //9 and one ace --> 20
        //9 and 2 aces --> 21
        //9 and 3 aces --> 12
        //9 and 4 aces --> 13

        //no more than one ace will count as 11
        //-if there are multiple aces, count all but one as a score of 1,
        //then figure out whether the last ace should be 1 or 11
        if(nAces > 1) {
            score += (nAces - 1);
            if (score + 11 > 21) {
                score += 1;
            }
            else {
                score += 11;
            }
        }
        if (nAces == 1) {
            if (score + 11 > 21) {
                score += 1;
            }
            else {
                score += 11;
            }
        }


        return score;
    }

}
