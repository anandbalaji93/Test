import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerServiceImpl {
    Set<Customer> customerSet = new HashSet<>();

    public void addCustomer(Customer c) {
        customerSet.add(c);
    }

    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.addCustomer(new Customer(26, "Anand"));
        customerService.addCustomer(new Customer(27, "Prabhu"));
        customerService.addCustomer(new Customer(27, "Wrabhu"));
        customerService.addCustomer(new Customer(27, "Xrabhu"));
        customerService.addCustomer(new Customer(27, "Brabhu"));
        customerService.addCustomer(new Customer(27, "Xrabhu"));
        System.out.println(customerService.customerSet);
    }
}
