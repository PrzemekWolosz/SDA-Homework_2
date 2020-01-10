package Rekurencja.NWW;

public class Main {
    public static void main(String[] args) {

        System.out.println(LCM(125, 10));

    }

    private static int SCD(int a, int b) {
        return b != 0 ? SCD(b, a % b) : a;
    }

    private static int LCM(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Numbers must be positive");
        } else {
            return a * b / SCD(a, b);
        }
    }
}
