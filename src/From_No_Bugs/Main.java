package From_No_Bugs;

public class Main {
    public static void main(String[] args) {
        TaskSolver taskSolver = new TaskSolver();
        System.out.println(taskSolver.canDivideBy5And7(35));
        System.out.println(taskSolver.isBetween10And20(23));
        System.out.println(taskSolver.endsOn5(15));
        System.out.println(taskSolver.isSumOfDigitsEven(-6));
        System.out.println(taskSolver.compareByModule(15, -15));
        System.out.println(taskSolver.checkSignOfNumber(-7));
        System.out.println(taskSolver.canDivideBy2Or3(6));
        System.out.println(taskSolver.isSumOfNumbersEven(2, 4));
        System.out.println(taskSolver.isSumOfNumbersEvenAndCanDivideBy10(2, 6));
        System.out.println(taskSolver.MaxNumber(7, 9, 8));
        System.out.println(taskSolver.isPalindrome(1661));
        System.out.println(taskSolver.divisibilityOfNumbersBy3(3, 5));

        Book firstBook = new Book("Евгений Онегин", "М.Ю. Лермонтов", 200.50);
        firstBook.setAuthor("А.С. Пушкин");
        firstBook.setPrice(100);
        System.out.println("Книга: " + firstBook.getTitle() + ". Автор: " + firstBook.getAuthor()
                + ". Цена: " + firstBook.getPrice());

        Product firstProduct = new Product("яблоко", "фрукты", 5, 5.66);
        firstProduct.setQuantity(10);
        System.out.println(firstProduct.printProductInfo());

        Triangle firstTriangle = new Triangle(10, 12, 15);
        System.out.println(firstTriangle.printTriangleInfo());
    }
}