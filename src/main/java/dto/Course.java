package dto;

public class Course {
    public String Course;
    public Teacher teacher;
    public String grade;

    public Course(String course) {
        Course = course;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public Teacher getTeacher() {
        return teacher;
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