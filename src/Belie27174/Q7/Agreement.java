package Belie27174.Q7;

public class Agreement extends Buyer {
    private String agreementDate;
    private String terms;

    public Agreement(int id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                     String agentName, String email, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String contactNumber,
                     String buyerName, String buyerEmail,
                     String agreementDate, String terms) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail);
        if (agreementDate == null || agreementDate.trim().isEmpty()) {
            throw new RealEstateDataException("27174: Agreement date cannot be empty");
        }
        this.agreementDate = agreementDate;
        if (terms == null || terms.trim().isEmpty()) {
            throw new RealEstateDataException("27174: Terms cannot be empty");
        }
        this.terms = terms;
    }

    // Public getters/setters
    public String getAgreementDate() { return agreementDate; }
    public void setAgreementDate(String agreementDate) throws RealEstateDataException {
        if (agreementDate == null || agreementDate.trim().isEmpty()) throw new RealEstateDataException("27174: Agreement date cannot be empty");
        this.agreementDate = agreementDate;
    }
    public String getTerms() { return terms; }
    public void setTerms(String terms) throws RealEstateDataException {
        if (terms == null || terms.trim().isEmpty()) throw new RealEstateDataException("27174: Terms cannot be empty");
        this.terms = terms;
    }
}