package Belie27174.Q10;

public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(int id, String createdDate, String updatedDate, String storeName, String address, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String customerAddress,
                    String orderDate, String orderId,
                    String paymentMethod, String paymentStatus,
                    String shippingAddress, double shippingCost) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId, paymentMethod, paymentStatus);
        this.shippingAddress = shippingAddress;
        if (shippingCost < 0) {
            throw new ShoppingDataException("27174 :Shipping cost must be greater or equal 0");
        }
        this.shippingCost = shippingCost;
    }

    // Public getters/setters
    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }
    public double getShippingCost() { return shippingCost; }
    public void setShippingCost(double shippingCost) throws ShoppingDataException {
        if (shippingCost < 0) throw new ShoppingDataException("27174 :Shipping cost must be greater or equal to 0");
        this.shippingCost = shippingCost;
    }
}
