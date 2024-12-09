package Threads;
import java.util.*;

public class QueueThread {
    Queue<String> bufferQueue = new LinkedList<>();

    public synchronized void produce() {
        bufferQueue.add("apple");
        bufferQueue.add("banana");
        bufferQueue.add("cherry");
        bufferQueue.add("mango");
        bufferQueue.add("melon");
        System.out.println("Method produce completed!");
        notify();
    }

    public synchronized void consume() {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bufferQueue);
    }
}
