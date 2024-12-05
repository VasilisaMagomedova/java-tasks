package Abstract_Classes_And_Interfaces;

public interface Task4Animal {
    default String makeSound(String sound) {
        return sound;
    };
}
