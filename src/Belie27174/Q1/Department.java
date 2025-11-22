package Belie27174.Q1;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode) throws HospitalDataException{
        super(id, createDate, updatedDate, hospitalName, address, phoneNumber, email);
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) throws HospitalDataException {
        if (departmentName.isBlank())
            throw new HospitalDataException("27174 : Department Name is required");
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) throws HospitalDataException {
        if (departmentCode.isBlank() || departmentCode.matches("A-Za-z0-9{3,}")){
            throw new HospitalDataException("27174 : Department code must be greater 3 characters");
        }
        this.departmentCode = departmentCode;
    }
}
