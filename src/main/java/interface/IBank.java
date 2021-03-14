public interface IBank {
    boolean addBranch( String branchName);
    boolean addCustomer(String branchName, String customer, double initTransaction);
    boolean addCustomerTransaction(String branchName, String customer, double tansaction);
    boolean findBranch(String branchName, String customer,double transaction );
    boolean listCustomers(String branchName, boolean printTransactions);
}
