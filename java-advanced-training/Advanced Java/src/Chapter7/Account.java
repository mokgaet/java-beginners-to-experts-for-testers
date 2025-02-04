package Chapter7;
/**
* Class to hold attributes and functions related to bank account
 */

enum BankAccountType {
    Savings, Cheque, Loan, Credit;
}
public class Account {

    private String accountNumber ,account_Holder , branchCode , bankName;
    private  BankAccountType accountType;
    private double balance;

    /**
    * An overloaded constructor with the following variable names
     * @param accountNumber Account Number
     * @param account_Holder Name of the Account Holder
     * @param accountType Type of the Account ( Savings , Cheques, Credit )
     * @param branchCode Branch Code of the Bank
     * balance   Current Balance in account
     * bankName Name of the Bank ( i.e FNB , ABSA , Capitec, Old Mutual , Tyme Bank)
     */
    public Account(String accountNumber , String account_Holder, BankAccountType accountType , String branchCode){
        this.accountNumber = accountNumber;
        this.account_Holder = account_Holder;
        this.accountType = accountType;
        initialBalance(this.accountType);
        this.branchCode = branchCode;
        this.bankName = "First National Bank";
    }

    public void displayAccountDetails(){
        System.out.println("*************************|  " + bankName+ "  |************************" +
                            "\nAccount Holder: " + account_Holder +
                            "\nAccount Number: "+ accountNumber+
                            "\nAccount Type: "+ accountType +
                            "\nBalance: R"+ balance +
                           "\nBranch Code: "+ branchCode);
    }

    /**
     * Setter Method used to change the account number of an instances
     * @param newAccNum New Account Number
     */
    public void setAccountNumber(String newAccNum){
        this.accountNumber = newAccNum;
    }

    /**
     * Change Account Holder Name
     * @param account_Holder Naem of the new account holder
     */
    public void setAccount_Holder(String account_Holder) {
        this.account_Holder = account_Holder;
    }

    /**
     * Change the Bracnh Code
     * @param branchCode new branch code
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * Method to change the Account Type
     * @param accountType new account type
     */
    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Change the Current Bank Balance
     * @param balance new current bank balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
    Getter Methods
     */

    /**
     * Method to get the Account Number
     * @return the account number of the current instance
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Method to get the Name of the Account Holder
     * @return the name of the current account holder
     */
    public String getAccount_Holder() {
        return account_Holder;
    }

    /**
     * Method to get the Branch Code
     * @return the branch code of the bank
     */

    public String getBranchCode() {
        return branchCode;
    }


    /**
     * Method to get the account type
     * @return current account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Method to get the current balance
     * @return current bank balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Class Method to handle withdrawal
     * @param amount amount to be withdrawn from the current balance in your account
     */
    public void withdrawal (double amount)
    {
        this.balance-= amount;
    }

    /**
     * class method to handle the deposit functionality
     * @param amount amount that you deposit into your account
     */
    public void deposit(double amount){
        this.balance+= amount;
    }


    /**
     * A class method to assign initial balance based on account type
     *     * Loan = 25000
     *     * Savings = 0
     *     * Credit = 7500
     *     * Cheque = 0
     * @param accountType account type
     */
    public void initialBalance(BankAccountType accountType){
        switch (accountType){
            case Loan -> this.balance = 25000;
            case Cheque, Savings -> this.balance = 0;
            case Credit -> this.balance = 7500;
        }
    }


    /**
     * a method called transfer that will transfer an amount to a different bank account:
     * The method recieves bank account as a parameter and increase the balance of that target account
     * and amount to transfer
     * @param targetAccount account you transfer amount to .
     * @param amount amount that is being transfered to tragetAccount from the current account
     */
    public void transfer(Account targetAccount, double amount){

        this.withdrawal(amount);  // withdrawal on the current account
        targetAccount.deposit(amount); // deposit into a other account

    }

}
