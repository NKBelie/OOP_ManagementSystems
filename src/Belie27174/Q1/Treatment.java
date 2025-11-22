package Belie27174.Q1;

public class Treatment extends Admission{
    private String diagnosis;
    private String treatmentGiven;
    private int treatmentCost;

    public Treatment(int id, String createDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearOfExperience, String patientName, int age, String gender, String contactNumber, String admissionDate, int roomNumber, int roomCharges, String diagnosis, String treatmentGiven, int treatmentCost)
            throws HospitalDataException
    {
        super(id, createDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges);
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) throws HospitalDataException {
        if (diagnosis==null || diagnosis.isBlank())
            throw new HospitalDataException("27174 : Diagnosis can't be empty");
        this.diagnosis = diagnosis;
    }

    public String getTreatmentGiven() {
        return treatmentGiven;
    }

    public void setTreatmentGiven(String treatmentGiven) throws HospitalDataException {
        if (treatmentGiven==null || treatmentGiven.isBlank()){
            throw new HospitalDataException("27174 : Hospital.Treatment Given can't be Empty");
        }
        this.treatmentGiven = treatmentGiven;
    }

    public int getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(int treatmentCost) throws HospitalDataException {
        if (treatmentCost < 0)
            throw new HospitalDataException("27174 : Treatment cost must be greater than  0.");
        this.treatmentCost = treatmentCost;
    }
}
