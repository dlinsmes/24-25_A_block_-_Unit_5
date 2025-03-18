import java.util.ArrayList;

public class U5Review {

    public static void main (String [] args) {

        System.out.println("numPeople: " + Person.numPeople);

        //a default, no-param constructor is available
        //when one hasn't been defined in the class yet
        //-variables will get set to 0/null/false
        Person p = new Person();

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getHair());

        p.setAge(20);

        //without a toString defined, printing an object
        //will output the memory location
        System.out.println(p);

        System.out.println("numPeople: " + Person.numPeople);

        Person a = new Person ("lebron", 40, false);

        //static variables (and methods) can be called directly from
        //the class
        System.out.println("numPeople: " + Person.numPeople);

        //static vars/methods can also be called from objects
        //-the static variable's value is shared amongst all objects of the class
        System.out.println("numPeople: " + p.numPeople);
        System.out.println("numPeople: " + a.numPeople);

        //random is a static method pf the Math class
        //-we've never made a Math object
        double n = Math.random();

        //since main() is static, you can call another
        //class's main method
        //StudentTester.main(args);

        //arrays - fixed length
        //arrayLists - dynamic size

        System.out.println();
        //array:
        //declare and initialize an array that holds 3 objects
        Person [] people = new Person [3];
        //at the moment, no objects are stored yet, so all positions are null
        System.out.println(people[0]);
        System.out.println();

        people[0] = p;
        people[1] = a;
        people[2] = new Person("bronny", 20, true);

        //for loop to print each object's name
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
        System.out.println();

        //for-each loop tp print each object's age
        for (Person k: people) {
            //k is an object, not an index
            System.out.println(k.getAge());
        }

        //ArrayList of Persons
        ArrayList<Person> people2 = new ArrayList<Person> ();
        people2.add(p);
        //overloaded add() accepts an index to insert a object
        people2.add(0, a);

        Person b = people[2];
        //set() replaces an object
        people2.set(1, b);

        //for loop to print each object in people2
        System.out.println();
        //size instead of length for arrayList
        for (int i = 0; i < people2.size(); i++) {
            System.out.println(people2.get(i));
        }

        //for-each loop to print each object's hair
        System.out.println();
        //same for arrayLists and arrays
        for (Person k: people2) {
            System.out.println(k.getHair());
        }

        System.out.println();
        System.out.println(a);
        int newAge = 30;
        changeAge(a, newAge);
        //objects are affected by methods
        System.out.println(a);
        //primitives are NOT affected by the method call
        System.out.println("newage:" + newAge);

        System.out.println();

        //assigning an object this way does NOT make
        //a separate copy - they are references (shortcuts)
        //to the same object
        //-if you have a shortcut to a file on your computer, you can
        //change the file from either the shortcut or the original,
        //and you'll see the changes from both the shortcut and original
        Person c = a;

        c.setAge(50);
        System.out.println("object c: " + c);
        System.out.println("object a: " + a);

        System.out.println();
        //it doesn't matter which reference you make the change to
        a.setAge(200);
        System.out.println("object c: " + c);

        System.out.println();

        //to make a separate, independent copy:
        Person d = new Person(a.getName(), a.getAge(), a.getHair());
        d.setAge(2);
        System.out.println("object d: " + d);
        System.out.println("object a: " + a);


    }

    //objects passed to methods get changed by the method
    //primitive data (int, double, boolean, Strings) do not get changed
    //outside of the method
    public static void changeAge(Person p, int a) {
        a = -100;
        p.setAge(a);
    }
}
