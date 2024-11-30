public class TaskSolver {
    public boolean canDivideBy5And7(int a) {
//        Напишите функцию, которая принимает целое число и возвращает true, если оно делится на 5 и на 7
//        одновременно, и false в противном случае
        return a % 5 == 0 && a % 7 == 0;
    }

    public boolean isBetween10And20 (int a) {
//        Создайте функцию, которая принимает число и проверяет, входит ли оно в интервал от 10 до 20
//        включительно. Если число попадает в интервал, верните true, иначе — false
        return a >= 10 && a <= 20;
    }

    public boolean isSquareOfTheNumber (int a, int b) {
//        Напишите функцию, которая принимает два числа и возвращает true, если одно из чисел является
//        квадратом другого, и false в противном случае.
        return Math.pow(a, 2) == b || Math.pow(b, 2) == a;
    }

    public boolean endsOn5 (int a) {
//        Создайте функцию, которая принимает число и проверяет, заканчивается ли оно на 5. Верните true,
//        если заканчивается, и false, если нет
        return a % 10 == 5;
    }

    public boolean isSumOfDigitsEven(int a) {
//        Реализуйте функцию, которая принимает число, суммирует его цифры и возвращает true, если сумма четная,
//        и false, если нечетная
        int sumOfDigits = 0;
        while (Math.abs(a) > 0) {
            int b = a % 10;
            sumOfDigits += b;
            a /= 10;
        }
        return sumOfDigits % 2 == 0;
    }

    public boolean compareByModule (int a, int b) {
//        Напишите функцию, которая принимает два числа и возвращает true, если модули чисел равны,
//        и false в противном случае
        return Math.abs(a) == Math.abs(b);
    }

    public String checkSignOfNumber (int a) {
//        Создайте функцию, которая принимает число и возвращает "Positive", если оно положительное,
//        "Negative", если оно отрицательное, и "Zero", если оно равно нулю
        if (a > 0) {
            return "Positive";
        } else if (a < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public boolean canDivideBy2Or3 (int a) {
//        Напишите функцию, которая принимает число и возвращает true, если оно делится на 2 или на 3,
//        и false в противном случае
        return a % 2 == 0 || a % 3 == 0;
    }

    public String isSumOfNumbersEven (int a, int b) {
//        Создайте функцию, которая принимает два числа и возвращает "Even", если сумма чисел четная,
//        и "Odd", если нечетная
        if ((a + b) % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public String isSumOfNumbersEvenAndCanDivideBy10(int a, int b) {
//        Реализуйте функцию, которая принимает два числа и возвращает "Even and Divisible by 10",
//        если их сумма четная и делится на 10, "Even but not Divisible by 10", если сумма четная, но не делится
//        на 10, и "Odd", если сумма нечетная
        if ((a + b) % 2 == 0 && (a + b) % 10 == 0) {
            return "Even and Divisible by 10";
        } else if ((a + b) % 2 == 0) {
            return "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }

    public int MaxNumber (int a, int b, int c) {
//        Напишите функцию, которая принимает три числа и возвращает наибольшее из них
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public boolean isPalindrome (int a) {
//        Создайте функцию, которая принимает целое число и проверяет, является ли оно палиндромом.
//        Верните true, если да, и false, если нет
        String numberToStr = Integer.toString(a);
        StringBuilder sb = new StringBuilder(numberToStr).reverse();
        String reversedStr = sb.toString();
        return numberToStr.equals(reversedStr);
    }

    public int divisibilityOfNumbersBy3(int a, int b) {
//        Реализуйте функцию, которая принимает два числа. Если оба числа кратны 3, верните их сумму;
//        если одно из них кратно 3, верните удвоенное значение второго числа;
//        если ни одно не кратно 3, верните 0
        if (a % 3 == 0 && b % 3 == 0) {
            return a + b;
        } else if (a % 3 == 0) {
            return 2 * b;
        } else if (b % 3 == 0) {
            return 2 * a;
        } else {
            return 0;
        }
    }
}
