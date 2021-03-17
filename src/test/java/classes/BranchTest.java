package classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {

    @Test
    public void getName() {
        Branch branch = new Branch("Adelaide");
        assertEquals("Adelaide",branch.getName());
    }

    @Test
    public void getCustomers() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        //adds branch to the list of branches
        bank.addBranch(branchName);
        //adds customers to bank branch
        bank.addCustomer(branchName,"Tim",50.05);
        bank.addCustomer(branchName,"Mike",175.34);
        //finds branch
        Branch branch = bank.findBranch(branchName);
        assertNotNull(branch.getCustomers());

        //Case 2
        String branchTwo = "Takoradi";
        //adds branch to the list of branches that are available
        bank.addBranch(branchTwo);
        Branch branches = bank.findBranch(branchTwo);

        //If no customer is been added to the branch list
        assertTrue(branches.getCustomers().isEmpty());
    }

    @Test
    public void newCustomer() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        bank.addBranch(branchName);
        Branch branch = bank.findBranch(branchName);
        assertTrue(branch.newCustomer("Tim",50.05));
        assertFalse(branch.newCustomer("Tim",50.05));


    }

    @Test
    public void addCustomerTransaction() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        bank.addBranch(branchName);
        Branch branch = bank.findBranch(branchName);
        branch.newCustomer("Tim",50.05);
        boolean status = branch.addCustomerTransaction("Tim",60.00);

        boolean status2 = branch.addCustomerTransaction("Mike",60.00);
        assertTrue(status);
        assertFalse(status2);
    }

    @Test
    public void findCustomer() {
        Bank bank = new Bank("National Australia Bank");String branchName = "Adelaide";
        bank.addBranch(branchName);
        Branch branch = bank.findBranch(branchName);
        branch.newCustomer("Tim",50.05);
       Customer customer =  branch.findCustomer("Tim");
       assertNotNull(customer);

       Customer customer1 =  branch.findCustomer("Mike");
       assertNull(customer1);

    }
}