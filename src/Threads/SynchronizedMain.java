package Threads;

public class SynchronizedMain {
//    Реализуйте программу, где несколько потоков (например, 5) одновременно пытаются увеличить значение общего
//    счетчика. Используйте ключевое слово synchronized для предотвращения гонки потоков.
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++){
            SynchronizedThreads t = new SynchronizedThreads();
            t.setName("Thread "+ i);
            t.start();
        }
    }
}
