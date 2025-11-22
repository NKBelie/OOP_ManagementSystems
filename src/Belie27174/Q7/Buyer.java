package Belie27174.Q7;

public class Buyer extends Seller {
    private String buyerName;
    private String buyerEmail;

    public Buyer(int id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String contactNumber,
                 String buyerName, String buyerEmail) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber);
        this.buyerName = buyerName;
        if (buyerEmail == null || !buyerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new RealEstateDataException("27174: Valid buyer email required");
        }
        this.buyerEmail = buyerEmail;
    }

    // Public getters/setters
    public String getBuyerName() { return buyerName; }
    public void setBuyerName(String buyerName) { this.buyerName = buyerName; }
    public String getBuyerEmail() { return buyerEmail; }
    public void setBuyerEmail(String buyerEmail) throws RealEstateDataException {
        if (buyerEmail == null || !buyerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new RealEstateDataException("27174: Valid buyer email required");
        }
        this.buyerEmail = buyerEmail;
    }
}
