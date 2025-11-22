package Belie27174.Q2;

public class Result extends Exam {
    private int obtainedMarks;
    private String remarks;

    public Result(int id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours,
                  String examName, int maxMarks, String examDate,
                  int obtainedMarks, String remarks) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, maxMarks, examDate);
        if (obtainedMarks < 0) {
            throw new SchoolDataException("27174 : Obtained marks must be greater or equal to 0");
        }
        this.obtainedMarks = obtainedMarks;
        if (remarks == null || remarks.trim().isEmpty()) {
            throw new SchoolDataException("27174 : Remarks cannot be empty");
        }
        this.remarks = remarks;
    }

    // Getters and Setters
    public int getObtainedMarks() { return obtainedMarks; }
    public void setObtainedMarks(int obtainedMarks) throws SchoolDataException {
        if (obtainedMarks < 0) throw new SchoolDataException("27174 : Obtained marks must be greater or equal to 0");
        this.obtainedMarks = obtainedMarks;
    }
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) throws SchoolDataException {
        if (remarks == null || remarks.trim().isEmpty()) throw new SchoolDataException("27174 : Remarks cannot be empty");
        this.remarks = remarks;
    }
}
