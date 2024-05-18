public class Polymorphism_3b {
    // * Poly - means many
    // * morphism - means ways of doing tasks
    // * Polymorphism - means many ways of doing certain/same tasks
    // * Types of Polymorphism
    /*
     * 1. Compile Time / Static Polymorphism :- Achieved via method overloading (for
     * e.g when we make many constructors or methods of same name but with different
     * type/num of parameters )
     * 2. Runtime / Dynamic Polymorphism :- Achieved by method overriding
     * In this the method call depends on the type of object and not refrence i.e
     * Dynamic method dispatch a.k.a late binding
     */
    /*
     * ** Early Binding - When method call is resolved to its correspoinding method
     * implementation during compile time.
     * ** Late Binding - When method call is resolved to its corresponding method
     * implementation during run time.
     */

    public static void main(String[] args) {
        // *NOTE: static (overriding depends on objects and static does not depend on
        // * object that's why), final , private methods cannot be overriden
        Shapes sh1 = new Square(); // * dynamic method dispatch doesn't work for static, final and private methods
        sh1.message();
        Shapes.greet();
        Square.greet();

    }
}

class Shapes {
    void area() {
        System.out.println("Area of shapes");
    }

    final void display() {
        System.out.println("This is Shapes");
    }

    static void message() {
        System.out.println("Shape message");
    }

    static void greet() {
        System.out.println("This is shapes");
    }
}

class Square extends Shapes {
    @Override // This is called anotation
    void area() {
        System.out.println("Area of Square");

    }

    static void greet() {
        System.out.println("This is square");
    }

    // @Override
    // void display() { // * A final method cannot be overriden. Also a final method
    // * is resolved during compile time, this is known as early binding
    // System.out.println("This is square");
    // }
    // void message() { // * static methods cannot be overridden
    // System.out.println("Square message");
    // }
}

// * We can make a class final so it can't be inherited. When we declare a class
// * as final then it's methods automatically becomes final.
final class NotInherited {

    void printIt() {
        System.out.println("This is final class");
    }
}