package Exceptions;

public class User {
    public static String registerUser(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Возраст меньше 18 лет", age);
        } else {
            return "User: " + name + ", " + age;
        }
    }
}
