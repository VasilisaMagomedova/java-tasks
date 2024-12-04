package Stream_API;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByLength {
//    Напишите метод, который принимает список строк List<String> и возвращает карту Map<Integer, List<String>>,
//    где ключом является длина строки, а значением — список всех строк этой длины
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("cat", "dog", "elephant", "ant", "monkey", "fish", "wolf");
        Map<Integer, List<String>> stringsMap = stringsList.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(stringsMap);
    }
}
