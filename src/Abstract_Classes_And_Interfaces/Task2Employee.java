package Abstract_Classes_And_Interfaces;

public class Task2Employee implements Task2Payable {
    int paymentAmount = 100000;

    @Override
    public int getPaymentAmount() {
        return paymentAmount;
    }
}
