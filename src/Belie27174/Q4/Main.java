package Belie27174.Q4;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("----------------- Entity Details ---------------");
            System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
            System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

            Entity entity=new Entity(id,createdDate,updatedDate);

            System.out.println("------------------ Hotel Details -----------------");
            System.out.print("Hotel Name: "); String hotelName = scanner.nextLine();
            System.out.print("Address: "); String address = scanner.nextLine();
            System.out.print("Phone Number (10 digits): "); String phoneNumber = scanner.nextLine();
            System.out.print("Email: "); String email = scanner.nextLine();

            Hotel hotel=new Hotel(id,createdDate,updatedDate,hotelName,address,phoneNumber,email);

            System.out.println("--------------------- Room Details ------------------");
            System.out.print("Room Number: "); String roomNumber = scanner.nextLine();
            System.out.print("Room Type: "); String roomType = scanner.nextLine();
            System.out.print("Price Per Night: "); double pricePerNight = Double.parseDouble(scanner.nextLine());

            Room room=new Room(id,createdDate,updatedDate,hotelName,address,phoneNumber,email,roomNumber,roomType,pricePerNight);

            System.out.println("-------------------- Customer Details ----------------------");
            System.out.print("Customer Name: "); String customerName = scanner.nextLine();
            System.out.print("Customer Email: "); String customerEmail = scanner.nextLine();
            System.out.print("Contact Number (10 digits): "); String contactNumber = scanner.nextLine();

            Customer customer=new Customer(id,createdDate,updatedDate,hotelName,address,phoneNumber,email,roomNumber,roomType,pricePerNight,
                    customerName,customerEmail,contactNumber);

            System.out.println("------------------- Booking Details ---------------------");
            System.out.print("Booking Date (YYYY-MM-DD): "); String bookingDate = scanner.nextLine();
            System.out.print("Check In Date (YYYY-MM-DD): "); String checkInDate = scanner.nextLine();
            System.out.print("Check Out Date (YYYY-MM-DD): "); String checkOutDate = scanner.nextLine();

            Booking booking=new Booking(id,createdDate,updatedDate,hotelName,address,phoneNumber,email,roomNumber,roomType,pricePerNight,
                    customerName,customerEmail,contactNumber,bookingDate,checkInDate,checkOutDate);

            System.out.println("------------------ Service Details ----------------------");
            System.out.print("Service Name: "); String serviceName = scanner.nextLine();
            System.out.print("Service Cost: "); double serviceCost = Double.parseDouble(scanner.nextLine());

            Service service=new Service(id,createdDate,updatedDate,hotelName,address,phoneNumber,email,roomNumber,roomType,pricePerNight,
                    customerName,customerEmail,contactNumber,bookingDate,checkInDate,checkOutDate,serviceName,serviceCost);

            System.out.println("-------------------- Payment Details ------------------");
            System.out.print("Payment Method: "); String paymentMethod = scanner.nextLine();
            System.out.print("Payment Date (YYYY-MM-DD): "); String paymentDate = scanner.nextLine();

            Payment payment=new Payment(id,createdDate,updatedDate,hotelName,address,phoneNumber,email,roomNumber,roomType,pricePerNight,
                    customerName,customerEmail,contactNumber,bookingDate,checkInDate,checkOutDate,serviceName,serviceCost,paymentMethod,
                    paymentDate);

            System.out.println("--------------------- Bill Details -------------------");
            System.out.print("Room Charge: "); double roomCharge = Double.parseDouble(scanner.nextLine());
            System.out.print("Service Charge: "); double serviceCharge = Double.parseDouble(scanner.nextLine());
            System.out.print("Total Bill (initial): "); double totalBill = Double.parseDouble(scanner.nextLine());

            Bill bill=new Bill(id,createdDate,updatedDate,hotelName,address,phoneNumber,email,roomNumber,roomType,pricePerNight,
                    customerName,customerEmail,contactNumber,bookingDate,checkInDate,checkOutDate,serviceName,serviceCost,paymentMethod,
                    paymentDate,roomCharge,serviceCharge,totalBill);

            System.out.println("-------------------- Feedback Details ------------------------");
            System.out.print("Rating (1-5): "); int rating = Integer.parseInt(scanner.nextLine());
            System.out.print("Comments: "); String comments = scanner.nextLine();

            Feedback feedback=new Feedback(id,createdDate,updatedDate,hotelName,address,phoneNumber,email,roomNumber,roomType,pricePerNight,
                    customerName,customerEmail,contactNumber,bookingDate,checkInDate,checkOutDate,serviceName,serviceCost,paymentMethod,
                    paymentDate,roomCharge,serviceCharge,totalBill,rating,comments);

            // Create instance
            ReservationRecord record = new ReservationRecord(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, contactNumber,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate,
                    roomCharge, serviceCharge, totalBill,
                    rating, comments);

            // Display all details
            System.out.println("================ Hotel Reservation System Details ==============");
            System.out.println("27174: ID: " + record.getId());
            System.out.println("27174: Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
            System.out.println("27174: Hotel: " + record.getHotelName() + ", " + record.getAddress() + ", Phone: " + record.getPhoneNumber() + ", Email: " + record.getEmail());
            System.out.println("27174: Room: Number: " + record.getRoomNumber() + ", Type: " + record.getRoomType() + ", Price/Night: $" + record.getPricePerNight());
            System.out.println("27174: Customer: " + record.getCustomerName() + ", Email: " + record.getCustomerEmail() + ", Contact: " + record.getContactNumber());
            System.out.println("27174: Booking: Date: " + record.getBookingDate() + ", CheckIn: " + record.getCheckInDate() + ", CheckOut: " + record.getCheckOutDate());
            System.out.println("27174: Service: " + record.getServiceName() + ", Cost: $" + record.getServiceCost());
            System.out.println("27174: Payment: Method: " + record.getPaymentMethod() + ", Date: " + record.getPaymentDate());
            System.out.println("27174: Bill: Room Charge: $" + record.getRoomCharge() + ", Service Charge: $" + record.getServiceCharge() + ", Initial Total: $" + record.getTotalBill());
            System.out.println("27174: Feedback: Rating: " + record.getRating() + ", Comments: " + record.getComments());

            // Compute and display final bill
            double finalBill = record.generateBill();
            System.out.println("27174: Generated Bill: $" + finalBill);

        } catch (HotelDataException e) {
            System.out.println("27174: Validation Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("27174: Input Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
