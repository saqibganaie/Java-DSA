public class AbstractClasses5 {
    public static void main(String[] args) {
        Son son = new Son(10);
        son.carrer();
        System.out.println(son.age);

        // Parent p = new Parent(); // * You cannot create objects of abstract classes
        // * because abstract methods in abstract class dont have body and what if you
        // * tried to call them

        Parent p = new Son(20);
        p.carrer();
        p.message();
        System.out.println(p.age);
    }
    // *NOTE: If a class contains atleast one abstract method then it should be
    // * declared abstract.
}

abstract class Parent {
    abstract void carrer();

    int age;

    public Parent() {
        this.age = 50;
    }

    // abstract Parent(){
    // } // * You cannot create abstract constructors
    // * You cannot create abstract static methods

    final void printIt() {
        System.out.println("Post it");
    }

    void message() {
        System.out.println("This is Parent");
    }
}

class Son extends Parent {
    int age;

    public Son(int age) {
        this.age = age;
    }

    @Override
    void carrer() {
        System.out.println("Son's Career");
    }
}

class Daughter extends Parent {
    @Override
    void carrer() {
        System.out.println("Daughter's Career");
    }
}
