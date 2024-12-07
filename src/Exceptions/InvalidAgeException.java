package Exceptions;

public class InvalidAgeException extends Exception {
    private int age;
    public int getAge() {
        return age;
    }

    public InvalidAgeException(String message, int age){
        super(message);
        this.age = age;
    }
}
