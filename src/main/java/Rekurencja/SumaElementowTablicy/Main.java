package Rekurencja.SumaElementowTablicy;

public class Main {
    public static void main(String[] args) {
        int[] table = {4, 5, 6};

        System.out.println(sumRecursive(table, table.length -1));

    }

    private static int sumRecursive(int[] numbers, int tabIndex) {
        if (numbers.length == 0) {
            throw new UnsupportedOperationException("Table is empty");
        } else {
            if (numbers.length == 1) {
                return numbers[0];
            } else  if (tabIndex >= 0) {
                return numbers[tabIndex] + sumRecursive(numbers, tabIndex -1);
            } else {
                return 0;
            }
        }
    }
}
