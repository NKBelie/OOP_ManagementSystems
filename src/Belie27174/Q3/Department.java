package Belie27174.Q3;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws EmployeeDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        this.departmentName = departmentName;
        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("^[A-Za-z0-9]+$")) {
            throw new EmployeeDataException("27174: Department code must be alphanumeric and greater or equal to 3 chars");
        }
        this.departmentCode = departmentCode;
    }

    // Public getters/setters
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) throws EmployeeDataException {
        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("^[A-Za-z0-9]+$")) {
            throw new EmployeeDataException("27174:Department code must be alphanumeric and greater or equal to 3 chars");
        }
        this.departmentCode = departmentCode;
    }
}
