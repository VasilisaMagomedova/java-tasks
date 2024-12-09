package Threads;

public class Buffer extends Thread {
//    Реализуйте класс Buffer, который использует очередь ограниченного размера для хранения данных.
//    Поток "производитель" добавляет данные в очередь, а поток "потребитель" извлекает данные.
//    Используйте методы wait() и notify() для синхронизации потоков
    public static void main(String[] args) {
        QueueThread Thread = new QueueThread();
        new Thread(Thread::consume).start();
        new Thread(Thread::produce).start();
    }
}
