package education;

import java.util.Scanner;

public class StudentLessonTest {
    static Scanner scanner = new Scanner(System.in);
    static StudentStorage ss = new StudentStorage();
    static LessonStorage ls = new LessonStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommand() {
        System.out.println("Please input  " + EXIT + " for exit");
        System.out.println("Please input  " + ADD_LESSON + " for add lesson");
        System.out.println("Please input  " + ADD_STUDENT + " for add student");
        System.out.println("Please input  " + PRINT_STUDENTS + " for print students");
        System.out.println("Please input  " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("Please input  " + PRINT_LESSONS + " for print lessons");
        System.out.println("Please input  " + DELETE_LESSON_BY_NAME + " for delete lessons by name");
        System.out.println("Please input  " + DELETE_STUDENT_BY_EMAIL + " for delete students by email");
    }

    public static void main(String[] args) {
        ls.add(new Lesson("java", 3, "Karen", 35000));
        ls.add(new Lesson("javaScr", 2, "Poxos", 25000));
        ls.add(new Lesson("Pascal", 1, "Petros", 15000));

        boolean isRun = true;
        while (isRun) {
            printCommand();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    ss.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    ls.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("invalid command!");

            }
        }


    }

    private static void deleteStudentByEmail() {
        System.out.println("Please input student's email for delete");
        String email = scanner.nextLine();
        Student student = ss.getByEmail(email);
        if (student != null) {
            ss.deleteStudentByEmail(student);
        } else {
            System.out.println("Don't found student whit this email");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("Please choose lesson name for delete");
        System.out.println("__________");
        ls.print();
        System.out.println("__________");
        String lessonname = scanner.nextLine();
        Lesson lesson = ls.getByName(lessonname);
        if (lesson != null) {
            ls.deleteByName(lesson);
        }
    }

    private static void printStudentsByLesson() {
        System.out.println("Please choose lesson name");
        System.out.println("__________");
        ls.print();
        System.out.println("__________");
        String lessonname = scanner.nextLine();
        Lesson lesson = ls.getByName(lessonname);
        if (lesson != null) {
            ss.printStudentsByLesson(lesson);
        } else {
            System.err.println("Dont found lesson whit this name");
        }
    }

    private static void addStudent() {
        System.out.println("Please choose lessonname");
        System.out.println("__________");
        ls.print();
        System.out.println("__________");
        String lessonname = scanner.nextLine();
        Lesson lesson = ls.getByName(lessonname);
        if (lesson != null) {

            System.out.println("Please input student's name");
            String name = scanner.nextLine();
            System.out.println("Please input student's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input student's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input student's email");
            String email = scanner.nextLine();
            System.out.println("Please input student's phone");
            String phone = scanner.nextLine();

            Student student = new Student(name, surname, age, email, phone, lesson);
            if (ss.getByEmail(student.getEmail()) != null) {
                System.err.println("Invalid email, Student with this email already exists");
            } else {
                ss.add(student);
                System.out.println("Thank you, student was added");
            }
        } else {
            System.out.println("Not found lessonname. Try again");
        }
    }

    private static void addLesson() {
        System.out.println("Please input lesson's name");
        String name = scanner.nextLine();
        System.out.println("Please input lesson's duration");
        double duration = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input lecturer name");
        String lecturerName = scanner.nextLine();
        System.out.println("Please input lesson's price");
        double price = Double.parseDouble(scanner.nextLine());
        Lesson lesson = new Lesson(name, duration, lecturerName, price);
        if (ls.getByName(lesson.getName()) != null) {
            System.err.println("Invalid name. Lesson whit this name already exists");
        } else {
            ls.add(lesson);
            System.out.println("Thank you, lesson was added");
        }
    }


}
