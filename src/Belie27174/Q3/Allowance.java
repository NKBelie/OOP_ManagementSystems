package Belie27174.Q3;

public class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;

    public Allowance(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode, String managerName, String managerEmail, String phone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance) throws EmployeeDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays);
        if (housingAllowance < 0) {
            throw new EmployeeDataException("27174 : Housing allowance must be greater or equal to 0");
        }
        this.housingAllowance = housingAllowance;
        if (transportAllowance < 0) {
            throw new EmployeeDataException("27174 : Transport allowance must be greater or equal to 0");
        }
        this.transportAllowance = transportAllowance;
    }

    // Getters and Setters
    public double getHousingAllowance() { return housingAllowance; }
    public void setHousingAllowance(double housingAllowance) throws EmployeeDataException {
        if (housingAllowance < 0) throw new EmployeeDataException("27174 : Housing allowance must be greater or equal to 0");
        this.housingAllowance = housingAllowance;
    }
    public double getTransportAllowance() { return transportAllowance; }
    public void setTransportAllowance(double transportAllowance) throws EmployeeDataException {
        if (transportAllowance < 0) throw new EmployeeDataException("27174 : Transport allowance must be greater or equal to 0");
        this.transportAllowance = transportAllowance;
    }
}
