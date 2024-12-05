package Abstract_Classes_And_Interfaces;

public class Task2Freelancer implements Task2Payable {
    int paymentForTask = 5000;
    int tasksQuantity = 10;

    @Override
    public int getPaymentAmount() {
        return paymentForTask * tasksQuantity;
    }


}
