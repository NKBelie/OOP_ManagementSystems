package Belie27174.Q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("------------------- Entity Details -----------------");
            System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
            System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

            Entity entity=new Entity(id,createdDate,updatedDate);

            System.out.println("----------------- Agency Details ------------------");
            System.out.print("Agency Name: "); String agencyName = scanner.nextLine();
            System.out.print("Location: "); String location = scanner.nextLine();
            System.out.print("Phone Number (10 digits): "); String phoneNumber = scanner.nextLine();

            Agency agency=new Agency(id,createdDate,updatedDate,agencyName,location,phoneNumber);

            System.out.println("---------------- Agent Details ------------------");
            System.out.print("Agent Name: "); String agentName = scanner.nextLine();
            System.out.print("Email: "); String email = scanner.nextLine();
            System.out.print("License Number: "); String licenseNumber = scanner.nextLine();

            Agent agent=new Agent(id,createdDate,updatedDate,agencyName,location,phoneNumber,agentName,email,licenseNumber);

            System.out.println("---------------- Property Details --------------");
            System.out.print("Property Code: "); String propertyCode = scanner.nextLine();
            System.out.print("Property Type: "); String propertyType = scanner.nextLine();
            System.out.print("Price: "); double price = Double.parseDouble(scanner.nextLine());

            Property property=new Property(id,createdDate,updatedDate,agencyName,location,phoneNumber,agentName,email,licenseNumber,propertyCode,
                    propertyType,price);

            System.out.println("----------------- Seller Details -------------------");
            System.out.print("Seller Name: "); String sellerName = scanner.nextLine();
            System.out.print("Contact Number: "); String contactNumber = scanner.nextLine();

            Seller seller=new Seller(id,createdDate,updatedDate,agencyName,location,phoneNumber,agentName,email,licenseNumber,propertyCode,
                    propertyType,price,sellerName,contactNumber);

            System.out.println("----------------- Buyer Details --------------------");
            System.out.print("Buyer Name: "); String buyerName = scanner.nextLine();
            System.out.print("Buyer Email: "); String buyerEmail = scanner.nextLine();

            Buyer buyer=new Buyer(id,createdDate,updatedDate,agencyName,location,phoneNumber,agentName,email,licenseNumber,propertyCode,
                    propertyType,price,sellerName,contactNumber,buyerName,buyerEmail);

            System.out.println("------------------ Agreement Details ------------------");
            System.out.print("Agreement Date (YYYY-MM-DD): "); String agreementDate = scanner.nextLine();
            System.out.print("Terms: "); String terms = scanner.nextLine();

            Agreement agreement=new Agreement(id,createdDate,updatedDate,agencyName,location,phoneNumber,agentName,email,licenseNumber,propertyCode,
                    propertyType,price,sellerName,contactNumber,buyerName,buyerEmail,agreementDate,terms);

            System.out.println("------------------ Payment Details -------------------");
            System.out.print("Payment Amount: "); double paymentAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Payment Date (YYYY-MM-DD): "); String paymentDate = scanner.nextLine();

            Payment payment=new Payment(id,createdDate,updatedDate,agencyName,location,phoneNumber,agentName,email,licenseNumber,propertyCode,
                    propertyType,price,sellerName,contactNumber,buyerName,buyerEmail,agreementDate,terms,paymentAmount,paymentDate);

            System.out.println("----------------- Commission Details -------------------");
            System.out.print("Commission Rate: "); double commissionRate = Double.parseDouble(scanner.nextLine());
            System.out.print("Commission Amount (initial): "); double commissionAmount = Double.parseDouble(scanner.nextLine());

            Commission commission=new Commission(id,createdDate,updatedDate,agencyName,location,phoneNumber,agentName,email,licenseNumber,propertyCode,
                    propertyType,price,sellerName,contactNumber,buyerName,buyerEmail,agreementDate,terms,paymentAmount,paymentDate,commissionRate,
                    commissionAmount);

            // Create instance
            RealEstateRecord record = new RealEstateRecord(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                    agentName, email, licenseNumber,
                    propertyCode, propertyType, price,
                    sellerName, contactNumber,
                    buyerName, buyerEmail,
                    agreementDate, terms,
                    paymentAmount, paymentDate,
                    commissionRate, commissionAmount);

            // Display all details
            System.out.println("============ Real Estate Management System Details ===========");
            System.out.println("27174: ID: " + record.getId());
            System.out.println("27174: Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
            System.out.println("27174: Agency: " + record.getAgencyName() + ", Location: " + record.getLocation() + ", Phone: " + record.getPhoneNumber());
            System.out.println("27174: Agent: " + record.getAgentName() + ", Email: " + record.getEmail() + ", License: " + record.getLicenseNumber());
            System.out.println("27174: Property: Code: " + record.getPropertyCode() + ", Type: " + record.getPropertyType() + ", Price: $" + record.getPrice());
            System.out.println("27174: Seller: " + record.getSellerName() + ", Contact: " + record.getContactNumber());
            System.out.println("27174: Buyer: " + record.getBuyerName() + ", Email: " + record.getBuyerEmail());
            System.out.println("27174: Agreement: Date: " + record.getAgreementDate() + ", Terms: " + record.getTerms());
            System.out.println("27174: Payment: Amount: $" + record.getPaymentAmount() + ", Date: " + record.getPaymentDate());
            System.out.println("27174: Commission: Rate: " + record.getCommissionRate() + "%, Initial Amount: $" + record.getCommissionAmount());

            // Compute and display final commission
            double commissionF = record.calculateCommission();
            System.out.println("27174: Calculated Commission: $" + commissionF);

        } catch (RealEstateDataException e) {
            System.out.println("27174: Validation Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("27174: Input Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
