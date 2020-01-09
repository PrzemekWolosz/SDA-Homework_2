package Rekurencja.Silnia;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    private static int factorial(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException("To calculate factorial number must be greater than zero");
        } else {
//            if (n == 0) {
//                return 1;
//            } else {
//                return n * factorial(n - 1);
//            }
            return n == 0 ? 1 : n * factorial(n - 1);
        }
    }
}
