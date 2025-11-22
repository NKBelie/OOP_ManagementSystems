package Belie27174.Q8;

public class Record extends Payment {
    private double totalFine;

    public Record(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  String borrowDate, String returnDate,
                  double fineAmount, int daysLate,
                  String paymentDate, String paymentMode,
                  double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode);
        if (totalFine <= 0) {
            throw new LibraryDataException("27174: Total fine must be greater than 0");
        }
        this.totalFine = totalFine;
    }

    // Public getters/setters
    public double getTotalFine() { return totalFine; }
    public void setTotalFine(double totalFine) throws LibraryDataException {
        if (totalFine <= 0) throw new LibraryDataException("Total fine must be greater than 0");
        this.totalFine = totalFine;
    }
}
