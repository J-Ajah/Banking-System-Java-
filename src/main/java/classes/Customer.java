package classes;
import interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double>  transactions;

    public Customer(String name, double initTransaction) {
        this.name = name;
        transactions = new ArrayList<>();
        addTransaction(initTransaction);
    }

    @Override
    public String getName() {
      return this.name;
    }

    @Override
    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    @Override
    public void addTransaction(double transaction) {
      this.transactions.add(transaction);
    }

}
