import java.util.ArrayList;

public class sol6 {

    // Q: There are n kids with candies. You are given an integer array candies,
    // where each candies[i] represents the number of candies the ith kid has, and
    // an integer extraCandies, denoting the number of extra candies that you have.
    // Return a boolean array result of length n, where result[i] is true if, after
    // giving the ith kid all the extraCandies, they will have the greatest number
    // of candies among all the kids, or false otherwise.
    // Note that multiple kids can have the greatest number of candies.

    public static void main(String[] args) {
        int[] candies = { 1, 2, 4, 5, 0, 3 };
        System.out.println(kidsWithCandies(candies, 2));
    }

    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int size = candies.length;
        ArrayList<Boolean> res = new ArrayList<>(size);
        int max = 0;
        for (int numOfCandy : candies) {
            max = Math.max(numOfCandy, max);
        }
        for (int numOfCandy : candies) {
            res.add(numOfCandy + extraCandies >= max);
        }
        return res;
    }
}