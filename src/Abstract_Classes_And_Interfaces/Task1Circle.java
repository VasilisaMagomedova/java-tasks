package Abstract_Classes_And_Interfaces;

public class Task1Circle extends Task1Shape {
    private int radius;

    public Task1Circle(int radius) {
        this.radius = radius;
    }

    @Override
    int calculateArea() {
        return (int) (Math.pow(radius, 2) * Math.PI);
    }
}
