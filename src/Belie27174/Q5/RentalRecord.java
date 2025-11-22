package Belie27174.Q5;

public class RentalRecord extends Invoice {
    public RentalRecord(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                        String branchName, String locationCode,
                        String vehicleType, String registrationNumber, double dailyRate,
                        String customerName, String licenseNumber, String contactNumber,
                        String rentalDate, String returnDate, int rentalDays,
                        double rentalCharge, double penaltyCharge,
                        String paymentMode, String transactionId,
                        double totalCharge) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId, totalCharge);
    }

    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
}
