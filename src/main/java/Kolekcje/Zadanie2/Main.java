package Kolekcje.Zadanie2;

import java.util.*;

/*      Funkcja zwraca mapę przypisującą każdej wartości jej ilość wystąpień w liście "values".
        public <T> Map<T, Integer> countOccurrences(List<T> values) {
        throw new UnsupportedOperationException("Not implemented yet");  }    */
public class Main {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1, 15, 66, 1, 19, 25, 1, 66));
        System.out.println(countOccurences(listOfIntegers));

    }

    private static Map<Integer, Integer> countOccurences(List<Integer> values) {
        Map<Integer, Integer> occurences = new HashMap<>();
        for (Integer i : values) {
            if (occurences.containsKey(i)) {
                occurences.replace(i, occurences.get(i) + 1);
            } else {
                occurences.put(i, 1);
            }
        }
        return occurences;
    }
}