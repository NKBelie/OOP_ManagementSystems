package Belie27174.Q9;

public class Ticket extends Seat {
    private String ticketNumber;
    private double price;

    public Ticket(int id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime,
                  String passengerName, String passportNumber, String nationality,
                  String seatNumber, String seatType,
                  String ticketNumber, double price) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType);
        this.ticketNumber = ticketNumber;
        if (price <= 0) {
            throw new AirlineDataException("27174 :Price must be grater than 0");
        }
        this.price = price;
    }

    // Public getters/setters
    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }
    public double getPrice() { return price; }
    public void setPrice(double price) throws AirlineDataException {
        if (price <= 0) throw new AirlineDataException("27174 :Price must be greater than 0");
        this.price = price;
    }
}
