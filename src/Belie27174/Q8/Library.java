package Belie27174.Q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        this.libraryName = libraryName;
        this.location = location;
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new LibraryDataException("27174: Valid phone required (10 digits)");
        }
        this.phoneNumber = phoneNumber;
    }

    // Public getters/setters
    public String getLibraryName() { return libraryName; }
    public void setLibraryName(String libraryName) { this.libraryName = libraryName; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws LibraryDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new LibraryDataException("27174: Valid phone required (10 digits)");
        }
        this.phoneNumber = phoneNumber;
    }
}
