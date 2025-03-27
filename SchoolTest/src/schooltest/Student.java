/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schooltest;

import java.util.ArrayList;

/**
 *
 * @author GERALDINO_CpE121
 */
public class Student {
      private String name;
    private int id;

    public Student (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }

    public String getName() {
        return name;
    }
}

class Classroom {
    private String className;
    private ArrayList<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to " + className);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println(student.getName() + " removed from " + className);
    }

    public void displayStudents() {
        System.out.println("Classroom: " + className);
        for (Student student : students) {
            student.displayInfo();
        }
    }

    public void transferStudent(Student student, Classroom newClassroom) {
        if (students.contains(student)) {
            removeStudent(student);
            newClassroom.addStudent(student);
            System.out.println(student.getName() + " transferred from " + className + " to " + newClassroom.className);
        } else {
            System.out.println("Student not found in " + className);
        }
    }
}

