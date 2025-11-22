package Belie27174.Q2;

public class Course extends Student {
    private String courseName;
    private String courseCode;
    private int creditHours;

    public Course(int id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber);
        this.courseName = courseName;
        this.courseCode = courseCode;
        if (creditHours <= 0) {
            throw new SchoolDataException("27174 : Credit hours must be > 0");
        }
        this.creditHours = creditHours;
    }

    // Getters and Setters
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public int getCreditHours() { return creditHours; }
    public void setCreditHours(int creditHours) throws SchoolDataException {
        if (creditHours <= 0) throw new SchoolDataException("27174 : Credit hours must be > 0");
        this.creditHours = creditHours;
    }
}
