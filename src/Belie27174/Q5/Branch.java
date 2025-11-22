package Belie27174.Q5;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        this.branchName = branchName;
        if (locationCode == null || locationCode.length() < 3) {
            throw new VehicleDataException("27174: Location code must be greater or equal to 3 chars");
        }
        this.locationCode = locationCode;
    }

    // Public getters/setters
    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) { this.branchName = branchName; }
    public String getLocationCode() { return locationCode; }
    public void setLocationCode(String locationCode) throws VehicleDataException {
        if (locationCode == null || locationCode.length() < 3) {
            throw new VehicleDataException("27174: Location code must be greater or equal to 3 chars");
        }
        this.locationCode = locationCode;
    }
}
