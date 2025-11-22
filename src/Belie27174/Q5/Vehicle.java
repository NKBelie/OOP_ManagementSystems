package Belie27174.Q5;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    public Vehicle(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        if (dailyRate <= 0) {
            throw new VehicleDataException("27174: Daily rate must be greater than 0");
        }
        this.dailyRate = dailyRate;
    }

    // Public getters/setters
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) throws VehicleDataException {
        if (dailyRate <= 0) throw new VehicleDataException("27174: Daily rate must be greater than 0");
        this.dailyRate = dailyRate;
    }
}