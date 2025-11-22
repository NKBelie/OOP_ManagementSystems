package Belie27174.Q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, String createDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email)
            throws HospitalDataException {

        super(id, createDate, updatedDate);
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) throws HospitalDataException{
        if (hospitalName.isBlank())
            throw new HospitalDataException("27174 : Hospital Name Is Required");
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws HospitalDataException {
        if (address.isBlank())
            throw new HospitalDataException("27174 : Address is Required");
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws HospitalDataException {
        if (!phoneNumber.matches("\\d{10}"))
            throw new HospitalDataException("27174 : Phone Number must Be 10 digit");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws HospitalDataException {
        if(!email.contains("@")|| !email.contains("."))
            throw new HospitalDataException("27174 : Invalid Email format");
        this.email = email;


    }
}
