package Belie27174.Q7;

public class Payment extends Agreement {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                   String agentName, String email, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String contactNumber,
                   String buyerName, String buyerEmail,
                   String agreementDate, String terms,
                   double paymentAmount, String paymentDate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms);
        if (paymentAmount <= 0) {
            throw new RealEstateDataException("27174: Payment amount must be greater than 0");
        }
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    // Public getters/setters
    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) throws RealEstateDataException {
        if (paymentAmount <= 0) throw new RealEstateDataException("27174: Payment amount must be greater than 0");
        this.paymentAmount = paymentAmount;
    }
    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }
}
