public class File1 {
    // All function calls go to stack memory
    // while the funtion is not finished executing it will remain in the stack
    // when a function finished executing it is removed from stack, and
    // * the flow of pgm is restored to where the function was called.
    public static void main(String[] args) {
        message1(1);
    }

    public static void message1(int n) {
        System.out.println("Hello World!" + n);
        message2(2);
    }

    public static void message2(int n) {
        System.out.println("Hello World!" + n);
        message3(3);
    }

    public static void message3(int n) {
        System.out.println("Hello World!" + n);
        message4(4);
    }

    public static void message4(int n) {
        System.out.println("Hello World!" + n);
        message5(5);
    }

    public static void message5(int n) {
        System.out.println("Hello World!" + n);
    }
}