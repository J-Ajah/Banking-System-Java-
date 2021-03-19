package interfaces;

import classes.Branch;

public interface IBank {
    boolean addBranch( String branchName);
    boolean addCustomer(String branchName, String customerName, double initTransaction);
    boolean addCustomerTransaction(String branchName, String customerName, double transaction);
    boolean listCustomers(String branchName, boolean printTransactions);
}
