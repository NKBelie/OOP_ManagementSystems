package Belie27174.Q7;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        this.agentName = agentName;
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new RealEstateDataException("27174: Valid email required");
        }
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    // Public getters/setters
    public String getAgentName() { return agentName; }
    public void setAgentName(String agentName) { this.agentName = agentName; }
    public String getEmail() { return email; }
    public void setEmail(String email) throws RealEstateDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new RealEstateDataException("27174: Valid email required");
        }
        this.email = email;
    }
    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
}
