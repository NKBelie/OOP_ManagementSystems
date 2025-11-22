package Belie27174.Q1;

public class Admission extends Patient{
    private String admissionDate;
    private int roomNumber;
    private int roomCharges;

    public Admission(int id, String createDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearOfExperience, String patientName, int age, String gender, String contactNumber, String admissionDate, int roomNumber, int roomCharges)
            throws HospitalDataException
    {
        super(id, createDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearOfExperience, patientName, age, gender, contactNumber);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) throws HospitalDataException {
        if (admissionDate==null || admissionDate.isBlank()){
            throw new HospitalDataException("27174 : Admission Date can't be empty");
        }
        this.admissionDate = admissionDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) throws HospitalDataException {
        if (roomNumber <= 0)
            throw new HospitalDataException("27174 : Room number must be greater than 0.");
        this.roomNumber = roomNumber;

    }

    public int getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(int roomCharges) throws HospitalDataException {
        if (roomCharges <0)
            throw new HospitalDataException("27174 : Room charges must be greater than 0.");
        this.roomCharges = roomCharges;
    }
}
