package Threads;

public class SynchronizedThreads extends Thread {
    @Override
    public synchronized void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + ". Counter " + i);
        };
    }
}
