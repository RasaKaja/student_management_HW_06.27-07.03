package dto;

import java.util.UUID;

public class Teacher {
    public final String name;
    private final UUID teacherId;
    private Course course;

    public Teacher(String name) {
        this.name = name;
        this.teacherId = UUID.randomUUID();
    }

    public Teacher(String name, Course course) {
        this.name = name;
        this.course = course;
        this.teacherId = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getTeacherId() {
        return teacherId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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