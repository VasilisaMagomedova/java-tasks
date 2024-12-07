package Exceptions;

public class UserMain {
//    Создайте свое пользовательское исключение InvalidAgeException. Реализуйте метод
//    registerUser(String name, int age), который выбрасывает исключение, если возраст пользователя меньше 18 лет.
//    Напишите программу, которая вызывает этот метод и обрабатывает исключение.
    public static void main(String[] args) {
        try {
            System.out.println(User.registerUser("Tom", 26));
            System.out.println(User.registerUser("Bob", 16));
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage() + " (" + e.getAge() + ")");
        }
    }
}
