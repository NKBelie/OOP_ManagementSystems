package Belie27174.Q1;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(int id, String createDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearOfExperience, String patientName, int age, String gender, String contactNumber)
            throws HospitalDataException{
        super(id, createDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift,yearOfExperience);
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) throws HospitalDataException {
        if (patientName == null || patientName.isBlank())
            throw new HospitalDataException("27174 : Patient name cannot be empty.");
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws HospitalDataException {
        if (age<0)
            throw new HospitalDataException("27174 : your age can't be negative");
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws HospitalDataException {

        if (!(gender.equalsIgnoreCase("Male")|| gender.equalsIgnoreCase("Female")|| gender.equalsIgnoreCase("Other")))
            throw new HospitalDataException("27174 : Gender must be Male, Female, or Other.");
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) throws HospitalDataException {
        if (patientName == null || patientName.isBlank())
            throw new HospitalDataException("27174 : Patient name cannot be empty.");
        this.contactNumber = contactNumber;
    }
}
