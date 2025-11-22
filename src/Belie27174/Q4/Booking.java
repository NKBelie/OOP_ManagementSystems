package Belie27174.Q4;

public class Booking extends Customer {
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    public Booking(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber);
        if (bookingDate == null || bookingDate.trim().isEmpty()) {
            throw new HotelDataException("27174: Booking date cannot be empty");
        }
        this.bookingDate = bookingDate;
        if (checkInDate == null || checkInDate.trim().isEmpty()) {
            throw new HotelDataException("27174: Check-in date cannot be empty");
        }
        this.checkInDate = checkInDate;
        if (checkOutDate == null || checkOutDate.trim().isEmpty()) {
            throw new HotelDataException("27174: Check-out date cannot be empty");
        }
        this.checkOutDate = checkOutDate;
    }

    // Public getters/setters
    public String getBookingDate() { return bookingDate; }
    public void setBookingDate(String bookingDate) throws HotelDataException {
        if (bookingDate == null || bookingDate.trim().isEmpty()) throw new HotelDataException("27174: Booking date cannot be empty");
        this.bookingDate = bookingDate;
    }
    public String getCheckInDate() { return checkInDate; }
    public void setCheckInDate(String checkInDate) throws HotelDataException {
        if (checkInDate == null || checkInDate.trim().isEmpty()) throw new HotelDataException("27174: Check-in date cannot be empty");
        this.checkInDate = checkInDate;
    }
    public String getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(String checkOutDate) throws HotelDataException {
        if (checkOutDate == null || checkOutDate.trim().isEmpty()) throw new HotelDataException("27174: Check-out date cannot be empty");
        this.checkOutDate = checkOutDate;
    }
}
