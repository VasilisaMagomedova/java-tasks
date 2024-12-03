import java.util.*;

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

        List<Integer> numbers = Arrays.asList(6, 8, 8, 1, 1, 2, 5);
        List<Integer> resultNumbers = CollectionRemoveDuplicates.removeDuplicates(numbers);
        System.out.println(resultNumbers);

        List<String> strings1 = Arrays.asList("apple", "banana", "apple", "cherry", "mango");
        List<String> strings2 = Arrays.asList("cherry", "banana", "pineapple", "broccoli", "mango");
        System.out.print(CollectionMergeAndSort.mergeAndSort(strings1, strings2) + "\n");

        List<String> listOfWords = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "banana");
        System.out.print(CollectionWordsFrequency.showWordsFrequency(listOfWords) + "\n");

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.print(CollectionReversed.reverseList(listOfNumbers) + "\n");

        List<Integer> numbersList = Arrays.asList(10, 20, 30, 40, 50);
        System.out.print(CollectionMaxEl.findMaxEl(numbersList));
        List<Integer> emptyNumbersList = Arrays.asList();
        System.out.print(CollectionMaxEl.findMaxEl(emptyNumbersList));

        TaskQueue queue = new TaskQueue();
        queue.addTask(Arrays.asList("Сделать конспект", "Решить задачи"));
        System.out.println(queue.getNextTask());
        System.out.println(queue.getNextTask());
        System.out.println(queue.getNextTask());
    }
}