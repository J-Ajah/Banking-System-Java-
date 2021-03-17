package classes;
import interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
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
        //Checks if the customer exits. if customer doesn't it creates a new customer and adds initial transaction
        if(findCustomer(customerName) == null){
         this.customers.add(new Customer(customerName,initTransaction));

            return  true;
        }
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String customerName, double transaction) {
        //checks if customer exits. if true,
        if(findCustomer(customerName) != null){
            findCustomer(customerName).addTansaction(transaction);
            return  true;
        }
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

    @Override
    public String toString() {
        return this.name;
    }
}
