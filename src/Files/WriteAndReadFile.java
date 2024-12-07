package Files;
import java.io.*;

public class WriteAndReadFile {
//    Создайте текстовый файл data.txt и напишите в него список строк. Затем прочитайте содержимое файла,
//    выведите его построчно в консоль и подсчитайте количество строк
    public static void main(String[] args) {
        // Создание файла и запись
        try {
            File data = new File("src/Files/data.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(data));
            bw.write("Java");
            bw.newLine();
            bw.write("Python");
            bw.newLine();
            bw.write("C#");
            bw.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }

        // Чтение файла
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Files/data.txt"));
            int count = 0;
            while (br.ready()) {
                System.out.println("Строка файла: " + br.readLine());
                count +=1;
            }
            System.out.println("Количество строк: " + count);
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
    }
}
