/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schooltest;

/**
 *
 * @author GERALDINO_CpE121
 */
public class SchoolTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Classroom classA = new Classroom("Engineering BSECE");
        Classroom classB = new Classroom("Engineering BSCpE");

        Student student1 = new Student("Kyle", 2);
        Student student2 = new Student("James", 1);

        classA.addStudent(student1);
        classA.addStudent(student2);

        System.out.println("Before Transfer:");
        classA.displayStudents();
        classB.displayStudents();

        classA.transferStudent(student1, classB);

        System.out.println("After Transfer:");
        classA.displayStudents();
        classB.displayStudents();
    }
}

    
