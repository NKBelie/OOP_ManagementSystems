package Belie27174.Q3;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                    String departmentName, String departmentCode, String managerName, String managerEmail, String phone,
                    String employeeName, int employeeId, String designation, String contactNumber) throws EmployeeDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone);
        this.employeeName = employeeName;
        if (employeeId <= 0) {
            throw new EmployeeDataException("27174: Employee ID must be greater than 0");
        }
        this.employeeId = employeeId;
        this.designation = designation;
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new EmployeeDataException("27174: Contact must be exactly 10 digits");
        }
        this.contactNumber = contactNumber;
    }

    // Public getters/setters
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) throws EmployeeDataException {
        if (employeeId <= 0) throw new EmployeeDataException("27174: Employee ID must be greater to 0");
        this.employeeId = employeeId;
    }
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws EmployeeDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new EmployeeDataException("27174: Contact must be exactly 10 digits");
        }
        this.contactNumber = contactNumber;
    }
}
