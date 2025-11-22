package Belie27174.Q6;

public class Deposit extends Transaction {
    private double depositAmount;
    private String depositDate;

    public Deposit(int id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount);
        if (depositAmount <= 0) {
            throw new BankDataException("27174: Deposit amount must be greater than 0");
        }
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
    }

    // Public getters/setters
    public double getDepositAmount() { return depositAmount; }
    public void setDepositAmount(double depositAmount) throws BankDataException {
        if (depositAmount <= 0) throw new BankDataException("27174: Deposit amount must be greater than0");
        this.depositAmount = depositAmount;
    }
    public String getDepositDate() { return depositDate; }
    public void setDepositDate(String depositDate) { this.depositDate = depositDate; }
}
