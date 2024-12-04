package Stream_API;
import java.util.*;

public class FirstMatchToA {
    public static void main(String[] args) {
//        Напишите метод, который принимает список строк List<String> и возвращает первую строку,
//        начинающуюся с буквы "A" (без учёта регистра). Если такой строки нет, верните строку
        List<String> stringsList = Arrays.asList("dog", "cat", "apple", "Ant");
        List<String> stringsList2 = Arrays.asList("dog", "cat", "Ant", "apple");
        List<String> stringsList3 = Arrays.asList("dog", "cat", "monkey");

        String resultString = stringsList.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("A"))
                .findFirst()
                .orElse("Нет подходящей строки");
        String resultString2 = stringsList2.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("A"))
                .findFirst()
                .orElse("Нет подходящей строки");
        String resultString3 = stringsList3.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("A"))
                .findFirst()
                .orElse("Нет подходящей строки");

        System.out.println(resultString);
        System.out.println(resultString2);
        System.out.println(resultString3);
    }
}
