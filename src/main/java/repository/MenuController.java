package repository;

import javax.swing.*;

public class MenuController {

    Management management = new Management();

    public MenuController() {
        this.management = management;
    }

    public void start(){
        this.displayMenu();
    }

    private void displayMenu() {
        JOptionPane.showInputDialog(null, "Welcome to the school. Choose an option on the next prompt.");
        String option = JOptionPane.showInputDialog(null, """
                === STUDENT's ZONE ===
                1. add New
                2. select One
                3. select All
                4. edit
                5. delete
                === TEACHER's ZONE ===
                6. add New
                7. select One
                8. select All
                9. edit
                10. delete
                === COURSE info ===
                11. add New
                12. select One
                13. select All
                14. edit
                15. delete
                === EXAM's info ===
                16. add New result
                17. update result
                18. see All results
                === 0 for EXIt ===
                """);

        switch (option){
            case "1":
                //add New Student
                break;
            case "2":
                //select One Student
                break;
            case "3":
                this.displayAllStudents();
                break;
            case "4":
                //edit Student
                break;
            case "5":
                //delete Student
                break;
            case "6":
                //add New teacher
                break;
            case "7":
                //select One teacher
                break;
            case "8":
                //select All teacher
                break;
            case "9":
                //edit teacher
                break;
            case "10":
                //delete teacher
                break;
            case "11":
                //add New Course
                break;
            case "12":
                //select One Course
                break;
            case "13":
                //sselect All Course
                break;
            case "14":
                //edit Course
                break;
            case "15":
                // delete Course
                break;
            case "16":
                // add Exam result
                break;
            case "17":
                // update exam results
                break;
            case "18":
                // see all exam results
                break;
            case "0":
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Please select valid number");
                break;
        }

        displayMenu();
    }

    private void displayAllStudents(){
        this.management.listOfStudents();
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