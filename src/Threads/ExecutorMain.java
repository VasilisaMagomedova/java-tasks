package Threads;
import java.util.*;
import java.util.concurrent.*;

public class ExecutorMain {
//    Напишите программу, которая обрабатывает массив чисел. Для каждого числа создайте задачу, которая
//    вычисляет его квадрат. Используйте пул потоков через ExecutorService для выполнения задач.
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(10, 6, 4, 3, 5, 7);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 3; i++) {
            executorService.execute(() -> {
                Thread currentThread = Thread.currentThread();
                for (int n: numbersList) {
                    System.out.println(currentThread.getName() + ". Число: " + n + ". Квадрат числа: " + Math.round(Math.pow(n, 2)));
                }
            });
        }
        executorService.shutdown();
    }
}
