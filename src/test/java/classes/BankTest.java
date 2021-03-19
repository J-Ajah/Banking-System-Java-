package classes;

import org.junit.Test;


import java.lang.reflect.ReflectPermission;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void addBranch() {
         Bank bank = new Bank("National Australia Bank");
         String branchName = "Adelaide";


         assertTrue(bank.addBranch(branchName));

         // adding an already exiting branch again
        assertFalse(bank.addBranch(branchName));



    }

    @Test
    public void addCustomer() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        bank.addBranch(branchName);

        //Testing to see if a customer can be added to a specific branch
        assertTrue(bank.addCustomer(branchName,"Tim",50.05));

        //Testing for null customers
        assertFalse(bank.addCustomer(null,"Michael",120));
    }

    @Test
    public void addCustomerTransaction() {
        Bank bank = new Bank("National Australia Bank");
        String branchName = "Adelaide";
        bank.addBranch(branchName);
        boolean status = bank.addCustomerTransaction(branchName,"Tim",50.05);
        assertTrue(status);

        //  Case2 : Testing for a non existing branch
        assertFalse(bank.addCustomerTransaction(null,"Tim",50.05));

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
        assertFalse(bank.listCustomers("Takoradi",true));
    }
}