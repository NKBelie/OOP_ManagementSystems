package Belie27174.Q4;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        if (pricePerNight <= 0) {
            throw new HotelDataException("27174: Price per night must be greater than 0");
        }
        this.pricePerNight = pricePerNight;
    }

    // Public getters/setters
    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) { this.roomType = roomType; }
    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) throws HotelDataException {
        if (pricePerNight <= 0) throw new HotelDataException("27174: Price per night must be greater than 0");
        this.pricePerNight = pricePerNight;
    }
}
