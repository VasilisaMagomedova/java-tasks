package Abstract_Classes_And_Interfaces;

public class Task4Main {
    public static void main(String[] args) {
        Task4Dog dog = new Task4Dog();
        Task4Tiger tiger = new Task4Tiger();

        System.out.println(dog.makeSound("Гав!"));
        System.out.println(dog.play());
        System.out.println(tiger.makeSound("Ррр!"));
        System.out.println(tiger.hunt());
    }
}
