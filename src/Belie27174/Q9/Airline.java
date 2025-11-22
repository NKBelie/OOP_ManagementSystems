package Belie27174.Q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail) throws AirlineDataException {
        super(id, createdDate, updatedDate);
        this.airlineName = airlineName;
        this.address = address;
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new AirlineDataException("27174: Valid email format required");
        }
        this.contactEmail = contactEmail;
    }

    // Public getters/setters
    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) throws AirlineDataException {
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new AirlineDataException("27174: Valid email format required");
        }
        this.contactEmail = contactEmail;
    }
}
