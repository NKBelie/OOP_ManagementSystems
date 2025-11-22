package Belie27174.Q2;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        this.departmentName = departmentName;
        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("^[A-Za-z0-9]+$")) {
            throw new SchoolDataException("27174 : Department code must be alphanumeric and >= 3 chars");
        }
        this.departmentCode = departmentCode;
    }

    // Getters and Setters
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) throws SchoolDataException {
        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("^[A-Za-z0-9]+$")) {
            throw new SchoolDataException("27174 : Department code must be alphanumeric and >= 3 chars");
        }
        this.departmentCode = departmentCode;
    }
}
