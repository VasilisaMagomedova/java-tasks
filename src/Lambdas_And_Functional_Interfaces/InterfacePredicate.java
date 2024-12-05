package Lambdas_And_Functional_Interfaces;

import java.util.*;
import java.util.function.*;

public class InterfacePredicate {
    public static void main(String[] args) {
//        У вас есть список чисел: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}.
//        Используйте лямбда-выражение для фильтрации только четных чисел и выведите их на экран
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> filter = x -> x % 2 == 0;

        List<Integer> result = new ArrayList<>();
        for (Integer i: numbers) {
            if (filter.test(i)) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
