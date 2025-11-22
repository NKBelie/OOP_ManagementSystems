package Belie27174.Q3;

public class PayrollRecord extends Salary {
    public PayrollRecord(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode, String managerName, String managerEmail, String phone,
                         String employeeName, int employeeId, String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction,
                         double basicSalary, double grossSalary, double netSalary) throws EmployeeDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary, grossSalary, netSalary);
    }

    public double calculateNetSalary() {
        double allowances = getHousingAllowance() + getTransportAllowance();
        double deductions = getTaxDeduction() + getLoanDeduction();
        return getBasicSalary() + allowances - deductions;

    }
}
