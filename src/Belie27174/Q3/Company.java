package Belie27174.Q3;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email) throws EmployeeDataException {
        super(id, createdDate, updatedDate);
        this.companyName = companyName;
        this.address = address;
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new EmployeeDataException("27174 :Phone must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new EmployeeDataException("27174 :Valid email format required");
        }
        this.email = email;
    }

    // Public getters/setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws EmployeeDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new EmployeeDataException("27174 :Phone must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() { return email; }
    public void setEmail(String email) throws EmployeeDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new EmployeeDataException("27174 :Valid email format required");
        }
        this.email = email;
    }
}
