public class LinerRecurrence_TC {
    // * form : (Homogenous Recurrence Relation)
    // f(x) = a1*f(x-1) + a2*f(x-2) + -------- + an*f(x-n)
    // f(x) = summation(i=1 -> n)ai*f(x - i)
    // * Solution
    // 1. Put f(n) = α^n for some constant α {alpha} here n is the var inside
    // brackett of f(n) so if we have f(n - 1) then n will be n - 1
    // 2. Solve the equation for value of α
    // 3. then the final equation with k number of roots will be
    // f(n) = c1 * α1^n + c2 * α2^n + ----- + ck * αk^n
    // 4. You will already be given the value of k number of values f(x).
    // 5. By using these values you will find the values of constants (c1, c2 ---)
    // 6. Put c1, c2 ----- and you will get the resultant equation i.e the time
    // complexity in O{big Oh}.
    // * Note : if there are r equal roots α then α^n , n*α^n, n^2 * α*n, ---------
    // * , n^r-1 * α^n will all satisfy the equation hence will be the roots.

    // * form: (Non - Homogeneous Recurrence Relation)
    // f(x) = a1*f(x-1) + a2*f(x-2) + -------- + an*f(x-n) + g(x) { when there is
    // g(x) another funciton in one function then it is non - homogeneous equation}
    // * Solution
    // 1. Replace g(n) by O{zero} and solve just like before till step 3 to find
    // f(n)
    // 2. After this take the initial equation and put all the f(n) terms on L.H.S
    // and g(n) term on the R.H.S.
    // 3. Guess the value of f(n) {which is usually some constant multiplied by g(n)
    // term} and put it in the equation of step 2. {if first (constant) guess doesnt
    // work then try replacing constant wiht a*n+b, if this also doesnt work then
    // try a*n^2 + b*n+c and so on}
    // 4. Now solve for till you get the value of constant which is in step 3 and
    // put that value in f(n) which is in step 3.
    // 5. Now, f(n) = value of f(n) in step 1 + value of f(n) in step 4.
    // 6. solve f(n) in step 5 using the given f(1 or 2 or whatever) and find the
    // final equation.
}
