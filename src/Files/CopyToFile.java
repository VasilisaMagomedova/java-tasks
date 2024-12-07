package Files;

import java.io.*;

public class CopyToFile {
//    Напишите программу, которая копирует содержимое файла source.txt в файл destination.txt
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/Files/source.txt");
            FileOutputStream fos = new FileOutputStream("src/Files/destination.txt");
            byte[] buffer = new byte[256];
            int count;
            while(fis.read(buffer) != -1){
                count = fis.read(buffer);
                fos.write(buffer, 0, count);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка обработки файла");
        }
    }
}
