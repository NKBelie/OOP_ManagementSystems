package Belie27174.Q5;

public class Rental extends Customer {
    private String rentalDate;
    private String returnDate;
    private int rentalDays;

    public Rental(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber);
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        if (rentalDays <= 0) {
            throw new VehicleDataException("27174: Rental days must be greater than 0");
        }
        this.rentalDays = rentalDays;
    }

    // Public getters/setters
    public String getRentalDate() { return rentalDate; }
    public void setRentalDate(String rentalDate) { this.rentalDate = rentalDate; }
    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) { this.returnDate = returnDate; }
    public int getRentalDays() { return rentalDays; }
    public void setRentalDays(int rentalDays) throws VehicleDataException {
        if (rentalDays <= 0) throw new VehicleDataException("27174: Rental days must be greater than 0");
        this.rentalDays = rentalDays;
    }
}
