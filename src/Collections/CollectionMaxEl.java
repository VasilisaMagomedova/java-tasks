package Collections;

import java.util.*;

public class CollectionMaxEl {
//    Напишите метод, который принимает список чисел List<Integer> и возвращает максимальный элемент списка.
//    Если список пустой, выбросьте исключение IllegalArgumentException
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(10, 20, 30, 40, 50);
        System.out.print(CollectionMaxEl.findMaxEl(numbersList) + "\n");
        List<Integer> emptyNumbersList = Arrays.asList();
        System.out.print(CollectionMaxEl.findMaxEl(emptyNumbersList));
    }

    public static int findMaxEl(List<Integer> numbersList) {
        try {
            return Collections.max(numbersList);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Передан пустой список чисел!");
        }
    }
}
