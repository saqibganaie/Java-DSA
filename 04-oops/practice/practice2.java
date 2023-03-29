public class practice2 {
    public static void main(String[] args) {
        // Integer a = 10;
        // Integer b = 20;
        // swap(a, b);
        // System.out.println(a + " " + b);

        final Car car1 = new Car(4);
        System.out.println(car1.numOfTires);
        // we can change the properties of a final object but cannot assign it as a new
        // object
        car1.numOfTires = 10;
        System.out.println(car1.numOfTires);
        // car1 = new Car(5); // not allowed because car1 is final

        // Car myCar;
        // for (int i = 0; i < 1000000000; i++) { // this will put load on mem and force
        // java to do garbage collection
        // // which in turn will run the finalize statement
        // myCar = new Car();
        // }

        // Parent p = new Parent();
        // Child ch = new Child();
    }

    // here Integer is used to create an object of Integer class and we know objects
    // are passed by refrence but this will not work because Integer is a 'final'
    // class
    // 'final' keyword is used to make something constant
    // since you cannot modify a final var so always initialize it when you declare
    // it
    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class Car {
    int numOfTires;

    Car() {
        this(0);
    }

    Car(int num) {
        this.numOfTires = num;
    }

    // this is similar to a destructor. In java garbage collection is done
    // automatically we cannot do anything in it but using the finalize keyword we
    // can tell the pgm to do something when it destroys an object during garbage
    // collection.
    // here we told it to print "Car destroyed"
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Car destroyed");
    }
}

class Parent {
    Parent() {
        System.out.println("This is parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("This is child constructor");
    }
}