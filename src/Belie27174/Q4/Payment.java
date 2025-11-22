package Belie27174.Q4;

public class Payment extends Service {
    private String paymentMethod;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod, String paymentDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost);
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new HotelDataException("27174: Payment method cannot be null or empty");
        }
        this.paymentMethod = paymentMethod;
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            throw new HotelDataException("27174: Payment date cannot be null or empty");
        }
        this.paymentDate = paymentDate;
    }

    // Public getters/setters
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) throws HotelDataException {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) throw new HotelDataException("27174: Payment method cannot be null or empty");
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws HotelDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty()) throw new HotelDataException("27174: Payment date cannot be null or empty");
        this.paymentDate = paymentDate;
    }
}
