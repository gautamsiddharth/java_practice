package day4;

public class BankEncapsulation {

    public static void main(String[] args) {
        Account account1 = new Account();
   //     account1.accountNumber = "1";
        account1.setAccountNumber("1");
     //   account1.accountHolderName = "Sid";
        account1.setAccountHolderName("Sid");
      //  account1.accountBalance = 500;
     //   account1.deposit(account1, 500);
        account1.deposit(500);  //I

        Account account2 = new Account();
        account2.setAccountNumber("2");
        account2.setAccountHolderName("Ram");
      //  account2.deposit(account1, 1000);
        account2.deposit(1000);  //implicit parameter

        //Interest Calculation
        account1.addinterest();

        System.out.println(" ************  Before Transfer ************");
        System.out.println("Account 2: "+  account2.getAccountBalance());
        System.out.println("Account 1: "+ account1.getAccountBalance());

        //Transferring balance from account2 to account1
      //  account2.transferBalance(account2, account1, 500);
        account2.transferBalance(account1, 500); //implicit parameter

        System.out.println(" ************  After Transfer ************");
        System.out.println("Account 2: "+  account2.getAccountBalance());
        System.out.println("Account 1: "+ account1.getAccountBalance());









    }


}
