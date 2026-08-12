public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factorial(5));
    }
}
