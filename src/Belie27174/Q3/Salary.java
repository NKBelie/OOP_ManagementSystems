package Belie27174.Q3;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode, String managerName, String managerEmail, String phone,
                  String employeeName, int employeeId, String designation, String contactNumber,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction,
                  double basicSalary, double grossSalary, double netSalary) throws EmployeeDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        if (basicSalary <= 0) {
            throw new EmployeeDataException("27174: Basic salary must be greater than 0");
        }
        this.basicSalary = basicSalary;
        if (grossSalary <= 0) {
            throw new EmployeeDataException("27174: Gross salary must be greater than 0");
        }
        this.grossSalary = grossSalary;
        if (netSalary <= 0) {
            throw new EmployeeDataException("27174: Net salary must be greater than 0");
        }
        this.netSalary = netSalary;
    }

    // Getters and Setters
    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) throws EmployeeDataException {
        if (basicSalary <= 0) throw new EmployeeDataException("27174: Basic salary must be greater than 0");
        this.basicSalary = basicSalary;
    }
    public double getGrossSalary() { return grossSalary; }
    public void setGrossSalary(double grossSalary) throws EmployeeDataException {
        if (grossSalary <= 0) throw new EmployeeDataException("27174: Gross salary must be greater than 0");
        this.grossSalary = grossSalary;
    }
    public double getNetSalary() { return netSalary; }
    public void setNetSalary(double netSalary) throws EmployeeDataException {
        if (netSalary <= 0) throw new EmployeeDataException("27174: Net salary must be greater than 0");
        this.netSalary = netSalary;
    }
}
