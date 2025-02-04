package Chapter7;

public class AccountRunner {
    public static void main(String[] args) {
        Account account1 = new Account("2789654123","Agent 47 Hitman", BankAccountType.Loan,"123br");
    Account account2 = new Account("00000","Lady Smith",BankAccountType.Savings,"123br");
       // System.out.println(account.getBalance());

//        account.displayAccountDetails();
//        account.setAccountNumber("0123456789");
//        account.setBalance(125000.65);
//        account.setAccountType(Account.BankAccountType.Credit);
    account1.displayAccountDetails();
    account1.transfer(account2,5000);
    account2.displayAccountDetails();
    }


}
