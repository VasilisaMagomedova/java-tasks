package Stream_API;
import java.util.*;
import java.util.stream.*;

public class FilteredStream {
    // Напишите метод, который принимает список строк List<String> и возвращает список,
    // содержащий строки длиной больше 3 символов, преобразованные в верхний регистр
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("cat", "elephant", "dog", "fish", "ant", "monkey");
        List<String> filteredStream = stringsList.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredStream);
    }
}
