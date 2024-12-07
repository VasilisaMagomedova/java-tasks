package Files;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class DeleteStringFromFile {
//    Реализуйте программу, которая удаляет строки, содержащие определенное слово, из файла input.txt.
//    Результат должен быть записан в новый файл output.txt
    public static void main(String[] args) {
        try {
            List<String> stringsList = Files.readAllLines(Paths.get("src/Files/input.txt"));
            List<String> filteredStrings = stringsList.stream()
                    .filter(s -> !s.contains("Java"))
                    .collect(Collectors.toList());
            Files.write(Paths.get("src/Files/output.txt"), filteredStrings);
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла");
        }
    }
}
