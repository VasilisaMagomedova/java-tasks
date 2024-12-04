package Abstract_Classes_And_Interfaces;

public class Task1Rectangle extends Task1Shape {
    private int width;
    private int height;

    public Task1Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    int calculateArea() {
        return width * height;
    }
}
