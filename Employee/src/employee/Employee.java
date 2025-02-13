/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author GERALDINO_CpE121
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
 
        employee1 emp1 = new employee1("Ted", 1001, "Human Resources", 4500.0);
        employee1 emp2 = new employee1(" Andrei", 1002, "Engineering", 6000.0);
        employee1 emp3 = new employee1(" Josef ", 1003, "Marketing", 5000.0);

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();

    }
}
