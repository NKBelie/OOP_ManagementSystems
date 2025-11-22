package Belie27174.Q2;

public class StudentRecord extends Fee {
    private double averageMarks;

    public StudentRecord(int id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone,
                         String studentName, int rollNumber, String grade, String contactNumber,
                         String courseName, String courseCode, int creditHours,
                         String examName, int maxMarks, String examDate,
                         int obtainedMarks, String remarks,
                         double tuitionFee, double examFee, double totalFee,
                         double averageMarks) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks, tuitionFee, examFee, totalFee);
        this.averageMarks = averageMarks;
    }

    public double calculateAverageMarks() {
        if (getMaxMarks() == 0) return 0.0;
        return (getObtainedMarks() / (double) getMaxMarks()) * 100;
    }

    // Getter and Setter for averageMarks (though computed, included for completeness)
    public double getAverageMarks() { return averageMarks; }
    public void setAverageMarks(double averageMarks) { this.averageMarks = averageMarks; }
}
