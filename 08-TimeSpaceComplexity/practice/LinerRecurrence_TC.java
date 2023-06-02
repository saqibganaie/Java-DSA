public class LinerRecurrence_TC {

    // * General form of recurrence relation:-

    /*
     * T(n) = a*T(n - b) + g(n)
     */

    // e.g -> T(n) = T(n - 1) + 1
    // *Solve it by using substitution method
    // *solution{
    // T(n) = {
    // 1 , n = 0
    // T(n - 1) + 1, n > 0
    // }
    /*
     * T(n) = T(n - 1) + 1
     * T(n - 1) = T(n - 2) + 2
     * T(n - 2) = T(n - 3) + 3
     * ---
     * ---
     * now substitute the values of T(n - 1) , T(n - 2) ---- in T(n) and we get
     * T(n) = T(n - k) + k
     * assume n - k = 0
     * n = k
     * T(n) = T(0) + n
     * T(n) = n + 1
     * i.e T(n) = O(n) ans
     */
    // * }

    // -------------------------------------------------------------

    // * Solve this by Substitution method
    // e.g -> T(n) = T(n - 1) + n
    // T(n) = {
    /*
     * T(n) = T(n - 1) + n
     * T(n - 1) = T(n - 2) + n - 1
     * T(n - 2) = T(n - 3) + n - 2
     * ----
     * ----
     * now put the above values in T(n) we get
     * T(n) = T(n - k) + (n - (k - 1)) + (n - (k - 2)) ------- + (n - 1) + n
     * assume n - k = 0
     * n = k
     * T(n) = T(0) + 1 + 2 + 3 ---- n
     * T(n) = O(n^2) ans
     */
    // }

    // * Note: The upper bound for n! is n^n so for O(log(n!)) it can be written as
    // * O(nlogn)

    // *** NOTE: for a reducing reccurence relation T(n) = T(n - 1) + g(n)
    // ** you can directly write the time complexity as = n*g(n)
    /*
     * but in case of coefficient for T(n - 1) i.e a*T(n - 1) the time complexity
     * is (a^n)*g(n)
     */
    // * Q. Solve the recurrence relation T(n) = 2T(n) - 1
    // Do this for practice

}
