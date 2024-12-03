package Collections;

import java.util.*;

public class CollectionReversed {
//    Напишите метод, который принимает список чисел List<Integer> и возвращает новый список,
//    содержащий те же элементы в обратном порядке
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.print(CollectionReversed.reverseList(listOfNumbers));
    }

    public static List<Integer> reverseList(List<Integer> listOfNumbers) {
        Collections.reverse(listOfNumbers);
        return listOfNumbers;
    }
}
