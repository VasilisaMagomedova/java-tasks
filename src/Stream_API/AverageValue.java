package Stream_API;
import java.util.*;

public class AverageValue {
//    Напишите метод, который принимает список чисел List<Integer> и вычисляет их среднее арифметическое
//    с использованием Stream API. Если список пустой, метод должен вернуть Optional
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(10, 20, 30, 40);
        List<Integer> numbersList2 = Arrays.asList();

        Double averageValue = numbersList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        Double averageValue2 = numbersList2.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);


        System.out.println(averageValue);
        System.out.println(averageValue2);
    }
}
