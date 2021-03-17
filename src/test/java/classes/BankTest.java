package classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void addBranch() {
         Bank bank = new Bank("National Australia Bank");
         String branchName = "Adelaide";
         bank.addBranch(branchName);

         assertEquals(branchName, bank.findBranch(branchName).getName());

    }

    @Test
    public void addCustomer() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        bank.addBranch(branchName);
        Branch branch = bank.findBranch(branchName);
        assertTrue(branch.newCustomer("Tim",50.05));


    }

    @Test
    public void addCustomerTransaction() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        bank.addBranch(branchName);
        boolean status = bank.addCustomerTransaction(branchName,"Tim",50.05);
        assertTrue(status);

    }

    @Test
    public void findBranch() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        bank.addBranch(branchName);
        Branch branch = bank.findBranch(branchName);
        assertNotNull(branch);

    }

    @Test
    public void listCustomers() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        bank.addBranch(branchName);
        bank.addCustomer(branchName,"Tim",50.05);
        bank.addCustomer(branchName,"Mike",175.34);

        bank.addCustomerTransaction(branchName,"Mike",1.65);
        assertTrue(bank.listCustomers("Adelaide", true));
    }
}