public class Market {
    public static void main(String[] args){

        Section dep1 = new Section("Butcher shop");
        Employee emp = new Employee("Josias", 22, dep1);
        Product beef = new Product("Beef", 20, 3);
        Customer customer = new Customer("Helber", 80);

        customer.purchase(beef, emp);
        System.out.println("------------------------------");
        emp.infoEmployee(emp);

    }


}
