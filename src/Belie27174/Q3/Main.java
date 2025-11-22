package Belie27174.Q3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("---------------- Entity Details ---------------");
            System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
            System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

            System.out.println("----------------- Company Details -----------------");
            System.out.print("Company Name: "); String companyName = scanner.nextLine();
            System.out.print("Address: "); String address = scanner.nextLine();
            System.out.print("Phone Number (10 digits): "); String phoneNumber = scanner.nextLine();
            System.out.print("Email: "); String email = scanner.nextLine();

            System.out.println("----------------- Department Details --------------------");
            System.out.print("Department Name: "); String departmentName = scanner.nextLine();
            System.out.print("Department Code (>=3 alphanumeric): "); String departmentCode = scanner.nextLine();

            System.out.println("----------------- Manager Details -----------------");
            System.out.print("Manager Name: "); String managerName = scanner.nextLine();
            System.out.print("Manager Email: "); String managerEmail = scanner.nextLine();
            System.out.print("Phone: "); String phone = scanner.nextLine();

            System.out.println("------------------- Employee Details ----------------");
            System.out.print("Employee Name: "); String employeeName = scanner.nextLine();
            System.out.print("Employee ID: "); int employeeId = Integer.parseInt(scanner.nextLine());
            System.out.print("Designation: "); String designation = scanner.nextLine();
            System.out.print("Contact Number (10 digits): "); String contactNumber = scanner.nextLine();

            System.out.println("-------------------- Attendance Details ---------------");
            System.out.print("Total Days: "); int totalDays = Integer.parseInt(scanner.nextLine());
            System.out.print("Present Days: "); int presentDays = Integer.parseInt(scanner.nextLine());
            System.out.print("Leave Days: "); int leaveDays = Integer.parseInt(scanner.nextLine());

            System.out.println("------------------- Allowance Details -------------------");
            System.out.print("Housing Allowance: "); double housingAllowance = Double.parseDouble(scanner.nextLine());
            System.out.print("Transport Allowance: "); double transportAllowance = Double.parseDouble(scanner.nextLine());

            System.out.println("----------------- Deduction Details -----------------");
            System.out.print("Tax Deduction: "); double taxDeduction = Double.parseDouble(scanner.nextLine());
            System.out.print("Loan Deduction: "); double loanDeduction = Double.parseDouble(scanner.nextLine());

            System.out.println("-------------------- Salary Details ---------------------");
            System.out.print("Basic Salary: "); double basicSalary = Double.parseDouble(scanner.nextLine());
            System.out.print("Gross Salary: "); double grossSalary = Double.parseDouble(scanner.nextLine());
            System.out.print("Net Salary (initial): "); double netSalary = Double.parseDouble(scanner.nextLine());

            // Create instance
            PayrollRecord record = new PayrollRecord(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                    departmentName, departmentCode, managerName, managerEmail, phone,
                    employeeName, employeeId, designation, contactNumber,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance,
                    taxDeduction, loanDeduction,
                    basicSalary, grossSalary, netSalary);

            // Display all details (now resolvable since hierarchy is complete)
            System.out.println("========== Employee Payroll System Details ===========");
            System.out.println("27174: ID: " + record.getId());
            System.out.println("27174: Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
            System.out.println("27174: Company: " + record.getCompanyName() + ", " + record.getAddress() + ", " + record.getPhoneNumber() + ", " + record.getEmail());
            System.out.println("27174: Department: " + record.getDepartmentName() + " (" + record.getDepartmentCode() + ")");
            System.out.println("27174: Manager: " + record.getManagerName() + ", Email: " + record.getManagerEmail() + ", Phone: " + record.getPhone());
            System.out.println("27174: Employee: " + record.getEmployeeName() + ", ID: " + record.getEmployeeId() + ", Designation: " + record.getDesignation() + ", Contact: " + record.getContactNumber());
            System.out.println("27174: Attendance: Total: " + record.getTotalDays() + ", Present: " + record.getPresentDays() + ", Leave: " + record.getLeaveDays());
            System.out.println("27174: Allowances: Housing: $" + record.getHousingAllowance() + ", Transport: $" + record.getTransportAllowance());
            System.out.println("27174: Deductions: Tax: $" + record.getTaxDeduction() + ", Loan: $" + record.getLoanDeduction());
            System.out.println("27174: Salary: Basic: $" + record.getBasicSalary() + ", Gross: $" + record.getGrossSalary() + ", Initial Net: $" + record.getNetSalary());

            // Compute and display final net salary
            double finalNetSalary = record.calculateNetSalary();
            System.out.println("27174: Computed Net Salary: $" + finalNetSalary);

        } catch (EmployeeDataException e) {
            System.out.println("27174: Validation Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("27174: Input Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}