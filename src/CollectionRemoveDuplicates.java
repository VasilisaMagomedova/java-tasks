import java.util.*;

public class CollectionRemoveDuplicates {
//    Напишите метод, который принимает список чисел List<Integer> и возвращает новый список,
//    содержащий только уникальные элементы, сохраняя их порядок
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }
}
