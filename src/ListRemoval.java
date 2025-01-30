import java.util.ArrayList;
public class ListRemoval {
    public static void main(String [] args) {

        ArrayList<String> words = new ArrayList<String> ();
        words.add("a");
        words.add("b");
        words.add("c");
        words.add("d");
        words.add("e");


        //doesn't work to remove all bc when a is removed, b is now ind 0, and i increases to 1
//        for (int i = 0; i < words.size(); i++) {
//            words.remove(i);
//        }

        //works
//        while (words.size() != 0)
//            words.remove(0);

        //works - keeps i at 0
//        for (int i = 0; i < words.size(); i++) {
//            words.remove(i);
//            i--;
//        }

        //works - remove from the end of the list so all other indices are unaltered
        for (int i = words.size()-1; i >=0; i--) {
            words.remove(i);
        }

        System.out.println(words);

    }
}
