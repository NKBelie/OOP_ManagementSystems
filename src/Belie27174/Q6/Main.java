package Belie27174.Q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("------------------ Entity Details -----------------");
            System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
            System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

            System.out.println("------------------- Bank Details ------------------");
            System.out.print("Bank Name: "); String bankName = scanner.nextLine();
            System.out.print("Branch Code (>=3 chars): "); String branchCode = scanner.nextLine();
            System.out.print("Address: "); String address = scanner.nextLine();

            System.out.println("--------------- Account Details -----------------");
            System.out.print("Account Number: "); String accountNumber = scanner.nextLine();
            System.out.print("Account Type: "); String accountType = scanner.nextLine();
            System.out.print("Balance: "); double balance = Double.parseDouble(scanner.nextLine());

            System.out.println("----------------- Customer Details -----------------");
            System.out.print("Customer Name: "); String customerName = scanner.nextLine();
            System.out.print("Email: "); String email = scanner.nextLine();
            System.out.print("Phone Number (10 digits): "); String phoneNumber = scanner.nextLine();

            System.out.println("----------------- Transaction Details -------------------");
            System.out.print("Transaction ID: "); String transactionId = scanner.nextLine();
            System.out.print("Transaction Type: "); String transactionType = scanner.nextLine();
            System.out.print("Amount: "); double amount = Double.parseDouble(scanner.nextLine());

            System.out.println("------------------ Deposit Details ------------------");
            System.out.print("Deposit Amount: "); double depositAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Deposit Date (YYYY-MM-DD): "); String depositDate = scanner.nextLine();

            System.out.println("---------------- Withdrawal Details ----------------------");
            System.out.print("Withdrawal Amount: "); double withdrawalAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Withdrawal Date (YYYY-MM-DD): "); String withdrawalDate = scanner.nextLine();

            System.out.println("------------------ Loan Details -------------------");
            System.out.print("Loan Amount: "); double loanAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Interest Rate: "); double interestRate = Double.parseDouble(scanner.nextLine());
            System.out.print("Duration: "); int duration = Integer.parseInt(scanner.nextLine());

            System.out.println("------------------- Payment Details --------------------");
            System.out.print("Payment Amount: "); double paymentAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Payment Date (YYYY-MM-DD): "); String paymentDate = scanner.nextLine();

            // Create instance
            AccountRecord record = new AccountRecord(id, createdDate, updatedDate, bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    customerName, email, phoneNumber,
                    transactionId, transactionType, amount,
                    depositAmount, depositDate,
                    withdrawalAmount, withdrawalDate,
                    loanAmount, interestRate, duration,
                    paymentAmount, paymentDate);

            // Display all details
            System.out.println("=============== Banking System Details ================");
            System.out.println("27174: ID: " + record.getId());
            System.out.println("27174: Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
            System.out.println("27174: Bank: " + record.getBankName() + ", Branch Code: " + record.getBranchCode() + ", Address: " + record.getAddress());
            System.out.println("27174: Account: Number: " + record.getAccountNumber() + ", Type: " + record.getAccountType() + ", Balance: $" + record.getBalance());
            System.out.println("27174: Customer: " + record.getCustomerName() + ", Email: " + record.getEmail() + ", Phone: " + record.getPhoneNumber());
            System.out.println("27174: Transaction: ID: " + record.getTransactionId() + ", Type: " + record.getTransactionType() + ", Amount: $" + record.getAmount());
            System.out.println("27174: Deposit: Amount: $" + record.getDepositAmount() + ", Date: " + record.getDepositDate());
            System.out.println("27174: Withdrawal: Amount: $" + record.getWithdrawalAmount() + ", Date: " + record.getWithdrawalDate());
            System.out.println("27174: Loan: Amount: $" + record.getLoanAmount() + ", Interest Rate: " + record.getInterestRate() + "%, Duration: " + record.getDuration() + " years");
            System.out.println("27174: Payment: Amount: $" + record.getPaymentAmount() + ", Date: " + record.getPaymentDate());

            // Compute and display final interest
            double interest = record.calculateInterest();
            System.out.println("27174: Calculated Interest: $" + interest);

        } catch (BankDataException e) {
            System.out.println("27174: Validation Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("27174: Input Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
