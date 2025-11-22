package Belie27174.Q2;

    import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                // Input prompts for all fields
                System.out.println("------------------- Entity Details -------------------");
                System.out.print("ID: "); int id = scanner.nextInt(); scanner.nextLine();
                System.out.print("Created Date (YYYY-MM-DD): "); String createdDate = scanner.nextLine();
                System.out.print("Updated Date (YYYY-MM-DD): "); String updatedDate = scanner.nextLine();

                System.out.println("---------------- School Details -------------------");
                System.out.print("School Name: "); String schoolName = scanner.nextLine();
                System.out.print("Address: "); String address = scanner.nextLine();
                System.out.print("Phone Number (10 digits): "); String phoneNumber = scanner.nextLine();
                System.out.print("Email: "); String email = scanner.nextLine();

                System.out.println("----------------- Department Details -----------------");
                System.out.print("Department Name: "); String departmentName = scanner.nextLine();
                System.out.print("Department Code (>=3 alphanumeric): "); String departmentCode = scanner.nextLine();

                System.out.println("----------------- Teacher Details ------------------");
                System.out.print("Teacher Name: "); String teacherName = scanner.nextLine();
                System.out.print("Subject: "); String subject = scanner.nextLine();
                System.out.print("Teacher Email: "); String teacherEmail = scanner.nextLine();
                System.out.print("Phone: "); String phone = scanner.nextLine();

                System.out.println("------------------- Student Details -----------------");
                System.out.print("Student Name: "); String studentName = scanner.nextLine();
                System.out.print("Roll Number: "); int rollNumber = scanner.nextInt(); scanner.nextLine();
                System.out.print("Grade: "); String grade = scanner.nextLine();
                System.out.print("Contact Number: "); String contactNumber = scanner.nextLine();

                System.out.println("------------------ Course Details ------------------");
                System.out.print("Course Name: "); String courseName = scanner.nextLine();
                System.out.print("Course Code: "); String courseCode = scanner.nextLine();
                System.out.print("Credit Hours: "); int creditHours = scanner.nextInt(); scanner.nextLine();

                System.out.println("------------------- Exam Details -------------------");
                System.out.print("Exam Name: "); String examName = scanner.nextLine();
                System.out.print("Max Marks: "); int maxMarks = scanner.nextInt(); scanner.nextLine();
                System.out.print("Exam Date (YYYY-MM-DD): "); String examDate = scanner.nextLine();

                System.out.println("--------------------- Result Details -----------------");
                System.out.print("Obtained Marks: "); int obtainedMarks = scanner.nextInt(); scanner.nextLine();
                System.out.print("Remarks: "); String remarks = scanner.nextLine();

                System.out.println("-------------------- Fee Details --------------------");
                System.out.print("Tuition Fee: "); double tuitionFee = scanner.nextDouble();
                System.out.print("Exam Fee: "); double examFee = scanner.nextDouble();
                System.out.print("Total Fee: "); double totalFee = scanner.nextDouble(); scanner.nextLine();

                System.out.print("Average Marks (initial): "); double averageMarks = scanner.nextDouble(); scanner.nextLine();

                // Create instance
                StudentRecord record = new StudentRecord(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                        departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                        studentName, rollNumber, grade, contactNumber,
                        courseName, courseCode, creditHours,
                        examName, maxMarks, examDate,
                        obtainedMarks, remarks,
                        tuitionFee, examFee, totalFee,
                        averageMarks);

                // Display all details
                System.out.println("============= School Management System Details ==================");
                System.out.println("27174 : ID: " + record.getId());
                System.out.println("27174 : Created: " + record.getCreatedDate() + ", Updated: " + record.getUpdatedDate());
                System.out.println("27174 : School: " + record.getSchoolName() + ", " + record.getAddress() + ", " + record.getPhoneNumber() + ", " + record.getEmail());
                System.out.println("27174 : Department: " + record.getDepartmentName() + " (" + record.getDepartmentCode() + ")");
                System.out.println("27174 : Teacher: " + record.getTeacherName() + ", Subject: " + record.getSubject() + ", Email: " + record.getTeacherEmail() + ", Phone: " + record.getPhone());
                System.out.println("27174 : Student: " + record.getStudentName() + ", Roll: " + record.getRollNumber() + ", Grade: " + record.getGrade() + ", Contact: " + record.getContactNumber());
                System.out.println("27174 : Course: " + record.getCourseName() + " (" + record.getCourseCode() + "), Credits: " + record.getCreditHours());
                System.out.println("27174 : Exam: " + record.getExamName() + ", Max Marks: " + record.getMaxMarks() + ", Date: " + record.getExamDate());
                System.out.println("27174 : Result: Obtained: " + record.getObtainedMarks() + ", Remarks: " + record.getRemarks());
                System.out.println("27174 : Fee: Tuition: $" + record.getTuitionFee() + ", Exam: $" + record.getExamFee() + ", Total: $" + record.getTotalFee());
                System.out.println("27174 : Initial Average: " + record.getAverageMarks() + "%");

                // Compute and display final average
                double finalAverage = record.calculateAverageMarks();
                System.out.println("27174 : Computed Average Marks: " + finalAverage + "%");

            } catch (SchoolDataException e) {
                System.out.println("27174 : Validation Error: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
