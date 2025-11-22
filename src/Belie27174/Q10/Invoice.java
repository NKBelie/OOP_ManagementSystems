package Belie27174.Q10;

public class Invoice extends Shipping {
    private double totalAmount;

    public Invoice(int id, String createdDate, String updatedDate, String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String customerAddress,
                   String orderDate, String orderId,
                   String paymentMethod, String paymentStatus,
                   String shippingAddress, double shippingCost,
                   double totalAmount) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
        if (totalAmount <= 0) {
            throw new ShoppingDataException("27174 :Total amount must be greater than 0");
        }
        this.totalAmount = totalAmount;
    }

    // Public getters/setters
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) throws ShoppingDataException {
        if (totalAmount <= 0) throw new ShoppingDataException("27174 :Total amount must be greater than 0");
        this.totalAmount = totalAmount;
    }
}
