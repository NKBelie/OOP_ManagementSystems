package Belie27174.Q4;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight,
                String customerName, String customerEmail, String contactNumber,
                String bookingDate, String checkInDate, String checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, String paymentDate,
                double roomCharge, double serviceCharge, double totalBill) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate);
        if (roomCharge <= 0) {
            throw new HotelDataException("27174: Room charge must be greater than 0");
        }
        this.roomCharge = roomCharge;
        if (serviceCharge <= 0) {
            throw new HotelDataException("27174: Service charge must be greater than 0");
        }
        this.serviceCharge = serviceCharge;
        if (totalBill <= 0) {
            throw new HotelDataException("27174: Total bill must be greater than 0");
        }
        this.totalBill = totalBill;
    }

    // Public getters/setters
    public double getRoomCharge() { return roomCharge; }
    public void setRoomCharge(double roomCharge) throws HotelDataException {
        if (roomCharge <= 0) throw new HotelDataException("27174: Room charge must be greater than 0");
        this.roomCharge = roomCharge;
    }
    public double getServiceCharge() { return serviceCharge; }
    public void setServiceCharge(double serviceCharge) throws HotelDataException {
        if (serviceCharge <= 0) throw new HotelDataException("27174: Service charge must be greater than 0");
        this.serviceCharge = serviceCharge;
    }
    public double getTotalBill() { return totalBill; }
    public void setTotalBill(double totalBill) throws HotelDataException {
        if (totalBill <= 0) throw new HotelDataException("27174: Total bill must be greater than 0");
        this.totalBill = totalBill;
    }
}
