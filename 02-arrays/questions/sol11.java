import java.util.ArrayList;
import java.util.Arrays;

public class sol11 {
    // Q:You are given an array items, where each items[i] = [typei, colori, namei]
    // describes the type, color, and name of the ith item. You are also given a
    // rule represented by two strings, ruleKey and ruleValue.
    // The ith item is said to match the rule if one of the following is true:

    // ruleKey == "type" and ruleValue == typei.
    // ruleKey == "color" and ruleValue == colori.
    // ruleKey == "name" and ruleValue == namei.
    // Return the number of items that match the given rule.

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>();
        items.add(new ArrayList<String>(Arrays.asList("phone", "silver", "samsung")));
        items.add(new ArrayList<String>(Arrays.asList("phone", "silver", "nokia")));
        items.add(new ArrayList<String>(Arrays.asList("table", "brown", "ikea")));
        System.out.println(countMatches(items, "color", "silver"));
    }

    public static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int col = 0;
        int count = 0;
        switch (ruleKey) {
            case "type" -> col = 0;
            case "color" -> col = 1;
            case "name" -> col = 2;
        }
        for (ArrayList<String> item : items) {
            if (ruleValue.equals(item.get(col)))
                count++;
        }
        return count;

    }
}
