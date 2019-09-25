public class Recursion {

    // Summation -> 5 -> 5 + 4 + 3 + 2 + 1 = 15;
    public static int summation(int n) {
        // base case
        if(n <= 0) {
            return 0;
        } else {
            // recursive case
            return n + summation(n - 1);
        }
    }


    public static int factorial(int m) {
        if(m <= 1) {
            return 1;
        } else {
            return m * factorial(m - 1);
        }
    }

    public static int exponentiation(int o, int p) {
        if(p <= 0) {
            return 1;
        } else {
            return o * exponentiation(o, p - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summation(5));
        System.out.println(factorial(5));
        System.out.println(exponentiation(5, 3));
    }
}
