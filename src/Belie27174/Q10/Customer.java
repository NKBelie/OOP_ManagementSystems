package Belie27174.Q10;

public class Customer extends Product {
    private String customerName;
    private String contactNumber;
    private String customerAddress;

    public Customer(int id, String createdDate, String updatedDate, String storeName, String address, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String customerAddress) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price);
        this.customerName = customerName;
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Contact number cannot be empty");
        }
        this.contactNumber = contactNumber;
        if (customerAddress == null || customerAddress.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Customer address cannot be empty");
        }
        this.customerAddress = customerAddress;
    }

    // Public getters/setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws ShoppingDataException {
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Contact number cannot be empty");
        }
        this.contactNumber = contactNumber;
    }
    public String getCustomerAddress() { return customerAddress; }
    public void setCustomerAddress(String customerAddress) throws ShoppingDataException {
        if (customerAddress == null || customerAddress.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Customer address cannot be empty");
        }
        this.customerAddress = customerAddress;
    }
}
