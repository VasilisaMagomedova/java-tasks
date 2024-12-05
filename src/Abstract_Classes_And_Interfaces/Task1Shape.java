package Abstract_Classes_And_Interfaces;

public abstract class Task1Shape {
    public static void main(String[] args) {
        Task1Rectangle rectangle = new Task1Rectangle(4, 5);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        Task1Circle circle = new Task1Circle(2);
        System.out.println("Площадь круга: " +circle.calculateArea());
    }

    abstract int calculateArea();
}