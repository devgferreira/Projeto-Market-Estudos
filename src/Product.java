public class Product {
    private String Name;
    private double Price;
    private int Amount;

    public Product(String name, int price, int amount) {
        Name = name;
        Price = price;
        Amount = amount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public void Sum(Product product){
        for(int i = 1; product.getAmount() > i; i++){
            double newPrice = product.getPrice() + product.getPrice();
            setPrice(newPrice);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Amount=" + Amount +
                '}';
    }
}
