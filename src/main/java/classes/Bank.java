package classes;
import interfaces.IBank;

import java.util.ArrayList;

public class Bank implements IBank {
    private String name;
    private static ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    @Override
    public boolean addBranch(String branchName) {
        Branch  branch = findBranch(branchName);
        // Adds branch if it is a new branch
        if(branch == null){
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }


    public boolean addCustomer(String branchName, String customerName, double initTransaction) {
            if(findBranch(branchName) != null){
              return findBranch(branchName).newCustomer(customerName,initTransaction);
            }
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        //Add customer to branch and transaction will fail if the customer is not in the specified branch
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addCustomerTransaction(customerName,transaction);
           return true;
        }

        return false;
    }

    @Override
    public Branch findBranch(String branchName) {

        for (int i =0; i < this.branches.size(); i++){
            Branch branch =  this.branches.get(i);

            if(branch.getName().equals(branchName)){
                return branch;
            }
        }

        return null;
    }

    @Override
    public boolean listCustomers(String branchName, boolean printTransactions) {

         Branch checkBranch = findBranch(branchName);
       if(checkBranch != null){
           System.out.println("Customer details for branch "+ branchName);

           ArrayList<Customer> branchCustomers = checkBranch.getCustomers();
           //printing the customers that is available in the specified branch
           for(int i = 0; i < branchCustomers.size(); i++){
               System.out.println("Customer: "+ branchCustomers.get(i).getName()+ "[" + (i + 1) +"]" );

               if(printTransactions){
                   System.out.println("Transactions");

                   ArrayList<Double> transaction  = branchCustomers.get(i).getTansactions();
                    //Prints the transactions that was made by the given customer
                   for(int j = 0; j <transaction.size(); j++){
                       System.out.println("[" + (j+1) +"]" + " Amount "+ transaction.get(j));
                   }

               }
           }

           return  true;
       }


        return false;
    }
}
