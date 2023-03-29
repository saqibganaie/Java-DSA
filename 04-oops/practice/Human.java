public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population; // this is a static variable which means that it does not depend on the object
                            // but instead is same for all the objects of a class.

    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
    }
}
