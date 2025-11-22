package Belie27174.Q3;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode, String managerName, String managerEmail, String phone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance,
                     double taxDeduction, double loanDeduction) throws EmployeeDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance);
        if (taxDeduction < 0) {
            throw new EmployeeDataException("27174 :Tax deduction must be greater or equal to 0");
        }
        this.taxDeduction = taxDeduction;
        if (loanDeduction < 0) {
            throw new EmployeeDataException("27174 :Loan deduction must be greater or equal to 0");
        }
        this.loanDeduction = loanDeduction;
    }

    // Getters and Setters
    public double getTaxDeduction() { return taxDeduction; }
    public void setTaxDeduction(double taxDeduction) throws EmployeeDataException {
        if (taxDeduction < 0) throw new EmployeeDataException("27174 :Tax deduction must be greater or equal to 0");
        this.taxDeduction = taxDeduction;
    }
    public double getLoanDeduction() { return loanDeduction; }
    public void setLoanDeduction(double loanDeduction) throws EmployeeDataException {
        if (loanDeduction < 0) throw new EmployeeDataException("27174 :Loan deduction must be greater or equal to 0");
        this.loanDeduction = loanDeduction;
    }
}
