package Belie27174.Q9;

public class Invoice extends Payment {
    private double totalFare;

    public Invoice(int id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode,
                   double totalFare) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode);
        if (totalFare <= 0) {
            throw new AirlineDataException("27174 :Total fare must be greater than 0");
        }
        this.totalFare = totalFare;
    }

    // Public getters/setters
    public double getTotalFare() { return totalFare; }
    public void setTotalFare(double totalFare) throws AirlineDataException {
        if (totalFare <= 0) throw new AirlineDataException("27174 :Total fare must be greater than 0");
        this.totalFare = totalFare;
    }
}
