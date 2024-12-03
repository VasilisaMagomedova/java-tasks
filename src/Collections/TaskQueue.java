package Collections;

import java.util.*;

public class TaskQueue {
//    Напишите класс Collections.TaskQueue, который использует Queue<String> для хранения задач. Реализуйте методы:
//    - добавляет задачу в очередь.
//    - удаляет и возвращает задачу из очереди. Если задач нет, возвращает сообщение: "Очередь пуста".
    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();
        queue.addTask(Arrays.asList("Сделать конспект", "Решить задачи"));
        System.out.println(queue.getNextTask());
        System.out.println(queue.getNextTask());
        System.out.println(queue.getNextTask());
    }

    Queue<String> queue = new LinkedList<>();
    public void addTask(List<String> tasksList) {
        queue.addAll(tasksList);
        System.out.println(queue);
    }
    public String getNextTask() {
        if (queue.isEmpty()) {
            return "Очередь пустая";
        } else {
            return queue.poll();
        }
    }
}
