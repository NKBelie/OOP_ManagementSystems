package Belie27174.Q8;

public class Fine extends Borrow {
    private double fineAmount;
    private int daysLate;

    public Fine(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN,
                String memberName, int memberId, String contactNumber,
                String borrowDate, String returnDate,
                double fineAmount, int daysLate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate);
        if (fineAmount < 0) {
            throw new LibraryDataException("27174: Fine amount must be greater or equal to 0");
        }
        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }

    // Public getters/setters
    public double getFineAmount() { return fineAmount; }
    public void setFineAmount(double fineAmount) throws LibraryDataException {
        if (fineAmount < 0) throw new LibraryDataException("27174: Fine amount must be greater or equal 0");
        this.fineAmount = fineAmount;
    }
    public int getDaysLate() { return daysLate; }
    public void setDaysLate(int daysLate) { this.daysLate = daysLate; }
}
