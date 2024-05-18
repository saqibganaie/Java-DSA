public class DivConq_TC {
    /*
     * form
     * T(x) = a1*T(b1*x + f1(x)) + a2*T(b2*x + f2(x)) + ----- + an*T(bn*x +fn(x)) +
     * g(n)
     */
    /*
     * e.g -> T(n) = 2*T(n / 2) + (n - 1) here 2*T(n / 2) is what you get from the
     * array and (n - 1) is what you do with the array i.e g(n)
     */

    // How to actually solve for complexity:-
    // 1. Plug and chug
    // 2. Masters Theorem
    // * 3. Akkra Bazi formulae
    // we will do the 3rd one

    // * Akkra Bazzi formulae

    // * T(x) = θ (x^P + x^P integral(1 -> x) (g(x) / x^(p + 1) dx))
    // for finding P do this :-
    // a1*b1^P + a2*b2^P + a3*b3^P -------- + ak*bk^P = 1
    // * summation(i = 1 -> k) ai*bi^P = 1
    // * Note : when p < power of g(x) then ans = θ(g(x))
}
