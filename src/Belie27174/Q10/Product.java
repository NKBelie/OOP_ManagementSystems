package Belie27174.Q10;

public class Product extends Category {
    private String productName;
    private String productCode;
    private double price;

    public Product(int id, String createdDate, String updatedDate, String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode);
        this.productName = productName;
        this.productCode = productCode;
        if (price <= 0) {
            throw new ShoppingDataException("27174 :Price must be greater than 0");
        }
        this.price = price;
    }

    // Public getters/setters
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public String getProductCode() { return productCode; }
    public void setProductCode(String productCode) { this.productCode = productCode; }
    public double getPrice() { return price; }
    public void setPrice(double price) throws ShoppingDataException {
        if (price <= 0) throw new ShoppingDataException("27174 :Price must be greater than 0");
        this.price = price;
    }
}
