package Belie27174.Q1;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearOfExperience;

    public Nurse(int id, String createDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearOfExperience)
            throws HospitalDataException
    {
        super(id, createDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone);
        this.nurseName = nurseName;
        this.shift = shift;
        this.yearOfExperience = yearOfExperience;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) throws HospitalDataException {
        if (nurseName==null || nurseName.isBlank())
            throw new HospitalDataException("27174 : Required Nurse name");
        this.nurseName = nurseName;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) throws HospitalDataException {
        if (shift==null)
            throw new HospitalDataException("27174 : Shift cannot be null");
        String s=shift.trim();
        if (!s.equalsIgnoreCase("Day") || s.equalsIgnoreCase("Night"))
            throw new HospitalDataException("27174 : Shift must be 'Day' or 'Night'");
        this.shift = s;

    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) throws HospitalDataException {
        this.yearOfExperience = yearOfExperience;
        if (yearOfExperience<0)
            throw new HospitalDataException("27174 : Year of experience greater 0");
    }
}
