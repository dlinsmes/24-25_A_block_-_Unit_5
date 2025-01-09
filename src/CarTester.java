public class CarTester {

    public static void main(String [] args) {

        //declare a Car object with var name c
        //and call the constructor to instantiate (initialize) this
        //specific example made from the Car class
        Car c = new Car();

        //accessing the instance variable in Car c
        System.out.println(c.name);

        Car c2 = new Car();
        //change name of c2
        c2.name = "bartholomew";

        System.out.println("c1's name is " + c.name);
        System.out.println("c2's name is " + c2.name);

        //private variables cannot be accessed outside of the class
//        c.totalMiles = 0;

        //private variable - can't access it
        //System.out.println("c's total miles: " + c.totalMiles);

        System.out.println("c's total miles: " + c.getTotalMiles());

        //add 200 miles to Car c
        c.setTotalMiles(200);
        System.out.println("c's total miles: " + c.getTotalMiles());

        c.setTotalMiles(-200);
        System.out.println("c's total miles: " + c.getTotalMiles());


        //call the overloaded constructor with these values
        //to set the initial instance variable values
        Car c3 = new Car("mike", "green", 0, 80, 100, 100);
        System.out.println("c3: " + c3.name + " is " + c3.color);

        //call the method from a specific object
        c3.driveTilEmpty();
    }
}
