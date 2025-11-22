package Belie27174.Q6;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);
        this.customerName = customerName;
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new BankDataException("27174: Valid email format required");
        }
        this.email = email;
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new BankDataException("27174: Valid phone number required (10 digits)");
        }
        this.phoneNumber = phoneNumber;
    }

    // Public getters/setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getEmail() { return email; }
    public void setEmail(String email) throws BankDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new BankDataException("27174: Valid email format required");
        }
        this.email = email;
    }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws BankDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new BankDataException("27174: Valid phone number required (10 digits)");
        }
        this.phoneNumber = phoneNumber;
    }
}
