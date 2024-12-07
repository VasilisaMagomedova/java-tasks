package Lambdas_And_Functional_Interfaces;
import java.util.*;

public class InterfaceComparator {
//    Есть список объектов класса Person с полями name (строка) и age (число).
//    Отсортируйте этот список по возрасту с использованием Comparator. Если возраст одинаковый,
//    отсортируйте по имени
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 25);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Alisha", 25);
        Person person4 = new Person("Jake", 42);
        Person person5 = new Person("Carol", 30);
        Person person6 = new Person("Pam", 15);

        List<Person> personsList = new ArrayList<>();
        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);
        personsList.add(person4);
        personsList.add(person5);
        personsList.add(person6);

        Comparator<Person> personComparator = Comparator.comparing(Person::getAge).thenComparing(Person::getName);
        personsList.sort(personComparator);
        for(Person p: personsList) {
            System.out.println(p);
        }
    }
}
