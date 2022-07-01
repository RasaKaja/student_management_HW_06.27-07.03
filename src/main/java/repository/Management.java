package repository;

import dto.Student;

import javax.swing.*;
import java.util.ArrayList;

public class Management {

    ArrayList<Student> students = new ArrayList<>();

//    ArrayList<Student> allStudents(){
//        return this.students;
//    }

    public void listOfStudents(){
        System.out.println("Students list:");
        for (Student student : students){
            System.out.println(student);
        }
    }

    public void addNewStudent(String name, String grade){
        name = (String) JOptionPane.showInputDialog("Students name:");
        grade = (String) JOptionPane.showInputDialog("Enter the grade:");

        students.add(new Student(name,grade));
    }

    public void defaultStudents(){
        Student rasa = new Student("Rasa", "11a");
        Student ana = new Student("Ana", "11b");
        Student jonas = new Student("Jonas", "12c");
        Student darius = new Student("Darius", "10d");
        addDefaultStudent(rasa);
        addDefaultStudent(ana);
        addDefaultStudent(jonas);
        addDefaultStudent(darius);
    }

    public void addDefaultStudent(Student student){
        this.students.add(student);
    }
}

/*build a student management system
student - create, see student, edit, delete
teacher - create, see teacher, edit, delete
course - create, see course, edit, delete
exam results - create, update, see exam results
should be able to enter exam result specifying student, course and score
should be able to specify teacher assigned to a course
application should not close until user specify a close command made available by you
can keep all info in list in memory
all classes and functionalities can be used from single School class*/