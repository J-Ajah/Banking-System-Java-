package classes;
import interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double>  transactions;

    public Customer(String name, double initTransaction) {
        this.name = name;
        transactions = new ArrayList<>();
        addTansaction(initTransaction);
    }

    @Override
    public String getName() {
      return this.name;
    }

    @Override
    public ArrayList<Double> getTansactions() {
        return this.transactions;
    }

    @Override
    public void addTansaction(double transaction) {
      this.transactions.add(transaction);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
