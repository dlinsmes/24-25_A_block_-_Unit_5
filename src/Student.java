public class Student {

    private String name;
    private int id;

    //static - a method or variable that's static
    //is shared by the whole class, not a single object

    //non-static - the variable or method belongs
    //to an individual object

    //the values of these static variables are
    //shared by the whole class and all objects
    //made from this class
    private static int studentCount = 0;
    private static String roster = "Roster:";
    private static boolean onBreak = false;

    public Student (String name) {
        this.name = name;

        //every time the constructor is called, the number
        //of students goes up by 1
        studentCount++;

        //each id is individual (instance var)
        //but the value comes from the total student
        //count that increases every time a new object
        //is made
        id = studentCount;

        //update the static variable that's shared by
        //the whole student class to add on each new
        //name
        roster += "\n" + name;
    }

    public String toString() {
        return "ID: " + id + " - " + name + " - break: " + onBreak;
    }

    public String getName() { return name; }

    public void setOnBreak(){

        //since this is a static var, the value is set
        //for ALL objects across the whole class
        onBreak = !onBreak;
    }

    //static method means that you
    //can call it directly from the class
    public static String getRoster() {
        return roster;
    }
}
