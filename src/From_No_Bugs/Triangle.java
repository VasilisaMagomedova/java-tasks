package From_No_Bugs;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public double calculateArea() {
        double semiperimeter = (a + b + c) / 2;
        return Math.round(Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)));
    }

    public String printTriangleInfo() {
        return "Стороны треугольника: " + a + ", " + b + ", " + c + ". Периметр: " + calculatePerimeter() +
                ". Площадь: " + calculateArea();
    }
}
