import java.util.Arrays;

public class StringMethods3 {
    public static void main(String[] args) {
        // Strings are immutable so these methods will not change the actual string but
        // will return a new refrence.
        String intro = "Hi my name is Saqib!";
        char[] arr = intro.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(intro.toLowerCase());
        System.out.println(intro.indexOf("a"));
        System.out.println("     Saqib     ".strip());
        System.out.println(Arrays.toString(intro.split(" "))); // inside the split() we pass regular expressions (regEx)
                                                               // to split the string according to our needs
    }
}
