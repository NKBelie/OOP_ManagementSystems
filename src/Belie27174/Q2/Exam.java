package Belie27174.Q2;

public class Exam extends Course {
    private String examName;
    private int maxMarks;
    private String examDate;

    public Exam(int id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone,
                String studentName, int rollNumber, String grade, String contactNumber,
                String courseName, String courseCode, int creditHours,
                String examName, int maxMarks, String examDate) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);
        this.examName = examName;
        if (maxMarks <= 0) {
            throw new SchoolDataException("27174 : Max marks must be greater than 0");
        }
        this.maxMarks = maxMarks;
        if (examDate == null || examDate.trim().isEmpty()) {
            throw new SchoolDataException("27174 : Exam date cannot be empty");
        }
        this.examDate = examDate;
    }

    // Getters and Setters
    public String getExamName() { return examName; }
    public void setExamName(String examName) { this.examName = examName; }
    public int getMaxMarks() { return maxMarks; }
    public void setMaxMarks(int maxMarks) throws SchoolDataException {
        if (maxMarks <= 0) throw new SchoolDataException("27174 : Max marks must be greater than 0");
        this.maxMarks = maxMarks;
    }
    public String getExamDate() { return examDate; }
    public void setExamDate(String examDate) throws SchoolDataException {
        if (examDate == null || examDate.trim().isEmpty()) throw new SchoolDataException("27174 : Exam date cannot be empty");
        this.examDate = examDate;
    }
}
