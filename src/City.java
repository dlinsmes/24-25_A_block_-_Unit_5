public class City {

    //instance variables - all private
    //every object will get its own values

    private String name;
    private String language;
    private int population;
    private boolean lockdown;

//    constructor - no return type, name matches the class name
    public City(String name, String lang, int pop) {
        //make sure to set a value to all instance vars,
        //even if there's no param for it

        //"this" refers to the instance variable
        this.name = name;
        language = lang;
        population = pop;

        //each city object made will default to being false for lockdown
        lockdown = false;
    }

    //get methods/accessor methods

    //return type matches the var type,
    //just return the var
    public String getName(){
        return name;
    }

    public String getLanguage(){
        return language;
    }

    public int getPopulation() {
        return population;
    }

    public boolean getLockdown() {
        return lockdown;
    }

    public void setLockdown() {
        if (lockdown)
            lockdown = false;
        else
            lockdown = true;
    }

    //when you define a toString() method, it gets called
    //when you print the object
    public String toString() {

        //return useful information about the object in a string format
        return "name: " + name +
                "\nlanguage: " + language +
                "\nPopulation: " + population +
                "\nLockdown: " + lockdown;
    }

}
