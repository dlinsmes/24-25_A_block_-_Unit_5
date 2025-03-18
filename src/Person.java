public class Person {
    //a class is a blueprint for something you represent with code
    //-an object/instance is a specific example made from the blueprint

    private String name;
    private int age;
    private boolean hair;

    static int numPeople = 0;

    public Person(String name, int a, boolean h) {
        //"this" necessary when the param name is the same
        //as the instance var, "this" refers to the instance var
        this.name = name;
        this.age = a;
        hair = h;

        numPeople++;
    }

    //overloaded constructors - same method name, different params
    //without this, the constructor call w/ no args
    //wouldn't work when the above constructor is defined
    public Person() {

        //regardless of params, a constructor
        //should initialize all instance vars
        name = "greg";
        age = 2;
        hair = false;

        numPeople++;

    }

    //accessors
    public String getName() {
        return name;
    }
    public int getAge() { return age; }
    public boolean getHair() { return hair; }

    //mutator
    public void setAge(int newAge) {
        age = newAge;
    }

    public String toString() {
        return ("name: " + name + ", age: " + age + ", hair: " + hair);
    }

}
