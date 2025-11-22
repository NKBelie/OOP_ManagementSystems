package Belie27174.Q9;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(int id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, String departureTime,
                     String passengerName, String passportNumber, String nationality) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime);
        this.passengerName = passengerName;
        if (passportNumber == null || passportNumber.trim().isEmpty()) {
            throw new AirlineDataException("27174 :Passport number cannot be empty");
        }
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    // Public getters/setters
    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }
    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) throws AirlineDataException {
        if (passportNumber == null || passportNumber.trim().isEmpty()) throw new AirlineDataException("27174 :Passport number cannot be empty");
        this.passportNumber = passportNumber;
    }
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
}
