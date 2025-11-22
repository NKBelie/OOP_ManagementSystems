package Belie27174.Q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate);
        this.serviceName = serviceName;
        if (serviceCost <= 0) {
            throw new HotelDataException("27174: Service cost must be greater than 0");
        }
        this.serviceCost = serviceCost;
    }

    // Public getters/setters
    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
    public double getServiceCost() { return serviceCost; }
    public void setServiceCost(double serviceCost) throws HotelDataException {
        if (serviceCost <= 0) throw new HotelDataException("27174: Service cost must be greater than 0");
        this.serviceCost = serviceCost;
    }
}
