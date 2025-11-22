package Belie27174.Q8;

public class Member extends Book {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN);
        this.memberName = memberName;
        if (memberId <= 0) {
            throw new LibraryDataException("27174: Member ID must be greater than 0");
        }
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }

    // Public getters/setters
    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) { this.memberName = memberName; }
    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) throws LibraryDataException {
        if (memberId <= 0) throw new LibraryDataException("27174: Member ID must be greater than 0");
        this.memberId = memberId;
    }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
