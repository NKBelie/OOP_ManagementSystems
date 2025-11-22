package Belie27174.Q5;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber, String contactNumber) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate);
        this.customerName = customerName;
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) {
            throw new VehicleDataException("27174: License number cannot be empty");
        }
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }

    // Public getters/setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) throws VehicleDataException {
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) {
            throw new VehicleDataException("27174: License number cannot be empty");
        }
        this.licenseNumber = licenseNumber;
    }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
