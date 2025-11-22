package Belie27174.Q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, String createdDate, String updatedDate, String bankName, String branchCode, String address) throws BankDataException {
        super(id, createdDate, updatedDate);
        this.bankName = bankName;
        if (branchCode == null || branchCode.length() < 3) {
            throw new BankDataException("27174: Branch code must be greater or equal 3 chars");
        }
        this.branchCode = branchCode;
        this.address = address;
    }

    // Public getters/setters
    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }
    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) throws BankDataException {
        if (branchCode == null || branchCode.length() < 3) {
            throw new BankDataException("27174: Branch code must be greater or equal to 3 chars");
        }
        this.branchCode = branchCode;
    }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
