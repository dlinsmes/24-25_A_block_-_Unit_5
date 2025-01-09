//a class is a blueprint or template for
//something you want to represent in a program
public class Car {

    //instance variables
    //-every object (example) we make from this class
    //has these characteristics, though each object
    //can have different values for each var

    String name;
    String color;

    //all instance variables should be private
    //-use the private modifier to protect data so that it can
    //only be accessed in ways you intend
    //-a car's total miles should only ever increase so the tester
    //class should not be able to set it to a lower number
    private int totalMiles;

    int mpg;
    double fuelCapacity;
    double fuelRemaining;

    //constructor - special method to create a new object
    //of this class
    //-no return type and the method name is exactly the same
    //as the class name
    public Car() {
        //constructors should set values for all instance vars
        name = "Steve";
        color = "burgundy";
        totalMiles = 500000;
        mpg = 6;
        fuelCapacity = 5;
        fuelRemaining = 0.3;
    }

    //can overload constructors so that each overloaded constructor
    // sets the values differently
    public Car(String n, String c, int totalMiles, int mpg, double fc, double fr) {
        name = n;
        color = c;

        //"this" keyword refers to the instance variable
        //without "this" refers to the param
        this.totalMiles = totalMiles;
        this.mpg = mpg;

        //"this" is not necessary but doesn't hurt when the param name is
        //different
        this.fuelRemaining = fr;
        this.fuelCapacity = fc;
    }

    //accessor method aka get method aka getter
    //-allow public read access to a private variable
    //-public means other classes can access it

    //-return type should match the variable type
    //-return the private variables
    public int getTotalMiles(){
        return totalMiles;
    }

    //mutator method aka set method aka setter
    public void setTotalMiles(int addMiles) {
        if (addMiles > 0)
            totalMiles += addMiles;
        else
            System.out.println("you can only add positive miles");
    }

    public void driveTilEmpty() {
        totalMiles += (int)(mpg*fuelRemaining);
        fuelRemaining = 0;
        System.out.println("vroom vroom - " + name + " is out of fuel");
    }

}
