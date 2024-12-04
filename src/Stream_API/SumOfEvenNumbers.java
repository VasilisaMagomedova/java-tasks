package Stream_API;
import java.util.*;

public class SumOfEvenNumbers {
//    Напишите метод, который принимает список чисел List<Integer> и возвращает сумму всех чётных чисел из списка
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6);
        int resultList = numbersList.stream()
                .filter(i -> i % 2 == 0)
                .reduce(Integer::sum)
                .get();
        System.out.println(resultList);
    }
}
