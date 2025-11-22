package Belie27174.Q1;

public class HospitalRecord extends Bill{

    private static int totalBill ;

    public HospitalRecord(int id, String createDate, String updatedDate, String hospitalName, String address,
                          String phoneNumber, String email, String departmentName, String departmentCode,
                          String doctorName, String specialization, String doctorEmail, String phone,
                          String nurseName, String shift, int yearOfExperience, String patientName, int age, String gender,
                          String contactNumber, String admissionDate, int roomNumber, int roomCharges,
                          String diagnosis, String treatmentGiven, int treatmentCost, int doctorFee, int medicineCost)
            throws HospitalDataException
    {
        super(id, createDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost, doctorFee, medicineCost, totalBill);
    }

    public Object generateBill(){
        System.out.println("--------------Hospital Record------------------");
        int total;
        total=getRoomCharges()+getTreatmentCost()+getDoctorFee()+getMedicineCost();
        System.out.println("27174 : Room Charge = "+getRoomCharges() );
        System.out.println("27174 : Treatment Cost = "+getTreatmentCost());
        System.out.println("27174 : Doctor Fee = "+getDoctorFee());
        System.out.println("27174 : Medicine Cost = "+getMedicineCost());
        return null;
    }

}
