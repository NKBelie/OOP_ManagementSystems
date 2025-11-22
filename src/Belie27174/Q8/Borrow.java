package Belie27174.Q8;

public class Borrow extends Member {
    private String borrowDate;
    private String returnDate;

    public Borrow(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  String borrowDate, String returnDate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber);
        if (borrowDate == null || borrowDate.trim().isEmpty()) {
            throw new LibraryDataException("27174: Borrow date cannot be empty");
        }
        this.borrowDate = borrowDate;
        if (returnDate == null || returnDate.trim().isEmpty()) {
            throw new LibraryDataException("27174: Return date cannot be empty");
        }
        this.returnDate = returnDate;
    }

    // Public getters/setters
    public String getBorrowDate() { return borrowDate; }
    public void setBorrowDate(String borrowDate) throws LibraryDataException {
        if (borrowDate == null || borrowDate.trim().isEmpty()) throw new LibraryDataException("27174: Borrow date cannot be empty");
        this.borrowDate = borrowDate;
    }
    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) throws LibraryDataException {
        if (returnDate == null || returnDate.trim().isEmpty()) throw new LibraryDataException("27174: Return date cannot be empty");
        this.returnDate = returnDate;
    }
}