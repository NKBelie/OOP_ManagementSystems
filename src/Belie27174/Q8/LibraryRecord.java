package Belie27174.Q8;

public class LibraryRecord extends Record {
    public LibraryRecord(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                         String sectionName, String sectionCode,
                         String title, String author, String ISBN,
                         String memberName, int memberId, String contactNumber,
                         String borrowDate, String returnDate,
                         double fineAmount, int daysLate,
                         String paymentDate, String paymentMode,
                         double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode, totalFine);
    }

    public double calculateFine() {
        return getFineAmount() * getDaysLate();
    }
}
