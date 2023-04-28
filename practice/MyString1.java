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
    }
}