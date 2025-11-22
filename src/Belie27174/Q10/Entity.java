package Belie27174.Q10;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws ShoppingDataException {
        if (id < 0) {
            throw new ShoppingDataException("27174 :ID must be greater than 0");
        }
        if (createdDate == null || createdDate.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Created date cannot be null or empty");
        }
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            throw new ShoppingDataException("27174 :Updated date cannot be null or empty");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    // Public getters/setters (inherited by all subclasses)
    public int getId() { return id; }
    public void setId(int id) throws ShoppingDataException {
        if (id <0)
            throw new ShoppingDataException("27174 :ID must be greater than 0");
        this.id = id;
    }
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws ShoppingDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new ShoppingDataException("27174 :Created date cannot be null or empty");
        this.createdDate = createdDate;
    }
    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws ShoppingDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new ShoppingDataException("27174 :Updated date cannot be null or empty");
        this.updatedDate = updatedDate;
    }
}
