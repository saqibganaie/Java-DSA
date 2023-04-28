import java.util.ArrayList;
import java.util.Arrays;

public class MyString1 {
    public static void main(String[] args) {
        // Strings are immutable
        // strings are created in string pool in heap. So, if we have one "Saqib" in
        // pool then another "Saqib" will not be created.
        // When we try to change a string then it does not change the original refrence
        // but creates anohter refrence and points to it and the previous refrence is
        // garbage collected.
        String a = "Saqib";
        String b = "Saqib";
        a = new String("Adnan");
        b = new String("Adnan");
        System.out.println(a == b); // compares the refrence of strings
        System.out.println(a.equals(b)); // compares the actual value of strings
        // pretty printing
        System.out.printf("Formatted number is %.2f%n", 21.22345); // %n is for new line
        System.out.printf("Pie : %.4f%n", Math.PI);
        System.out.printf("Hi! My name is %s and I am really %s%n", "Saqib", "Cool");

        // * The + operator is overloaded in Java to evaluate strings too
        // * we cannot overload the default operators in Java

        System.out.println('a' + 'b'); // characters are converted to ascii code and then added while using the +
                                       // operator
        System.out.println("a" + "b"); // Strings are concatenated using + operator
        System.out.println("a" + 1); // int will be converted to string
        System.out.println((char) ('a' + 1)); // char will be converted to ascii and then added with int
        int[] arr = { 1, 2, 3 };
        System.out.println("a" + Arrays.toString(arr)); /*
                                                         * we can also add complex expressions such arrays,
                                                         * arrayLists and objects with the + operator but the only
                                                         * condition is that the expression should have atleast one
                                                         * string in it so that everything will be evaluated as string.
                                                         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        System.out.println("abc" + list);

    }
}