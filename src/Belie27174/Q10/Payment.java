package Belie27174.Q10;

public class Payment extends Order {
    private String paymentMethod;
    private String paymentStatus;

    public Payment(int id, String createdDate, String updatedDate, String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String customerAddress,
                   String orderDate, String orderId,
                   String paymentMethod, String paymentStatus) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId);
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Payment method cannot be empty");
        }
        this.paymentMethod = paymentMethod;
        if (paymentStatus == null || paymentStatus.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Payment status cannot be empty");
        }
        this.paymentStatus = paymentStatus;
    }

    // Public getters/setters
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) throws ShoppingDataException {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) throw new ShoppingDataException("27174 :Payment method cannot be empty");
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) throws ShoppingDataException {
        if (paymentStatus == null || paymentStatus.trim().isEmpty()) throw new ShoppingDataException("27174 :Payment status cannot be empty");
        this.paymentStatus = paymentStatus;
    }
}
