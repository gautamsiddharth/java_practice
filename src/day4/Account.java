package day4;

public class Account {

    private final float INTEREST_RATE = 0.025f; // no-one can change this interest rate
    private String accountNumber;
    private   String accountHolderName;
    private   double accountBalance;

     public String getAccountNumber() {
          return accountNumber;
     }

     public void setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
     }

     public String getAccountHolderName() {
          return accountHolderName;
     }

     public void setAccountHolderName(String accountHolderName) {
          this.accountHolderName = accountHolderName;
     }

     public double getAccountBalance() {
          return accountBalance;
     }

     private void setAccountBalance(double accountBalance) {
          this.accountBalance = accountBalance;
     }


     //deposit

    public void deposit(Account account, double amount){
         this.accountBalance += amount;
    }
     //transfer balance

     public  void transferBalance( Account fromaccount, Account toaccount , double amountToBeTransfered){

          //TODO "check if sufficient balance or not
          fromaccount.setAccountBalance(fromaccount.getAccountBalance()-amountToBeTransfered);
          toaccount.setAccountBalance(toaccount.getAccountBalance()+amountToBeTransfered);

     }

     //add interest

    public void addinterest( Account account){

        double interest = (account.getAccountBalance() * 1 * INTEREST_RATE);
        System.out.println("Principle : " + account.getAccountBalance());
        System.out.println("Interest : " + interest);
        account.setAccountBalance((account.getAccountBalance() + interest));
        System.out.println("Account Balance : " + account.getAccountBalance());
    }


}
