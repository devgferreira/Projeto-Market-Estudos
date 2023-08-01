public class Customer {
    private String Name;
    private double CashOnHand;

    public Customer(String name, double cashOnHand) {
        Name = name;
        CashOnHand = cashOnHand;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getCashOnHand() {
        return CashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        CashOnHand = cashOnHand;
    }

    public void purchaseC(){}
}
