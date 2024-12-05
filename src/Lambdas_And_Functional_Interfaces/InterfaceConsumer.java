package Lambdas_And_Functional_Interfaces;
import java.util.*;
import java.util.function.*;

public class InterfaceConsumer {
//    Создайте метод processElements с параметрами:
//    список объектов типа List<T>.
//    объект интерфейса Consumer<T>.
//    Метод должен применять переданное действие к каждому элементу списка.
//            Пример: передайте в метод список чисел {1, 2, 3, 4, 5} и лямбда-выражение, умножающее каждое число на 2
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> multiply = x -> System.out.println(x * 2);
        processElements(numbersList, multiply);
    }

    public static void processElements(List<Integer> numbersList, Consumer<Integer> multiply) {
        for (Integer i: numbersList) {
            multiply.accept(i);
        }
    }
}
