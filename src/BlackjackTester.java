public class BlackjackTester {
    public static void main(String [] args) {
        BlackjackPlayer b = new BlackjackPlayer("lebron");

        System.out.println(b.getName());
        System.out.println(b);

        Card something = new Card("diamonds", 10);

        b.addCard(something);

        System.out.println(b);

        Card otherThing = new Card("spades", 13);

        b.addCard(otherThing);

        System.out.println(b);

        System.out.println(b.getScore());


    }
}
