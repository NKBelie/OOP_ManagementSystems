package Belie27174.Q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        if (balance < 0) {
            throw new BankDataException("27174: Balance must be greater or equal to 0");
        }
        this.balance = balance;
    }

    // Public getters/setters
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) throws BankDataException {
        if (balance < 0) throw new BankDataException("27174: Balance must be greater or equal 0");
        this.balance = balance;
    }
}
