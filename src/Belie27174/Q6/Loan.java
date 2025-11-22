package Belie27174.Q6;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration;

    public Loan(int id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, int duration) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate);
        if (loanAmount <= 0) {
            throw new BankDataException("27174: Loan amount must be greater than 0");
        }
        this.loanAmount = loanAmount;
        if (interestRate <= 0) {
            throw new BankDataException("27174: Interest rate must be greater than 0");
        }
        this.interestRate = interestRate;
        if (duration <= 0) {
            throw new BankDataException("27174: Duration must be greater than 0");
        }
        this.duration = duration;
    }

    // Public getters/setters
    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) throws BankDataException {
        if (loanAmount <= 0) throw new BankDataException("27174: Loan amount must be greater than 0");
        this.loanAmount = loanAmount;
    }
    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) throws BankDataException {
        if (interestRate <= 0) throw new BankDataException("27174: Interest rate must be greater than 0");
        this.interestRate = interestRate;
    }
    public int getDuration() { return duration; }
    public void setDuration(int duration) throws BankDataException {
        if (duration <= 0) throw new BankDataException("27174: Duration must be greater than 0");
        this.duration = duration;
    }
}
