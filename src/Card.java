public class Card {

    private String suit;
    private int value;
    private String rank;

    public Card (String suit, int value) {
        this.suit = suit;
        this.value = value;
        //need to assign value to all instance vars
        if (value == 1)
            rank = "ace";
        else if (value == 11)
            rank = "jack";
        else if (value == 12)
            rank = "queen";
        else if (value == 13)
            rank = "king";
        else
            //2-10 values - append int to string
            rank = "" + value;
    }

    //get methods
    public String getSuit() { return suit; }
    public String getRank() { return rank; }
    public int getValue() {return value; }

    //set methods aka mutators
    //-void return, param is optional - usually matches
    //the data type of the instance var
    public void setSuit(String newsuit) {
        suit = newsuit;
    }

    //toString is used when printing the object to avoid
    //printing the memory location
    public String toString() {
        return rank + " of " + suit;
    }
}
