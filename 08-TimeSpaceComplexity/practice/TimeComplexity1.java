// Q. What is Time Complexity?
// Ans. It is the Mathematical function that defines the relation between time
// and size of data.
// Q. Why time complexity?
// Ans. It gives us a general idea about how the time will grow with size of
// data, using which we can optimize our algorithm.
// * while calculating time complexity of algorithm, ignore the constants and
// * less dominating terms.

// * Big-Oh notation(O):-

// 1. It is the worst case/upper bound time complexity of algorithm.
// 2. f(N) = O(g(N)), if there exists positive constants c, N0 such that
// f(N) <= c.g(N) for all N >= N0
// 3. lim(N -> infinity) (f(N) / g(N)) < infinity

// * Big-Omega notation(Ω):-

// 1. It is the best case/lower bound time complexity of algorithm.
// 2. f(N) = Ω(g(N)), if there exists positive constants c, N0 such that
// f(N) >= c.g(N) for N >= N0
// 3. lim(N -> infinity) (f(N) / g(N)) > 0

// * Theta notation(Θ):-

// 1. It is the average case/exact time complexity of
// algorithm.
// 2. f(N) = Θ(g(N)), if there exists positive constants c1, c2, N0 such that
// 0 <= c(g(N)) <= f(N) <= c2(g(N)) for N >= N0
// 3. 0 < lim(N -> infinity) (f(N) / g(N)) < infinity

// * Little-oh notation(o):-

// same as big-oh but it has strict bounds i.e wherever there is <= replace it
// with <.

// * Little-omega notation(ω):-

// same as big-oh but it has strict bounds i.e wherever there is >= replace it
// with >.
