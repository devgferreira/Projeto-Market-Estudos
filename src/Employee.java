public class Employee {
    private String Name;
    private int Age;
    private Section Section;

    public Employee(String name, int age, Section section) {
        Name = name;
        Age = age;
        Section = section;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void handleCustomer(Customer cust, Product product){
        if(product.getPrice() <= cust.getCashOnHand()){

            processTransaction(cust,  product);
        }else{
            System.out.println("Customer will need more money to purchase: " + product);
        }
    }
    public void processTransaction(Customer cust, Product product){
        product.Sum(product);
        System.out.println("Customer has purchased the product: " + product+ "for the price: " + product.getPrice());
    }
}
