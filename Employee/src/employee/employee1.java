/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author GERALDINO_CpE121
 */
public class employee1 {
   // Attributes (fields)
    private String name;
    private int employeeId;
    private String department;
    private double monthlySalary;

    // Default Constructor (optional)
    public employee1() {
        // Provide default values if desired
        this.name = "Unknown";
        this.employeeId = 0;
        this.department = "None";
        this.monthlySalary = 0.0;
    }

    // Parameterized Constructor
    public employee1(String name, int employeeId, String department, double monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Annual Salary: $" + calculateAnnualSalary());
        System.out.println("-----------------------------");
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // (Optional) Getter and Setter methods for further practice
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // Additional getters and setters can be created similarly...
}
