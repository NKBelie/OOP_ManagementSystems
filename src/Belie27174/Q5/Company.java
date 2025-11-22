package Belie27174.Q5;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber) throws VehicleDataException {
        super(id, createdDate, updatedDate);
        this.companyName = companyName;
        this.address = address;
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new VehicleDataException("27174: Phone must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    // Public getters/setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws VehicleDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new VehicleDataException("27174: Phone must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}
