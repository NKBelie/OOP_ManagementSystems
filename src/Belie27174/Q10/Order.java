package Belie27174.Q10;

public class Order extends Customer {
    private String orderDate;
    private String orderId;

    public Order(int id, String createdDate, String updatedDate, String storeName, String address, String email,
                 String categoryName, String categoryCode,
                 String productName, String productCode, double price,
                 String customerName, String contactNumber, String customerAddress,
                 String orderDate, String orderId) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress);
        if (orderDate == null || orderDate.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Order date cannot be empty");
        }
        this.orderDate = orderDate;
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Order ID cannot be empty");
        }
        this.orderId = orderId;
    }

    // Public getters/setters
    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) throws ShoppingDataException {
        if (orderDate == null || orderDate.trim().isEmpty()) throw new ShoppingDataException("27174 :Order date cannot be empty");
        this.orderDate = orderDate;
    }
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) throws ShoppingDataException {
        if (orderId == null || orderId.trim().isEmpty()) throw new ShoppingDataException("27174 :Order ID cannot be empty");
        this.orderId = orderId;
    }
}
