import java.util.ArrayList;

public class Branch implements IBranch{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    @Override
    public boolean newCustomer(String customerName, double initTransaction) {
        //customers.add(name,initTransaction);
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String customerName, double transaction) {

        return false;
    }

    @Override
    public Customer findCustomer(String customerName) {
        //Returns customer only if customer exits
        for (int i =0; i < this.customers.size(); i++){
            Customer customer =  this.customers.get(i);
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }

        return null;
    }
}
