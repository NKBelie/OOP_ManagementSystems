package Belie27174.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("============= HOSPITAL MANAGEMENT SYSTEM ==============");

            // ---------------- ENTITY ----------------
            System.out.println("-------------ENTITY INFORMATION -------------");
            System.out.print("Enter Entity ID : ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Enter Created Date (YYYY-MM-DD): ");
            String createdDate = sc.nextLine().trim();

            System.out.print("Enter Updated Date (YYYY-MM-DD): ");
            String updatedDate = sc.nextLine().trim();


            // ---------------- HOSPITAL ----------------
            System.out.println("---------------- HOSPITAL INFORMATION ----------------");
            System.out.print("Hospital Name: ");
            String hospitalName = sc.nextLine().trim();

            System.out.print("Address: ");
            String address = sc.nextLine().trim();

            System.out.print("Phone (10 digits): ");
            String phoneNumber = sc.nextLine().trim();

            System.out.print("Email: ");
            String email = sc.nextLine().trim();


            // ---------------- DEPARTMENT ----------------
            System.out.println("--------------- DEPARTMENT INFORMATION -----------------");
            System.out.print("Department Name: ");
            String departmentName = sc.nextLine().trim();

            System.out.print("Department Code (≥3 chars): ");
            String departmentCode = sc.nextLine().trim();


            // ---------------- DOCTOR ----------------
            System.out.println("--------------- DOCTOR INFORMATION --------------------");
            System.out.print("Doctor Name: ");
            String doctorName = sc.nextLine().trim();

            System.out.print("Specialization: ");
            String specialization = sc.nextLine().trim();

            System.out.print("Doctor Email: ");
            String doctorEmail = sc.nextLine().trim();

            System.out.print("Doctor Phone (10 digits): ");
            String doctorPhone = sc.nextLine().trim();


            // ---------------- NURSE ----------------
            System.out.println("--------------- NURSE INFORMATION ---------------------");
            System.out.print("Nurse Name: ");
            String nurseName = sc.nextLine().trim();

            System.out.print("Shift (Day/Night): ");
            String shift = sc.nextLine().trim();

            System.out.print("Years of Experience: ");
            int years = Integer.parseInt(sc.nextLine().trim());


            // ---------------- PATIENT ----------------
            System.out.println("---------------- PATIENT INFORMATION ------------------");
            System.out.print("Patient Name: ");
            String patientName = sc.nextLine().trim();

            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Gender (Male/Female/Other): ");
            String gender = sc.nextLine().trim();

            System.out.print("Patient Contact Number: ");
            String contactNumber = sc.nextLine().trim();


            // ---------------- ADMISSION ----------------
            System.out.println("---------------- ADMISSION DETAILS ---------------------");
            System.out.print("Admission Date (YYYY-MM-DD): ");
            String admissionDate = sc.nextLine().trim();

            System.out.print("Room Number: ");
            int roomNumber = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Room Charges: ");
            int roomCharges = Integer.parseInt(sc.nextLine().trim());


            // ---------------- TREATMENT ----------------
            System.out.println("---------------- TREATMENT DETAILS -------------------");
            System.out.print("Diagnosis: ");
            String diagnosis = sc.nextLine().trim();

            System.out.print("Treatment Summary: ");
            String treatmentGiven = sc.nextLine().trim();

            System.out.print("Treatment Cost: ");
            int treatmentCost = Integer.parseInt(sc.nextLine().trim());


            // ---------------- BILLING ----------------
            System.out.println("---------------- BILLING INFORMATION ----------------");
            System.out.print("Doctor Fee: ");
            int doctorFee = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Medicine Cost: ");
            int medicineCost = Integer.parseInt(sc.nextLine().trim());


            // ---------------- CREATE OBJECT ----------------
            HospitalRecord hospitalRecord = new HospitalRecord(id, createdDate, updatedDate,hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone, nurseName, shift, years, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost, doctorFee, medicineCost);

            System.out.println("---------------- Record Saved Successfully! ----------------");


            // ---------------- PRINT RECEIPT ----------------
            System.out.println("============= HOSPITAL BILL RECEIPT =============");
            System.out.printf("%-25s: %s%n", "27174 : Patient Name", hospitalRecord.getPatientName());
            System.out.printf("%-25s: %s%n", "27174 : Gender", hospitalRecord.getGender());
            System.out.printf("%-25s: %d%n", "27174 : Age", hospitalRecord.getAge());
            System.out.println("-------------------------------------------------");
            System.out.printf("%-25s: %.2f%n", "27174 : Room Charges", hospitalRecord.getRoomCharges());
            System.out.printf("%-25s: %.2f%n", "27174 : Treatment Cost", hospitalRecord.getTreatmentCost());
            System.out.printf("%-25s: %.2f%n", "27174 : Doctor Fee", hospitalRecord.getDoctorFee());
            System.out.printf("%-25s: %.2f%n", "27174 : Medicine Cost", hospitalRecord.getMedicineCost());
            System.out.println("-------------------------------------------------");
            System.out.printf(" TOTAL PAYABLE", hospitalRecord.generateBill());
            System.out.println("=================================================");

        } catch (NumberFormatException nfe) {
            System.err.println("27174 :  Input error: Enter correct numbers!");
        } catch (Exception ex) {
            System.err.println("27174 : Unexpected error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
