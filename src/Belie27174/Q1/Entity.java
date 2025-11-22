package Belie27174.Q1;


public class Entity {
    private int id;
    private String createDate;
    private String updatedDate;

    public Entity(int id, String createDate, String updatedDate)
            throws HospitalDataException {
        if (id <= 0) {
            throw new HospitalDataException("Id must be greater to (0) Zero");
        }
        if (createDate==null || updatedDate==null || createDate.trim().isEmpty() || updatedDate.trim().isEmpty()) {
            throw new HospitalDataException("Created Date Can not be Empty");
        }
        this.id = id;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws HospitalDataException {

        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) throws HospitalDataException {

        this.createDate = createDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) throws HospitalDataException {

        this.updatedDate = updatedDate;
    }
    @Override
    public String toString(){
        return
                "Entity ID: "+ id +
                "/nCreated Date: "+ createDate +
                "/nUpdated Date: "+ updatedDate ;
    }
}
