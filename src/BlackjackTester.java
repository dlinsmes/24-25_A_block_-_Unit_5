public class BlackjackTester {
    public static void main(String [] args) {
        BlackjackPlayer b = new BlackjackPlayer("lebron");

        System.out.println(b.getName());
        System.out.println(b);

        Card something = new Card("diamonds", 1);

        b.addCard(something);

        System.out.println(b);

        Card otherThing = new Card("spades", 9);

        b.addCard(otherThing);

        System.out.println(b);

        System.out.println(b.getScore());

        Card jack = new Card("spades", 11);
        b.addCard(jack);


        b.addCard(something);
        System.out.println(b);

        b.addCard(something);
        System.out.println(b);

        b.addCard(something);
        System.out.println(b);
    }
}
