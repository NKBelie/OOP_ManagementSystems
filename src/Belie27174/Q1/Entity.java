package Belie27174.Q1;

public class Entity {
    private int id;
    private String createDate;
    private String updatedDate;

    public Entity(int id, String createDate, String updatedDate)
            throws HospitalDataException {
        this.id = id;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws HospitalDataException {
        if (id <= 0)
            throw new HospitalDataException("Id must be greater to (0) Zero");
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) throws HospitalDataException {
        if (createDate==null || createDate.isBlank()){
            throw new HospitalDataException("Created Date Can not be Empty");
        }
        this.createDate = createDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) throws HospitalDataException {
        if (updatedDate==null|| updatedDate.isBlank()){
            throw new HospitalDataException("Update Date can be Empty");
        }
        this.updatedDate = updatedDate;
    }
}
