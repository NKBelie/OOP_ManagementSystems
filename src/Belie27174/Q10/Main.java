package Belie27174.Q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("-------------------- Entity Details -------------------");
            System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
            System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

            System.out.println("------------------- Store Details -----------------");
            System.out.print("Store Name: "); String storeName = scanner.nextLine();
            System.out.print("Address: "); String address = scanner.nextLine();
            System.out.print("Email: "); String email = scanner.nextLine();

            System.out.println("------------------- Category Details -----------------");
            System.out.print("Category Name: "); String categoryName = scanner.nextLine();
            System.out.print("Category Code (>=3 chars): "); String categoryCode = scanner.nextLine();

            System.out.println("------------------- Product Details ------------------");
            System.out.print("Product Name: "); String productName = scanner.nextLine();
            System.out.print("Product Code: "); String productCode = scanner.nextLine();
            System.out.print("Price: "); double price = Double.parseDouble(scanner.nextLine());

            System.out.println("-------------------- Customer Details -----------------");
            System.out.print("Customer Name: "); String customerName = scanner.nextLine();
            System.out.print("Contact Number: "); String contactNumber = scanner.nextLine();
            System.out.print("Customer Address: "); String customerAddress = scanner.nextLine();

            System.out.println("--------------------- Order Details ---------------------");
            System.out.print("Order Date (YYYY-MM-DD): "); String orderDate = scanner.nextLine();
            System.out.print("Order ID: "); String orderId = scanner.nextLine();

            System.out.println("---------------- Payment Details ------------------");
            System.out.print("Payment Method: "); String paymentMethod = scanner.nextLine();
            System.out.print("Payment Status: "); String paymentStatus = scanner.nextLine();

            System.out.println("--------------------- Shipping Details --------------------");
            System.out.print("Shipping Address: "); String shippingAddress = scanner.nextLine();
            System.out.print("Shipping Cost: "); double shippingCost = Double.parseDouble(scanner.nextLine());

            System.out.println("---------------- Invoice Details ----------------------");
            System.out.print("Total Amount (initial): "); double totalAmount = Double.parseDouble(scanner.nextLine());

            // Create instance
            OrderRecord record = new OrderRecord(id, createdDate, updatedDate, storeName, address, email,
                    categoryName, categoryCode,
                    productName, productCode, price,
                    customerName, contactNumber, customerAddress,
                    orderDate, orderId,
                    paymentMethod, paymentStatus,
                    shippingAddress, shippingCost,
                    totalAmount);

            // Display all details
            System.out.println("================== Online Shopping System Details ==================");
            System.out.println("27174 :ID: " + record.getId());
            System.out.println("27174 :Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
            System.out.println("27174 :Store: " + record.getStoreName() + ", Address: " + record.getAddress() + ", Email: " + record.getEmail());
            System.out.println("27174 :Category: " + record.getCategoryName() + ", Code: " + record.getCategoryCode());
            System.out.println("27174 :Product: " + record.getProductName() + ", Code: " + record.getProductCode() + ", Price: $" + record.getPrice());
            System.out.println("27174 :Customer: " + record.getCustomerName() + ", Contact: " + record.getContactNumber() + ", Address: " + record.getCustomerAddress());
            System.out.println("27174 :Order: Date: " + record.getOrderDate() + ", ID: " + record.getOrderId());
            System.out.println("27174 :Payment: Method: " + record.getPaymentMethod() + ", Status: " + record.getPaymentStatus());
            System.out.println("27174 :Shipping: Address: " + record.getShippingAddress() + ", Cost: $" + record.getShippingCost());
            System.out.println("27174 :Initial Total Amount: $" + record.getTotalAmount());

            // Compute and display final total amount
            double total = record.calculateTotalAmount();
            System.out.println("27174 :Calculated Total Amount: $" + total);

        } catch (ShoppingDataException e) {
            System.out.println("27174 :Validation Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("27174 :Input Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
