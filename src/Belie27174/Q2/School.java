package Belie27174.Q2;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email) throws SchoolDataException {
        super(id, createdDate, updatedDate);
        this.schoolName = schoolName;
        this.address = address;
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new SchoolDataException("27174 : Phone must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new SchoolDataException("27174 : Valid email format required");
        }
        this.email = email;
    }

    // Getters and Setters
    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws SchoolDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new SchoolDataException("27174 : Phone must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() { return email; }
    public void setEmail(String email) throws SchoolDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new SchoolDataException("27174 : Valid email format required");
        }
        this.email = email;
    }
}
