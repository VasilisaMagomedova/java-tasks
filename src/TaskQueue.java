import java.util.*;

public class TaskQueue {
//    Напишите класс TaskQueue, который использует Queue<String> для хранения задач. Реализуйте методы:
//    - добавляет задачу в очередь.
//    - удаляет и возвращает задачу из очереди. Если задач нет, возвращает сообщение: "Очередь пуста".

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
