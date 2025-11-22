package Belie27174.Q7;

public class Commission extends Payment {
    private double commissionRate;
    private double commissionAmount;

    public Commission(int id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                      String agentName, String email, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String contactNumber,
                      String buyerName, String buyerEmail,
                      String agreementDate, String terms,
                      double paymentAmount, String paymentDate,
                      double commissionRate, double commissionAmount) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate);
        if (commissionRate < 0) {
            throw new RealEstateDataException("27174: Commission rate must be >= 0");
        }
        this.commissionRate = commissionRate;
        this.commissionAmount = commissionAmount;
    }

    // Public getters/setters
    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) throws RealEstateDataException {
        if (commissionRate < 0) throw new RealEstateDataException("27174: Commission rate must be >= 0");
        this.commissionRate = commissionRate;
    }
    public double getCommissionAmount() { return commissionAmount; }
    public void setCommissionAmount(double commissionAmount) { this.commissionAmount = commissionAmount; }
}
