package Belie27174.Q9;

public class Payment extends Baggage {
    private String paymentDate;
    private String paymentMode;

    public Payment(int id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            throw new AirlineDataException("27174 :Payment date cannot be empty");
        }
        this.paymentDate = paymentDate;
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new AirlineDataException("27174 :Payment mode cannot be empty");
        }
        this.paymentMode = paymentMode;
    }

    // Public getters/setters
    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws AirlineDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty()) throw new AirlineDataException("27174 :Payment date cannot be empty");
        this.paymentDate = paymentDate;
    }
    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) throws AirlineDataException {
        if (paymentMode == null || paymentMode.trim().isEmpty()) throw new AirlineDataException("27174 :Payment mode cannot be empty");
        this.paymentMode = paymentMode;
    }
}