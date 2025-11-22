package Belie27174.Q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, String createDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone) throws HospitalDataException{
        super(id, createDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) throws HospitalDataException {
        if (doctorName.isBlank())
            throw new HospitalDataException("27174 : Doctor Name is required");
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) throws HospitalDataException {
        this.specialization = specialization;
        if (specialization.isBlank())
            throw new HospitalDataException("27174 : Specialization is required");

    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) throws HospitalDataException{
        this.doctorEmail = doctorEmail;
        if (!doctorEmail.contains("@") && !doctorEmail.contains("."))
            throw new HospitalDataException("27174 : Invalid Email format");

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws HospitalDataException {
        if (!phone.matches("\\d{10}"))
            throw new HospitalDataException("27174 : Phone Number must Be 10 digit");

        this.phone = phone;
    }
}
