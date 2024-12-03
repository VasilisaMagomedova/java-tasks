package Collections;

import java.util.*;

public class CollectionMergeAndSort {
//Напишите метод, который принимает два списка строк List<String> и возвращает новый список,
// содержащий объединенные элементы обоих списков в отсортированном порядке.
    public static void main(String[] args) {
        List<String> strings1 = Arrays.asList("apple", "banana", "apple", "cherry", "mango");
        List<String> strings2 = Arrays.asList("cherry", "banana", "pineapple", "broccoli", "mango");
        System.out.print(CollectionMergeAndSort.mergeAndSort(strings1, strings2));
    }

    public static List<String> mergeAndSort (List<String> strings1, List<String> strings2) {
        List<String> resultStrings = new ArrayList<>(strings1);
        resultStrings.addAll(strings2);
        resultStrings.sort(null);
        return resultStrings;
    }
}
