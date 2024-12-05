package Lambdas_And_Functional_Interfaces;

import java.util.Scanner;
import java.util.function.BiFunction;

public class InterfaceBifunction {
//    Создайте метод, который принимает два числа и объект типа BiFunction<Integer, Integer, Integer>.
//    Метод должен возвращать результат применения переданной функции к двум числам.
//    Пример вызова: передайте лямбда-выражение, выполняющее сложение или умножение двух чисел
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        BiFunction<Integer, Integer, Integer> result = (a, b) -> a * b;
        System.out.println(result.apply(number, number2));
    }
}
