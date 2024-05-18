
public class practice3 {
    static int a = 4;
    static int b;
    // static block will only run once when the class is first loaded
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        // System.out.println("This is practice 3");
        // Human saqib = new Human(21, "Saqib", 3000000, false);
        // Human human2 = new Human(21, "Saqib", 3000000, false);
        // Human human3 = new Human(21, "Saqib", 3000000, false);
        // System.out.println(saqib.name);
        // System.out.println(Human.population); // whenever we declare something as
        // static then we dont need to create an
        // object for it to access it because static variables/methods does not
        // depend on the object.
        // System.out.println(practice3.a + " " + practice3.b);
        // practice3.b += 10;
        // practice3 obj1 = new practice3();
        // System.out.println(practice3.a + " " + practice3.b);
        // System.out.println(practice3.a + " " + practice3.b);

        // Singleton Class which only has one object
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();
        // all of these three objects will be pointing to the same object of Singleton
        // class.
        obj1.name = "Saqib";
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }

}
