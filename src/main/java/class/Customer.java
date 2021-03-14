import java.util.ArrayList;

public class Customer implements ICustomer{
    private String name;
    private ArrayList<Double>  transactions;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    @Override
    public String getName() {
      return this.name;
    }

    @Override
    public ArrayList<Double> getTansaction() {
        return this.transactions;
    }

    @Override
    public void addTansaction(double transaction) {
      transactions.add(transaction);
    }
}
