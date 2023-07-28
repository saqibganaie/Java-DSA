// package Interfaces;

public class Car_Interfaces5b {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Engine_Interfaces5b c2 = new Car();
        c2.start();
        c1.greet2();
        // c2.message(); // * cannot do this because we can only access those which are
        // * in Engine type.
    }
}

class Car implements Engine_Interfaces5b, Break_Interfaces5b, Media_Interfaces5b {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void brake() {
        System.out.println("brake applied");
    }

    @Override
    public void acc() {
        System.out.println("Car accelerated");
    }

    public void message() {
        System.out.println("Message from car");
    }

}
