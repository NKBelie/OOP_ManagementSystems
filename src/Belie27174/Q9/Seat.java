package Belie27174.Q9;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType;

    public Seat(int id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail,
                String flightNumber, String destination, String departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality);
        this.seatNumber = seatNumber;
        if (!"Economy".equals(seatType) && !"Business".equals(seatType)) {
            throw new AirlineDataException("27174 :Seat type must be 'Economy' or 'Business'");
        }
        this.seatType = seatType;
    }

    // Public getters/setters
    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public String getSeatType() { return seatType; }
    public void setSeatType(String seatType) throws AirlineDataException {
        if (!"Economy".equals(seatType) && !"Business".equals(seatType)) {
            throw new AirlineDataException("27174 :Seat type must be 'Economy' or 'Business'");
        }
        this.seatType = seatType;
    }
}

