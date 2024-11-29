public class TaskSolver {
    public boolean canDivideBy5And7(int a) {
//        Напишите функцию, которая принимает целое число и возвращает true, если оно делится на 5 и на 7
//        одновременно, и false в противном случае
        return a % 5 == 0 && a % 7 == 0;
    }

    public boolean isBetween10And20 (int b) {
//        Создайте функцию, которая принимает число и проверяет, входит ли оно в интервал от 10 до 20
//        включительно. Если число попадает в интервал, верните true, иначе — false
        return b >=10 && b <= 20;
    }

    public boolean isSquareOfTheNumber (int c, int d) {
//        Напишите функцию, которая принимает два числа и возвращает true, если одно из чисел является
//        квадратом другого, и false в противном случае.
        return Math.pow(c, 2) == d || Math.pow(d, 2) == c;
    }
}
