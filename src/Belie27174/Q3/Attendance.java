package Belie27174.Q3;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode, String managerName, String managerEmail, String phone,
                      String employeeName, int employeeId, String designation, String contactNumber,
                      int totalDays, int presentDays, int leaveDays) throws EmployeeDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber);
        if (totalDays < 0) {
            throw new EmployeeDataException("27174 : Total days must be greater or equal to 0");
        }
        this.totalDays = totalDays;
        if (presentDays < 0) {
            throw new EmployeeDataException("27174 :Present days must be greater or equal to 0");
        }
        if (leaveDays < 0) {
            throw new EmployeeDataException("27174 :Leave days must be greater or equal to 0");
        }
        if (presentDays > totalDays) {
            throw new EmployeeDataException("27174 :Present days must less or equal to total days");
        }
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }

    // Public getters/setters
    public int getTotalDays() { return totalDays; }
    public void setTotalDays(int totalDays) throws EmployeeDataException {
        if (totalDays < 0) throw new EmployeeDataException("27174 :Total days must be greater or equal to 0");
        this.totalDays = totalDays;
    }
    public int getPresentDays() { return presentDays; }
    public void setPresentDays(int presentDays) throws EmployeeDataException {
        if (presentDays < 0) throw new EmployeeDataException("27174 :Present days must be greater or equal to 0");
        if (presentDays > getTotalDays()) throw new EmployeeDataException("27174 :Present days must be less or equal to total days");
        this.presentDays = presentDays;
    }
    public int getLeaveDays() { return leaveDays; }
    public void setLeaveDays(int leaveDays) throws EmployeeDataException {
        if (leaveDays < 0) throw new EmployeeDataException("27174 :Leave days must be greater or equal to 0");
        this.leaveDays = leaveDays;
    }
}
