import java.util.*;

public class CollectionReversed {
//    Напишите метод, который принимает список чисел List<Integer> и возвращает новый список,
//    содержащий те же элементы в обратном порядке
    public static List<Integer> reverseList(List<Integer> listOfNumbers) {
        Collections.reverse(listOfNumbers);
        return listOfNumbers;
    }
}
