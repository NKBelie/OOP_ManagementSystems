package Belie27174.Q9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--------------- Entity Details ------------------");
            System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
            System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

            Entity entity=new Entity(id,createdDate,updatedDate);

            System.out.println("----------------- Airline Details ---------------");
            System.out.print("Airline Name: "); String airlineName = scanner.nextLine();
            System.out.print("Address: "); String address = scanner.nextLine();
            System.out.print("Contact Email: "); String contactEmail = scanner.nextLine();

            Airline airline=new Airline(id,createdDate,updatedDate,airlineName,address,contactEmail);

            System.out.println("----------------- Flight Details ------------------");
            System.out.print("Flight Number: "); String flightNumber = scanner.nextLine();
            System.out.print("Destination: "); String destination = scanner.nextLine();
            System.out.print("Departure Time: "); String departureTime = scanner.nextLine();

            Flight flight=new Flight(id,createdDate,updatedDate,airlineName,address,contactEmail,flightNumber,destination,departureTime);

            System.out.println("--------------- Passenger Details ------------------");
            System.out.print("Passenger Name: "); String passengerName = scanner.nextLine();
            System.out.print("Passport Number: "); String passportNumber = scanner.nextLine();
            System.out.print("Nationality: "); String nationality = scanner.nextLine();

            Passenger passenger=new Passenger(id,createdDate,updatedDate,airlineName,address,contactEmail,flightNumber,destination,departureTime,
                    passengerName,passportNumber,nationality);

            System.out.println("------------------ Seat Details --------------------");
            System.out.print("Seat Number: "); String seatNumber = scanner.nextLine();
            System.out.print("Seat Type (Economy/Business): "); String seatType = scanner.nextLine();

            Seat seat=new Seat(id,createdDate,updatedDate,airlineName,address,contactEmail,flightNumber,destination,departureTime,
                    passengerName,passportNumber,nationality,seatNumber,seatType);

            System.out.println("---------------- Ticket Details -------------------");
            System.out.print("Ticket Number: "); String ticketNumber = scanner.nextLine();
            System.out.print("Price: "); double price = Double.parseDouble(scanner.nextLine());

            Ticket ticket=new Ticket(id,createdDate,updatedDate,airlineName,address,contactEmail,flightNumber,destination,departureTime,
                    passengerName,passportNumber,nationality,seatNumber,seatType,ticketNumber,price);

            System.out.println("----------------- Baggage Details ------------------");
            System.out.print("Baggage Weight: "); double baggageWeight = Double.parseDouble(scanner.nextLine());
            System.out.print("Baggage Fee: "); double baggageFee = Double.parseDouble(scanner.nextLine());

            Baggage baggage=new Baggage(id,createdDate,updatedDate,airlineName,address,contactEmail,flightNumber,destination,departureTime,
                    passengerName,passportNumber,nationality,seatNumber,seatType,ticketNumber,price,baggageWeight,baggageFee);

            System.out.println("--------------- Payment Details ------------------");
            System.out.print("Payment Date (YYYY-MM-DD): "); String paymentDate = scanner.nextLine();
            System.out.print("Payment Mode: "); String paymentMode = scanner.nextLine();

            Payment payment=new Payment(id,createdDate,updatedDate,airlineName,address,contactEmail,flightNumber,destination,departureTime,
                    passengerName,passportNumber,nationality,seatNumber,seatType,ticketNumber,price,baggageWeight,baggageFee,paymentDate,paymentMode);

            System.out.println("----------------- Invoice Details ------------------");
            System.out.print("Total Fare (initial): "); double totalFare = Double.parseDouble(scanner.nextLine());

            // Create instance
            TicketRecord record = new TicketRecord(id, createdDate, updatedDate, airlineName, address, contactEmail,
                    flightNumber, destination, departureTime,
                    passengerName, passportNumber, nationality,
                    seatNumber, seatType,
                    ticketNumber, price,
                    baggageWeight, baggageFee,
                    paymentDate, paymentMode,
                    totalFare);

            // Display all details
            System.out.println("============= Airline Ticketing System Details ===============");
            System.out.println("27174 :ID: " + record.getId());
            System.out.println("27174 :Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
            System.out.println("27174 :Airline: " + record.getAirlineName() + ", Address: " + record.getAddress() + ", Email: " + record.getContactEmail());
            System.out.println("27174 :Flight: Number: " + record.getFlightNumber() + ", Destination: " + record.getDestination() + ", Departure: " + record.getDepartureTime());
            System.out.println("27174 :Passenger: " + record.getPassengerName() + ", Passport: " + record.getPassportNumber() + ", Nationality: " + record.getNationality());
            System.out.println("27174 :Seat: Number: " + record.getSeatNumber() + ", Type: " + record.getSeatType());
            System.out.println("27174 :Ticket: Number: " + record.getTicketNumber() + ", Price: $" + record.getPrice());
            System.out.println("27174 :Baggage: Weight: " + record.getBaggageWeight() + "kg, Fee: $" + record.getBaggageFee());
            System.out.println("27174 :Payment: Date: " + record.getPaymentDate() + ", Mode: " + record.getPaymentMode());
            System.out.println("27174 :Initial Total Fare: $" + record.getTotalFare());

            // Compute and display final invoice
            double invoice = record.generateInvoice();
            System.out.println("27174 :Generated Invoice: $" + invoice);

        } catch (AirlineDataException e) {
            System.out.println("27174 :Validation Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("27174 :Input Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
