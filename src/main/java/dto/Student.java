package dto;

import java.util.UUID;

public class Student {
    public final String name;
    private final UUID studentId;
    public String grade;

    public Student(String name) {
        this.name = name;
        this.studentId = UUID.randomUUID();
    }

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.studentId = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public UUID getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return name + " from the class: " + grade;
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