import java.util.Scanner;
import java.util.ArrayList;

public class sol3 {
    // Q3. Return all prime numbers between two given numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter your two numbers : ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("Primes : " + getPrimes(num1, num2));
    }

    static ArrayList<Integer> getPrimes(int low, int high) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int outerCount = low; outerCount <= high; outerCount++) {
            int flag = 0;
            for (int innerCount = 2; innerCount * innerCount <= outerCount; innerCount++) {
                if (outerCount % innerCount == 0) {
                    flag = 1; // implies number is not prime
                    break;
                }
            }
            if (outerCount == 0 || outerCount == 1)
                flag = 1; // becaues 0 and 1 are neither prime nor composite
            if (flag == 0) {
                arr.add(outerCount); // prime number is added in the ArrayList
            }
        }
        return arr;
    }

}
