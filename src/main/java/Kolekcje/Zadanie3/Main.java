package Kolekcje.Zadanie3;

/*      Funkcja zwraca zbiór wszystkich wartości występujących w obu podanych listach.
        public <T> Set<T> findCommonValues(List<T> list1, List<T> list2) {
        throw new UnsupportedOperationException("Not implemented yet"); */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 5, 6, 9, 9, 1, 10));

        System.out.println(findCommonValues(list1, list2));

    }

    private static Set<Integer> findCommonValues(List<Integer> list1, List<Integer> list2) {
        Set<Integer> commonValues = new HashSet<>();

        for (Integer i : list1) {
            if (list2.contains(i)) {
                commonValues.add(i);
            }
        }
        return commonValues;
    }
}
