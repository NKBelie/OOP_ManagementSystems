package Belie27174.Q7;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency(int id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        this.agencyName = agencyName;
        this.location = location;
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RealEstateDataException("27174: Valid phone required (10 digits)");
        }
        this.phoneNumber = phoneNumber;
    }

    // Public getters/setters
    public String getAgencyName() { return agencyName; }
    public void setAgencyName(String agencyName) { this.agencyName = agencyName; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws RealEstateDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RealEstateDataException("27174: Valid phone required (10 digits)");
        }
        this.phoneNumber = phoneNumber;
    }
}
