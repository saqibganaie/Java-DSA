// package Interfaces;

public interface Engine_Interfaces5b {

    int price = 100000;

    void start();

    void stop();

    void acc();

    default void greet() {
        System.out.println("Hello i am engine");
    }

    default void greet2() {
        System.out.println("i am greet2");
        greet3();
    }

    private void greet3() {
        System.out.println("Hello");
    };

    static void greet4() {
        System.out.println("hi");
    }
}