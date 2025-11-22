package Belie27174.Q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        this.sectionName = sectionName;
        if (sectionCode == null || sectionCode.length() < 3) {
            throw new LibraryDataException("27174: Section code must be greater or equal to 3 chars");
        }
        this.sectionCode = sectionCode;
    }

    // Public getters/setters
    public String getSectionName() { return sectionName; }
    public void setSectionName(String sectionName) { this.sectionName = sectionName; }
    public String getSectionCode() { return sectionCode; }
    public void setSectionCode(String sectionCode) throws LibraryDataException {
        if (sectionCode == null || sectionCode.length() < 3) {
            throw new LibraryDataException("27174: Section code must be greater or equal to 3 chars");
        }
        this.sectionCode = sectionCode;
    }
}
