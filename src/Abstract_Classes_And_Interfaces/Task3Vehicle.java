package Abstract_Classes_And_Interfaces;

public abstract class Task3Vehicle {
    String brand;

    public Task3Vehicle(String brand) {
        this.brand = brand;
    }
    abstract String startEngine();

    public static void main(String[] args) {
        Task3Car car = new Task3Car("BMW");
        System.out.println(car.startEngine());
        System.out.println(car.refuel());
    }
}
