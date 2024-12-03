import java.util.*;

public class CollectionMaxEl {
//    Напишите метод, который принимает список чисел List<Integer> и возвращает максимальный элемент списка.
//    Если список пустой, выбросьте исключение IllegalArgumentException
    public static int findMaxEl(List<Integer> numbersList) {
        try {
            return Collections.max(numbersList);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Передан пустой список чисел!");
        }
    }
}
