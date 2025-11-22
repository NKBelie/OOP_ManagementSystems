package Belie27174.Q7;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;

    public Seller(int id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                  String agentName, String email, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price);
        this.sellerName = sellerName;
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new RealEstateDataException("27174: Contact number cannot be empty");
        }
        this.contactNumber = contactNumber;
    }

    // Public getters/setters
    public String getSellerName() { return sellerName; }
    public void setSellerName(String sellerName) { this.sellerName = sellerName; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws RealEstateDataException {
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new RealEstateDataException("27174: Contact number cannot be empty");
        }
        this.contactNumber = contactNumber;
    }
}
