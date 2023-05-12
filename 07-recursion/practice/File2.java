public class File2 {
    // In the previous file there was too many uneccessary repetitions.
    // We can use recursion to optimize it
    // A function that calls itself is called Recursion
    // Base condition - it is the condition where our recursion will stop making
    // calls
    // (mostly a simple if statement)
    // if the same function is called again and again it will take seperate memory
    // for every call
    // * So in case of no base condition we can face stackOverflow error
    // We use recursion because it helps to solve bigger/complex problems easily.
    // We can convert recursion problems into iteration(loops) and vice versa.
    // * Space complexity is not constant because of recursive calls.
    // The sequence of recursion calls when visulaized from top to bottom is known
    // as recursion tree.

    public static void main(String[] args) {
        message(1);
    }

    // * When you have the recursion call as the last command it is called
    // * Tail Recursion
    public static void message(int n) {
        System.out.println("Hello World " + n);
        if (n < 5) {
            message(n + 1);
        }
    }
}
