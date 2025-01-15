import java.util.ArrayList;

public class StudentTester {

    public static void main(String [] args) {
        Student s = new Student("ryan");

        System.out.println(s);

        Student s2 = new Student("Bryan");
        System.out.println(s2);


        //even though setBreak is called through
        //the s object, the value is changed and
        //shared across all objects (including s2)
        s.setOnBreak();


        System.out.println(s);
        System.out.println(s2);

        //getRoster() is static - can be called from
        //the class
        System.out.println(Student.getRoster());

        //can also call static method from a specific object
        System.out.println(s.getRoster());

        //doesn't work bc toString is a non-static
        //instance method - it must be called from
        //an object, but can't be called from the class

        //System.out.println(Student.toString());

        //can call main of another class bc main is static:
        CardTester.main(args);

        CityTester.main(args);

        //Math.random() is a static method that returns
        //a double - we know it's static bc we've never
        //made a Math object
        double r = Math.random();

        //similarly = MAX_VALUR is a static variable
        int x = Integer.MAX_VALUE;

        //arrays have fixed length - can't add or remove
        //values after the length is set

        //ArrayLists - can change size dynamically
        //-can add and remove
        //limitation: can't hold primitive data
        //-int, double, boolean

        //need import line at top
        //to declare and initialize an empty arraylist:
        ArrayList<Student> csClass = new ArrayList<Student>();

        //.add() will append a new object at the end of the list
        csClass.add(s);
        csClass.add(s2);

        System.out.println();

        //can directly print an arraylist
        System.out.println(csClass);

        System.out.println();

        //size() instead of length of arraylists
        for (int i = 0; i < csClass.size(); i++) {
            //.get(index) instead of list[index]
            System.out.println(csClass.get(i));
        }

        //overloaded add() accepts index and value to insert the new value
        //in the middle of the list at the provided index
        //(nothing gets removed/replaced, but other values can get moved up
        //by an index)
        Student s3 = new Student("Lauren");
        csClass.add(1, s3);

        System.out.println(csClass);

        Student s4 = new Student("ross");

        //replace bryan (index 2) with ross
        csClass.set(2, s4);
        System.out.println(csClass);

        //this will shift indexing so that it always starts at 0
        csClass.remove(0);

        System.out.println(csClass);

        csClass.add(s);
        csClass.add(s2);

        System.out.println(csClass);

        //use a loop to print just names of students in csClass
        for (int i = 0; i < csClass.size(); i++) {
            //isolate one specific student from the list
            Student current = csClass.get(i);

            //isolate the name from the student
            String currentName = current.getName();

            //print the name
            System.out.println(currentName);
        }

        System.out.println();

        for (int i = 0; i < csClass.size(); i++) {
            //same thing but with combined logic
            System.out.println(csClass.get(i).getName());
        }

        System.out.println();


        //same thing with for each loop
        for (Student st: csClass) {
            System.out.println(st.getName());
        }


    }

}
