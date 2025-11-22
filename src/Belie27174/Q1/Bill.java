package Belie27174.Q1;

public class Bill extends Treatment {
    private int doctorFee;
    private int medicineCost;
    private int totalBill;

    public Bill(int id, String createDate, String updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearOfExperience, String patientName, int age, String gender, String contactNumber, String admissionDate, int roomNumber, int roomCharges, String diagnosis, String treatmentGiven, int treatmentCost, int doctorFee, int medicineCost, int totalBill)
            throws HospitalDataException

    {
        super(id, createDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);
        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
        this.totalBill = totalBill;
    }

    public int getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(int doctorFee) throws HospitalDataException {
        if (doctorFee<0)
            throw new HospitalDataException("27174 : Doctor Fee can't be Negative");
        this.doctorFee = doctorFee;
    }

    public int getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(int medicineCost) throws HospitalDataException {
        if (medicineCost<0)
            throw new HospitalDataException("27174 : Medicine Cost can't be Negative");
        this.medicineCost = medicineCost;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) throws HospitalDataException {
        if (totalBill<0)
            throw new HospitalDataException("27174 : Total Hospital.Bill can't be Negative");
        this.totalBill = totalBill;
    }
}
