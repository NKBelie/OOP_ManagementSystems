package Belie27174.Q10;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store(int id, String createdDate, String updatedDate, String storeName, String address, String email) throws ShoppingDataException {
        super(id, createdDate, updatedDate);
        this.storeName = storeName;
        this.address = address;
        if (email == null || !email.matches("^[a-z0-9+_.-]+@[a-z0-9.-]+$"))
            throw new ShoppingDataException("27174 :Valid email format required");
        this.email = email;
    }

    // Public getters/setters
    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getEmail() { return email; }
    public void setEmail(String email) throws ShoppingDataException {
        if (email == null || !email.matches("^[a-z0-9+_.-]+@[a-z0-9.-]+$")) {
            throw new ShoppingDataException("27174 :Valid email format required");
        }
        this.email = email;
    }
}
