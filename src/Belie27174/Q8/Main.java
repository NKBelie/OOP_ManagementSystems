package Belie27174.Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("----------------- Entity Details -------------");
            System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
            System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

            Entity entity=new Entity(id,createdDate,updatedDate);

            System.out.println("----------------- Library Details ---------------");
            System.out.print("Library Name: "); String libraryName = scanner.nextLine();
            System.out.print("Location: "); String location = scanner.nextLine();
            System.out.print("Phone Number (10 digits): "); String phoneNumber = scanner.nextLine();

            Library library=new Library(id,createdDate,updatedDate,libraryName,location,phoneNumber);

            System.out.println("------------------ Section Details ---------------");
            System.out.print("Section Name: "); String sectionName = scanner.nextLine();
            System.out.print("Section Code (>=3 chars): "); String sectionCode = scanner.nextLine();

            Section section=new Section(id,createdDate,updatedDate,libraryName,location,phoneNumber,sectionName,sectionCode);

            System.out.println("------------------- Book Details -----------------");
            System.out.print("Title: "); String title = scanner.nextLine();
            System.out.print("Author: "); String author = scanner.nextLine();
            System.out.print("ISBN (>=10 chars): "); String ISBN = scanner.nextLine();

            Book book=new Book(id,createdDate,updatedDate,libraryName,location,phoneNumber,sectionName,sectionCode,title,author,ISBN);

            System.out.println("------------------ Member Details -----------------");
            System.out.print("Member Name: "); String memberName = scanner.nextLine();
            System.out.print("Member ID: "); int memberId = Integer.parseInt(scanner.nextLine());
            System.out.print("Contact Number: "); String contactNumber = scanner.nextLine();

            Member member=new Member(id,createdDate,updatedDate,libraryName,location,phoneNumber,sectionName,sectionCode,title,author,ISBN,memberName,
                    memberId,contactNumber);

            System.out.println("-------------------- Borrow Details -------------------");
            System.out.print("Borrow Date (YYYY-MM-DD): "); String borrowDate = scanner.nextLine();
            System.out.print("Return Date (YYYY-MM-DD): "); String returnDate = scanner.nextLine();

            Borrow borrow=new Borrow(id,createdDate,updatedDate,libraryName,location,phoneNumber,sectionName,sectionCode,title,author,ISBN,memberName,
                    memberId,contactNumber,borrowDate,returnDate);

            System.out.println("-------------------- Fine Details ---------------");
            System.out.print("Fine Amount: "); double fineAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Days Late: "); int daysLate = Integer.parseInt(scanner.nextLine());

            Fine fine=new Fine(id,createdDate,updatedDate,libraryName,location,phoneNumber,sectionName,sectionCode,title,author,ISBN,memberName,
                    memberId,contactNumber,borrowDate,returnDate,fineAmount,daysLate);

            System.out.println("--------------- Payment Details ----------------");
            System.out.print("Payment Date (YYYY-MM-DD): "); String paymentDate = scanner.nextLine();
            System.out.print("Payment Mode: "); String paymentMode = scanner.nextLine();

            Payment payment=new Payment(id,createdDate,updatedDate,libraryName,location,phoneNumber,sectionName,sectionCode,title,author,ISBN,memberName,
                    memberId,contactNumber,borrowDate,returnDate,fineAmount,daysLate,paymentDate,paymentMode);

            System.out.println("---------------- Record Details -----------------");
            System.out.print("Total Fine (initial): "); double totalFine = Double.parseDouble(scanner.nextLine());

            Record rrecord=new Record(id,createdDate,updatedDate,libraryName,location,phoneNumber,sectionName,sectionCode,title,author,ISBN,memberName,
                    memberId,contactNumber,borrowDate,returnDate,fineAmount,daysLate,paymentDate,paymentMode,totalFine);

            // Create instance
            LibraryRecord record = new LibraryRecord(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                    sectionName, sectionCode,
                    title, author, ISBN,
                    memberName, memberId, contactNumber,
                    borrowDate, returnDate,
                    fineAmount, daysLate,
                    paymentDate, paymentMode,
                    totalFine);

            // Display all details
            System.out.println("============== Library Management System Details ===============");
            System.out.println("27174: ID: " + record.getId());
            System.out.println("27174: Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
            System.out.println("27174: Library: " + record.getLibraryName() + ", Location: " + record.getLocation() + ", Phone: " + record.getPhoneNumber());
            System.out.println("27174: Section: " + record.getSectionName() + ", Code: " + record.getSectionCode());
            System.out.println("27174: Book: Title: " + record.getTitle() + ", Author: " + record.getAuthor() + ", ISBN: " + record.getISBN());
            System.out.println("27174: Member: " + record.getMemberName() + ", ID: " + record.getMemberId() + ", Contact: " + record.getContactNumber());
            System.out.println("27174: Borrow: Date: " + record.getBorrowDate() + ", Return: " + record.getReturnDate());
            System.out.println("27174: Fine: Amount: $" + record.getFineAmount() + ", Days Late: " + record.getDaysLate());
            System.out.println("27174: Payment: Date: " + record.getPaymentDate() + ", Mode: " + record.getPaymentMode());
            System.out.println("27174: Initial Total Fine: $" + record.getTotalFine());

            // Compute and display final fine
            double computedFine = record.calculateFine();
            System.out.println("Calculated Fine: $" + computedFine);

        } catch (LibraryDataException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Input Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
