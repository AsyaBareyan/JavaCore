package homework.education;

public interface StudentLessonCommand {
    String EXIT = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";


    static void printCommand() {
        System.out.println("Please input  " + EXIT + " for exit");
        System.out.println("Please input  " + ADD_LESSON + " for add lesson");
        System.out.println("Please input  " + ADD_STUDENT + " for add practice.student");
        System.out.println("Please input  " + PRINT_STUDENTS + " for print students");
        System.out.println("Please input  " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("Please input  " + PRINT_LESSONS + " for print lessons");
        System.out.println("Please input  " + DELETE_LESSON_BY_NAME + " for delete lessons by name");
        System.out.println("Please input  " + DELETE_STUDENT_BY_EMAIL + " for delete students by email");
    }

    static void printCommandForUser(){
        System.out.println("Please input  " + EXIT + " for exit");
        System.out.println("Please input  " + ADD_LESSON + " for add lesson");
        System.out.println("Please input  " + ADD_STUDENT + " for add practice.student");
        System.out.println("Please input  " + PRINT_STUDENTS + " for print students");
        System.out.println("Please input  " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("Please input  " + PRINT_LESSONS + " for print lessons");
    }
}
