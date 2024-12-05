package Abstract_Classes_And_Interfaces;

public class Task3Car extends Task3Vehicle implements Task3Refuelable {
    public Task3Car(String brand) {
        super(brand);
    }

    @Override
    public String refuel() {
        return "Машина заправлена";
    }

    @Override
    public String startEngine() {
        return "Двигатель заведен";
    }
}
