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

    public void handleCustomer(Customer cust, Product pruduct){
        if(pruduct.getPrice() <= cust.getCashOnHand()){
            processTransaction(cust,  pruduct);
        }else{
            System.out.println("Customer will need more money to purchase: " + pruduct);
        }
    }
    public void processTransaction(Customer cust, Product pruduct){
        System.out.println("Customer has purchased the product: " + pruduct+ "for the price: " + pruduct.getPrice());
    }
}
