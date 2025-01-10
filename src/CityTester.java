public class CityTester {
    public static void main(String [] args) {

        City c = new City("tokyo", "spanish", 2);

        //call the accessor methods to print the data of c
        System.out.println(c.getName());
        System.out.println(c.getLanguage());
        System.out.println(c.getPopulation());
        System.out.println(c.getLockdown());

        //change the lockdown status
        c.setLockdown();
        System.out.println(c.getLockdown());

        //if no constructor is defined in a class,
        //a default no-param constructor is available to use,
        //and all instance variables will default to 0/0.0/null/false

        //-once a constructor is defined in a class, this default
        //constructor is no longer available
//        City test = new City();
//        System.out.println(test.getName());
//        System.out.println(test.getLanguage());
//        System.out.println(test.getPopulation());
//        System.out.println(test.getLockdown());


        //print the City object c

        //until you define a toString() method in the class,
        //this prints the memory location of the object - not useful
        System.out.println(c);

        City c2 = new City ("sydney", "cantonese", 5);

        System.out.println();
        //printing toString() is the same as printing the object
        System.out.println(c2.toString());

        //array of city objects that holds 3 objects
        City [] cities = new City [3];

        cities[0] = c;
        cities[1] = c2;

        //can assign a new object by calling the constructor
        cities[2] = new City("hong kong", "turkish", 9999999);

        System.out.println();

        //print the names of each city in the array
        for(int i = 0; i < cities.length; i++) {
            System.out.println(cities[i].getName());
        }

        System.out.println();

        //print the name of only the cities
        // with populations of less than 100
        for (int i = 0; i < cities.length; i++) {
            //check the population to decide whether to print
            if (cities[i].getPopulation() < 100) {
                System.out.println(cities[i].getName());
            }
        }

        System.out.println();

        //same thing with for each loop
        for (City ci: cities) {
            //ci will temporarily be each object
            if(ci.getPopulation() < 100) {
                System.out.println(ci.getName());
            }
        }
    }
}
