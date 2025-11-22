package Belie27174.Q10;

public class Category extends Store {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate, String storeName, String address, String email,
                    String categoryName, String categoryCode) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email);
        if (categoryName.isBlank() || categoryName == null){
            System.out.println("27174 : Category Name can't be Empty");
        }
        this.categoryName = categoryName;
        if (categoryCode == null || categoryCode.length() < 3) {
            throw new ShoppingDataException("27174 :Category code must greater or equal to 3 chars");
        }
        this.categoryCode = categoryCode;
    }

    // Public getters/setters
    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
    public String getCategoryCode() { return categoryCode; }
    public void setCategoryCode(String categoryCode) throws ShoppingDataException {
        if (categoryCode == null || categoryCode.length() < 3) {
            throw new ShoppingDataException("27174 :Category code must greater or equal to 3 chars");
        }
        this.categoryCode = categoryCode;
    }
}
