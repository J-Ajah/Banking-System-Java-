import java.util.ArrayList;

public interface IBranch {
    String getName();
    ArrayList<Customer> getCustomers();
    boolean newCustomer( String customerName, double initTransaction);
    boolean addCustomerTransaction(String customerName, double transaction);
    Customer findCustomer(String customerName);

}
