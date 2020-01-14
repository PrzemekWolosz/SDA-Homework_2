package Kolekcje.Zadanie1;

/*   * Funkcja zwraca zbiór wartości, które występują więcej niż raz w liście "values".
     * Uwaga: rozwiązanie musi działać w czasie O(n).
public <T> Set<T> findDuplicates(List<T> values) {
        throw new UnsupportedOperationException("Not implemented yet"); */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(2, 17, 99, 3, 2, 2, 2, 99));

        System.out.println(findDuplicates(listOfIntegers));

    }

    private static Set<Integer> findDuplicates(List<Integer> values) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        if (values.size() < 2) {
            throw new UnsupportedOperationException("List contains less than 2 Integers");
        } else {
            for (Integer i : values) {
                if (temp.contains(i)) {
                    duplicates.add(i);
                }
                temp.add(i);
            }
        }
        return duplicates;
    }
}
