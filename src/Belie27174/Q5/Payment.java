package Belie27174.Q5;

public class Payment extends Charge {
    private String paymentMode;
    private String transactionId;

    public Payment(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new VehicleDataException("27174: Payment mode cannot be empty");
        }
        this.paymentMode = paymentMode;
        if (transactionId == null || transactionId.trim().isEmpty()) {
            throw new VehicleDataException("27174: Transaction ID cannot be empty");
        }
        this.transactionId = transactionId;
    }

    // Public getters/setters
    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) throws VehicleDataException {
        if (paymentMode == null || paymentMode.trim().isEmpty()) throw new VehicleDataException("27174: Payment mode cannot be empty");
        this.paymentMode = paymentMode;
    }
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) throws VehicleDataException {
        if (transactionId == null || transactionId.trim().isEmpty()) throw new VehicleDataException("27174: Transaction ID cannot be empty");
        this.transactionId = transactionId;
    }
}
