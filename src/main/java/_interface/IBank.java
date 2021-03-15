
public interface IBank {
    boolean addBranch( String branchName);
    boolean addCustomer(String branchName, String customerName, double initTransaction);
    boolean addCustomerTransaction(String branchName, String customerName, double transaction);
    Branch findBranch(String branchName );
    boolean listCustomers(String branchName, boolean printTransactions);
}
