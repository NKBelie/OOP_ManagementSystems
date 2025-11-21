# OOP Exercises in Java: Management Systems

This repository contains complete Java implementations for **10 Object-Oriented Programming (OOP) exercises** based on real-world management systems. Each exercise demonstrates core OOP principles: inheritance (linear chain of 10 classes) and encapsulation (private fields with public getters/setters), constructors with input validation (custom exceptions), user input via `Scanner`, and a final computed method in the leaf class.

## Learning Objectives
- Implement class hierarchies with 10 related classes.
- Use private attributes, validated constructors, and accessor methods.
- Handle input validation and display all data with computed results.

## Exercises Overview
| # | System | Key Features | Computation |
|---|--------|--------------|-------------|
| 1 | Hospital Management | Patients, admissions, treatments, bills | `generateBill()`: room + treatment + doctor + medicine |
| 2 | School Management | Students, courses, exams, fees | `calculateAverageMarks()`: (obtained / max) × 100 |
| 3 | Employee Payroll | Attendance, allowances, deductions, salary | `calculateNetSalary()`: basic + allowances - deductions |
| 4 | Hotel Reservation | Rooms, bookings, services, feedback | `generateBill()`: room + service charge |
| 5 | Vehicle Rental | Vehicles, rentals, charges, payments | `calculateTotalCharge()`: rental + penalty |
| 6 | Banking System | Accounts, transactions, loans, payments | `calculateInterest()`: (loan × rate × duration) / 100 |
| 7 | Real Estate Management | Properties, agreements, commissions | `calculateCommission()`: (price × rate) / 100 |
| 8 | Library Management | Books, borrows, fines, payments | `calculateFine()`: fineAmount × daysLate |
| 9 | Airline Ticketing | Flights, passengers, tickets, baggage | `generateInvoice()`: price + baggageFee |
| 10 | Online Shopping | Products, orders, shipping, invoices | `calculateTotalAmount()`: price + shippingCost |

## Setup & Run
1. Clone the repo: `git clone <repo-url>`
2. Navigate to a question folder (e.g., `cd Q1-Hospital`).
3. Compile: `javac *.java`
4. Run: `java <MainClass>` (e.g., `java HospitalManagementSystem`)
5. Enter prompted inputs; view validated output and computation.

## Technologies
- **Language**: Java (Scanner for I/O, regex for validation)
- **Concepts**: Inheritance, Encapsulation, Constructors, Exceptions
- **Requirements**: JDK 8+ (no external libs)

For each exercise, all classes are in separate files with linear inheritance. Contributions welcome fork and PR! 

**Author**: [NDAYISABA KAMARIZA Belie] | **Date**: November 21, 2025
