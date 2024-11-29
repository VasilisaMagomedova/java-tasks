public class Main {
    public static void main(String[] args) {
        TaskSolver taskSolver = new TaskSolver();
        System.out.println(taskSolver.canDivideBy5And7(35));
        System.out.println(taskSolver.canDivideBy5And7(10));
        System.out.println("----------");

        System.out.println(taskSolver.isBetween10And20(10));
        System.out.println(taskSolver.isBetween10And20(23));
        System.out.println("----------");

        System.out.println(taskSolver.isSquareOfTheNumber(2, 4));
        System.out.println(taskSolver.isSquareOfTheNumber(9, 3));
        System.out.println(taskSolver.isSquareOfTheNumber(6, 5));
        System.out.println("----------");
    }
}