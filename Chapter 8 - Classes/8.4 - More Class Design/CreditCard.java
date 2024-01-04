public class CreditCard {

    private final String name;

    private final double creditLimit;
    private double debt = 0;

    public CreditCard(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public CreditCard(String name) {
        this.name = name;
        this.creditLimit = 1000;
    }

    public String getName() {
        return name;
    }

    public double getDebt() {
        return debt;
    }

    public void makePayment(double amount) {
        debt -= amount;
    }

    public boolean makePurchase(double amount) {
        if (debt + amount > creditLimit) {
            return false;
        } else {
            debt += amount;
            return true;
        }
    }

}
