public class sol1 {
    // Q1. Check if prime or not
    public static void main(String[] args) {
        if (isPrime(5))
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }

    static boolean isPrime(int num) {
        for (int count = 2; count * count <= num; count++) {
            if (num % count == 0)
                return false;
        }
        return true;
    }
}
