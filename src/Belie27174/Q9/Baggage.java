package Belie27174.Q9;

public class Baggage extends Ticket {
    private double baggageWeight;
    private double baggageFee;

    public Baggage(int id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price);
        if (baggageWeight < 0) {
            throw new AirlineDataException("27174: Baggage weight must be greater or equal to 0");
        }
        this.baggageWeight = baggageWeight;
        if (baggageFee < 0) {
            throw new AirlineDataException("27174: Baggage fee must be greater or equal to 0");
        }
        this.baggageFee = baggageFee;
    }

    // Public getters/setters
    public double getBaggageWeight() { return baggageWeight; }
    public void setBaggageWeight(double baggageWeight) throws AirlineDataException {
        if (baggageWeight < 0) throw new AirlineDataException("27174: Baggage weight must be greater or equal to 0");
        this.baggageWeight = baggageWeight;
    }
    public double getBaggageFee() { return baggageFee; }
    public void setBaggageFee(double baggageFee) throws AirlineDataException {
        if (baggageFee < 0) throw new AirlineDataException("27174: Baggage fee must be greater or equal to 0");
        this.baggageFee = baggageFee;
    }
}
