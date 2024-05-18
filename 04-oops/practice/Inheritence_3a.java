public class Inheritence_3a {
    public static void main(String[] args) {
        Child c1 = new Child(10);
        Parent p1 = new Parent();
        // p1.display();
        // c1.display();
        // c1 = (Child) p1; // * This will throw class cast exception at run time
        // * */ because we cannot refrence a child object to a parent object but we can
        // * do the vice versa
        // p1 = c1;
        // c1.display();
        // p1.display();
        System.out.println(c1.age); // returns null because it was never intialized i.e if a property is not
                                    // initialized then it will return it's default value
        Parent p2 = new Child(20);
        System.out.println(c1.rollNum);

        // System.out.println(p2.rollNum); // * It wont be able to access rollNum
        // p2.display(); // * This will work and print "Child Message" because when a
        // * method is overridded then it depends on the type of object and not the
        // * refrence type. This is called Dynamic Method Dispatch , where the
        // * approriate method implementation is determined at runtime based on the
        // * actual object's type.
        // * property because the refrence is of type Parent
        /*
         * The type of refrence variable determines which properties can be accessed.
         */
        // Child c2 = new Parent(); /*You cannot do this because if we do this then we
        // know c2 will only have access to Child memory block but it was never
        // initialized so it cannot access anything hence this is probhited */

        SubChild s1 = new SubChild();
        System.out.println(s1.rollNum);

    }
}

/*
 * Types of Inheritence:-
 * 1. Single Inheritence ----- Parent -> Child
 * 2. Multilevel Inheritence ------ Parent -> Child -> SubChild
 * 3. Multiple Inheritence ------- Parent -> Child && Parent2 -> Child
 * *** NOTE: Java doesn't support Multiple Inheritence. But it provides us
 * Interfaces for using this functionality
 * 4. Hierarhial Inheritance ------- Parent -> Child && Parent -> Child2
 * 5. Hybrid Inheritane ----- Parent -> Child && Parent -> Child2 && Child ->
 * Child3 && Child2 -> Child3 ---- but here too there is multiple inheritence so
 * Java doesn't support this
 */
// * NOTE: Every class has Object as a superclass
// * NOTE: In case of a hierarchial inheritence the child class using the
// * super() keyworkd will call the constructor of the class that is just above
// it
// * in the hierarchy
class Parent {
    String name;
    int age;
    String sameProp;

    public Parent() {
        super(); // if you call the super() keyword from a class that is not extending any class
                 // it will call the constructor of Object class because it is obviously
                 // extending it
        System.out.println("This is parent constructor");
        this.sameProp = "Parent";
        this.age = 0;
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // * This is called a copy constructor
    public Parent(Parent p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println("Parent Message");
    }
}

class Child extends Parent {
    int rollNum;
    String sameProp;

    public Child(int rollNum) {
        // super("Saqib", 10); // * super keyword is used to call a parameterized and it
        // has to be at the top of other constructor instructions because super class
        // does not know about the sub classes
        // * constructor of a parent class
        System.out.println("This is child contructor");
        this.rollNum = rollNum;
        this.sameProp = "Child"; // this keyword will tell it to use the var of child (i.e it's own) class
        super.sameProp = "Parent"; // super keyword will tell it to use the var of Parent class
        // * this comes in handy if the child and parent class have some
        // * variables/properties with same name
    }

    public void display() {
        System.out.println("Child Message");
    }
}

class SubChild extends Child {
    String greet;
    String sameProp;

    public SubChild() {
        super(20);
        this.sameProp = "SubChild";
        System.out.println("same prop of parent : " + ((Parent) this).sameProp);
        System.out.println("same prop of Child : " + super.sameProp);
        System.out.println("same prop of subChild : " + this.sameProp);
        this.sameProp = "SubChild";
        System.out.println(super.sameProp);
        System.out.println("This is SubChild Constructor");
    }

    public void display() {
        System.out.println("SubClass display");
    }
}