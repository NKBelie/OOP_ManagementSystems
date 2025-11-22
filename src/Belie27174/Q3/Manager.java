package Belie27174.Q3;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode, String managerName, String managerEmail, String phone) throws EmployeeDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
        this.managerName = managerName;
        if (managerEmail == null || managerEmail.trim().isEmpty()) {
            throw new EmployeeDataException("27174: Manager email cannot be empty");
        }
        if (!managerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new EmployeeDataException("27174: Valid manager email required");
        }
        this.managerEmail = managerEmail;
        if (phone == null || phone.trim().isEmpty()) {
            throw new EmployeeDataException("27174: Phone cannot be empty");
        }
        if (!phone.matches("\\d{10}")) {
            throw new EmployeeDataException("27174: Phone must be exactly 10 digits");
        }
        this.phone = phone;
    }

    // Public getters/setters
    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { this.managerName = managerName; }
    public String getManagerEmail() { return managerEmail; }
    public void setManagerEmail(String managerEmail) throws EmployeeDataException {
        if (managerEmail == null || managerEmail.trim().isEmpty()) {
            throw new EmployeeDataException("Manager email cannot be empty");
        }
        if (!managerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new EmployeeDataException("27174: Valid manager email required");
        }
        this.managerEmail = managerEmail;
    }
    public String getPhone() { return phone; }
    public void setPhone(String phone) throws EmployeeDataException {
        if (phone == null || phone.trim().isEmpty()) {
            throw new EmployeeDataException("27174: Phone cannot be empty");
        }
        if (!phone.matches("\\d{10}")) {
            throw new EmployeeDataException("27174: Phone must be exactly 10 digits");
        }
        this.phone = phone;
    }
}