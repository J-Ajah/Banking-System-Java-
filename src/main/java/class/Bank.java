import java.util.ArrayList;

public class Bank implements IBank{
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    @Override
    public boolean addBranch(String branchName) {
        return false;
    }
    public boolean addCustomer(String branchName, String customer, double initTransaction) {
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String branchName, String customer, double tansaction) {
        return false;
    }

    @Override
    public boolean findBranch(String branchName, String customer, double transaction) {
        return false;
    }

    @Override
    public boolean listCustomers(String branchName, boolean printTransactions) {
        return false;
    }
}
