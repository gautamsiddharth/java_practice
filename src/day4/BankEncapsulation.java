package day4;

public class BankEncapsulation {

    public static void main(String[] args) {
        Account account1 = new Account();
   //     account1.accountNumber = "1";
        account1.setAccountNumber("1");
     //   account1.accountHolderName = "Sid";
        account1.setAccountHolderName("Sid");
      //  account1.accountBalance = 500;
        account1.setAccountBalance(500);




        Account account2 = new Account();
        account2.setAccountNumber("2");
        account2.setAccountHolderName("Ram");
        account2.setAccountBalance(1000);


        System.out.println(" ************  Before Transfer ************");
        System.out.println("Account 2: "+  account2.getAccountBalance());
        System.out.println("Account 1: "+ account1.getAccountBalance());

        //Transferring balance from account2 to account1
        account1.transferBalance(account2, account1, 500);

        System.out.println(" ************  After Transfer ************");
        System.out.println("Account 2: "+  account2.getAccountBalance());
        System.out.println("Account 1: "+ account1.getAccountBalance());



        //Interest Calculation
        account1.addinterest(account1);





    }


}
