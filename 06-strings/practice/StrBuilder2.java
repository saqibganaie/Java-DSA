public class strBuilder {
    public static void main(String[] args) {
        // every time we append anything to a string, a new object is created and the
        // previous string object is derefrenced which leads to wastage of memory.
        // As we can see in the example below.
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }
        System.out.println(series);
        // here every time series is getting updated a new string is being created and
        // previous string is being derefrenced. Hence wastage of memory.
        // * So in order to tackle this problem we need a string type data type which is
        // mutable.
        // * We can use StringBuilder for this.
        // * StringBuilder is a class provided by java which works as a string but is
        // mutable
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            str.append(ch);
        }
        System.out.println(str);
        System.out.println(str.charAt(0));
        str.delete(0, 2); // will delete from index 0 to 1 i.e a, b and c
        System.out.println(str);
    }
}
