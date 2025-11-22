package Belie27174.Q2;

public class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public Fee(int id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone,
               String studentName, int rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, int maxMarks, String examDate,
               int obtainedMarks, String remarks,
               double tuitionFee, double examFee, double totalFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks);
        if (tuitionFee <= 0) {
            throw new SchoolDataException("27174 : Tuition fee must be > 0");
        }
        this.tuitionFee = tuitionFee;
        if (examFee <= 0) {
            throw new SchoolDataException("27174 : Exam fee must be > 0");
        }
        this.examFee = examFee;
        if (totalFee <= 0) {
            throw new SchoolDataException("27174 : Total fee must be > 0");
        }
        this.totalFee = totalFee;
    }

    // Getters and Setters
    public double getTuitionFee() { return tuitionFee; }
    public void setTuitionFee(double tuitionFee) throws SchoolDataException {
        if (tuitionFee <0) throw new SchoolDataException("27174 : Tuition fee must be greater than 0");
        this.tuitionFee = tuitionFee;
    }
    public double getExamFee() { return examFee; }
    public void setExamFee(double examFee) throws SchoolDataException {
        if (examFee < 0) throw new SchoolDataException("27174 : Exam fee must be greater than 0");
        this.examFee = examFee;
    }
    public double getTotalFee() { return totalFee; }
    public void setTotalFee(double totalFee) throws SchoolDataException {
        if (totalFee < 0) throw new SchoolDataException("27174 : Total fee must be greater than 0");
        this.totalFee = totalFee;
    }
}
