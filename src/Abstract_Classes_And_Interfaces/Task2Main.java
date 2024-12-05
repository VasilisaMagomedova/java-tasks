package Abstract_Classes_And_Interfaces;

public class Task2Main {
    public static void main(String[] args) {
        Task2Employee employee = new Task2Employee();
        Task2Freelancer freelancer = new Task2Freelancer();

        System.out.println("Зарплата работника: " + employee.getPaymentAmount());
        System.out.println("Зарплата фрилансера: " + freelancer.getPaymentAmount());
    }
}
