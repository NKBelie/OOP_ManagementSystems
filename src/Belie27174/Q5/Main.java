package Belie27174.Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("------------------ Entity Details -----------------");
            System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
            System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

            Entity entity=new Entity(id,createdDate,updatedDate);

            System.out.println("----------------- Company Details -----------------");
            System.out.print("Company Name: "); String companyName = scanner.nextLine();
            System.out.print("Address: "); String address = scanner.nextLine();
            System.out.print("Phone Number (10 digits): "); String phoneNumber = scanner.nextLine();

            Company company=new Company(id,createdDate,updatedDate,companyName,address,phoneNumber);

            System.out.println("----------------- Branch Details ------------------");
            System.out.print("Branch Name: "); String branchName = scanner.nextLine();
            System.out.print("Location Code (>=3 chars): "); String locationCode = scanner.nextLine();

            Branch branch=new Branch(id,createdDate,updatedDate,companyName,address,phoneNumber,branchName,locationCode);

            System.out.println("------------------ Vehicle Details ------------------");
            System.out.print("Vehicle Type: "); String vehicleType = scanner.nextLine();
            System.out.print("Registration Number: "); String registrationNumber = scanner.nextLine();
            System.out.print("Daily Rate: "); double dailyRate = Double.parseDouble(scanner.nextLine());

            Vehicle vehicle=new Vehicle(id,createdDate,updatedDate,companyName,address,phoneNumber,branchName,locationCode,vehicleType,registrationNumber,
                    dailyRate);

            System.out.println("------------------ Customer Details -------------------");
            System.out.print("Customer Name: "); String customerName = scanner.nextLine();
            System.out.print("License Number: "); String licenseNumber = scanner.nextLine();
            System.out.print("Contact Number: "); String contactNumber = scanner.nextLine();

            Customer customer=new Customer(id,createdDate,updatedDate,companyName,address,phoneNumber,branchName,locationCode,vehicleType,registrationNumber,
                    dailyRate,customerName,licenseNumber,contactNumber);

            System.out.println("---------------- Rental Details -------------------");
            System.out.print("Rental Date (YYYY-MM-DD): "); String rentalDate = scanner.nextLine();
            System.out.print("Return Date (YYYY-MM-DD): "); String returnDate = scanner.nextLine();
            System.out.print("Rental Days: "); int rentalDays = Integer.parseInt(scanner.nextLine());

            Rental rental=new Rental(id,createdDate,updatedDate,companyName,address,phoneNumber,branchName,locationCode,vehicleType,registrationNumber,
                    dailyRate,customerName,licenseNumber,contactNumber,rentalDate,returnDate,rentalDays);

            System.out.println("---------------- Charge Details -----------------");
            System.out.print("Rental Charge: "); double rentalCharge = Double.parseDouble(scanner.nextLine());
            System.out.print("Penalty Charge: "); double penaltyCharge = Double.parseDouble(scanner.nextLine());

            Charge charge=new Charge(id,createdDate,updatedDate,companyName,address,phoneNumber,branchName,locationCode,vehicleType,registrationNumber,
                    dailyRate,customerName,licenseNumber,contactNumber,rentalDate,returnDate,rentalDays,rentalCharge,penaltyCharge);

            System.out.println("------------------ Payment Details ---------------");
            System.out.print("Payment Mode: "); String paymentMode = scanner.nextLine();
            System.out.print("Transaction ID: "); String transactionId = scanner.nextLine();

            Payment payment=new Payment(id,createdDate,updatedDate,companyName,address,phoneNumber,branchName,locationCode,vehicleType,registrationNumber,
                    dailyRate,customerName,licenseNumber,contactNumber,rentalDate,returnDate,rentalDays,rentalCharge,penaltyCharge,
                    paymentMode,transactionId);

            System.out.println("----------------- Invoice Details ------------------");
            System.out.print("Total Charge (initial): "); double totalCharge = Double.parseDouble(scanner.nextLine());

            Invoice invoice=new Invoice(id,createdDate,updatedDate,companyName,address,phoneNumber,branchName,locationCode,vehicleType,registrationNumber,
                    dailyRate,customerName,licenseNumber,contactNumber,rentalDate,returnDate,rentalDays,rentalCharge,penaltyCharge,
                    paymentMode,transactionId,totalCharge);

            // Create instance
            RentalRecord record = new RentalRecord(id, createdDate, updatedDate, companyName, address, phoneNumber,
                    branchName, locationCode,
                    vehicleType, registrationNumber, dailyRate,
                    customerName, licenseNumber, contactNumber,
                    rentalDate, returnDate, rentalDays,
                    rentalCharge, penaltyCharge,
                    paymentMode, transactionId,
                    totalCharge);

            // Display all details
            System.out.println("============= Vehicle Rental System Details ==============");
            System.out.println("27174: ID: " + record.getId());
            System.out.println("27174: Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
            System.out.println("27174: Company: " + record.getCompanyName() + ", " + record.getAddress() + ", Phone: " + record.getPhoneNumber());
            System.out.println("27174: Branch: " + record.getBranchName() + ", Location Code: " + record.getLocationCode());
            System.out.println("27174: Vehicle: Type: " + record.getVehicleType() + ", Reg: " + record.getRegistrationNumber() + ", Daily Rate: $" + record.getDailyRate());
            System.out.println("27174: Customer: " + record.getCustomerName() + ", License: " + record.getLicenseNumber() + ", Contact: " + record.getContactNumber());
            System.out.println("27174: Rental: Date: " + record.getRentalDate() + ", Return: " + record.getReturnDate() + ", Days: " + record.getRentalDays());
            System.out.println("27174: Charges: Rental: $" + record.getRentalCharge() + ", Penalty: $" + record.getPenaltyCharge());
            System.out.println("27174: Payment: Mode: " + record.getPaymentMode() + ", Transaction ID: " + record.getTransactionId());
            System.out.println("27174: Initial Total Charge: $" + record.getTotalCharge());

            // Compute and display final total charge
            double finalTotalCharge = record.calculateTotalCharge();
            System.out.println("Calculated Total Charge: $" + finalTotalCharge);

        } catch (VehicleDataException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Input Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
