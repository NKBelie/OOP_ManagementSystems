package Belie27174.Q4;

public class ReservationRecord extends Feedback {
    public ReservationRecord(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                             String roomNumber, String roomType, double pricePerNight,
                             String customerName, String customerEmail, String contactNumber,
                             String bookingDate, String checkInDate, String checkOutDate,
                             String serviceName, double serviceCost,
                             String paymentMethod, String paymentDate,
                             double roomCharge, double serviceCharge, double totalBill,
                             int rating, String comments) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge, totalBill, rating, comments);
    }

    public double generateBill() {
        return getRoomCharge() + getServiceCharge();
    }
}
