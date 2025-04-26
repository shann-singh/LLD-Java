package lowLevelDesign.bookMyShow;

public class Payment {
    private int id;
    private double amount;

    public Payment(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String makePayment() {
        return "Payment successful";
    }
}
