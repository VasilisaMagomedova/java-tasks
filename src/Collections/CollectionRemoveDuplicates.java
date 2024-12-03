package Collections;

import java.util.*;

public class CollectionRemoveDuplicates {
//    Напишите метод, который принимает список чисел List<Integer> и возвращает новый список,
//    содержащий только уникальные элементы, сохраняя их порядок
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 8, 8, 1, 1, 2, 5);
        List<Integer> resultNumbers = CollectionRemoveDuplicates.removeDuplicates(numbers);
        System.out.println(resultNumbers);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }
}
