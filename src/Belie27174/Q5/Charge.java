package Belie27174.Q5;

public class Charge extends Rental {
    private double rentalCharge;
    private double penaltyCharge;

    public Charge(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays);
        if (rentalCharge < 0) {
            throw new VehicleDataException("27174: Rental charge must be greater or equal  0");
        }
        this.rentalCharge = rentalCharge;
        if (penaltyCharge < 0) {
            throw new VehicleDataException("27174: Penalty charge must be greater or equal  0");
        }
        this.penaltyCharge = penaltyCharge;
    }

    // Public getters/setters
    public double getRentalCharge() { return rentalCharge; }
    public void setRentalCharge(double rentalCharge) throws VehicleDataException {
        if (rentalCharge < 0) throw new VehicleDataException("27174: Rental charge must be greater or equal  0");
        this.rentalCharge = rentalCharge;
    }
    public double getPenaltyCharge() { return penaltyCharge; }
    public void setPenaltyCharge(double penaltyCharge) throws VehicleDataException {
        if (penaltyCharge < 0) throw new VehicleDataException("27174: Penalty charge must be greater or equal to 0");
        this.penaltyCharge = penaltyCharge;
    }
}
