public class Q1 {
    // Q.Given an integer num, return the number of steps to reduce it to zero.

    // In one step, if the current number is even, you have to divide it by 2,
    // otherwise, you have to subtract 1 from it.
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int num, int countSteps) {
        if (num == 0) {
            return countSteps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, ++countSteps);
        }
        return helper(num - 1, ++countSteps);
    }

}
