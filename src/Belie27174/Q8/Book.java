package Belie27174.Q8;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;

    public Book(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        this.title = title;
        this.author = author;
        if (ISBN == null || ISBN.length() < 10) {
            throw new LibraryDataException("27174: ISBN must be greater or equal to 10 chars");
        }
        this.ISBN = ISBN;
    }

    // Public getters/setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) throws LibraryDataException {
        if (ISBN == null || ISBN.length() < 10) {
            throw new LibraryDataException("27174: ISBN must be greater tor equal to 10 chars");
        }
        this.ISBN = ISBN;
    }
}
