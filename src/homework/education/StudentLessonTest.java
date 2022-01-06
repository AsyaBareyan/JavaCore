package homework.education;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.storage.UserStorage;
import homework.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentLessonTest implements StudentLessonCommand {
    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) throws ParseException {
        lessonStorage.add(new Lesson("java", 3, "Karen", 35000));
        lessonStorage.add(new Lesson("javaScr", 2, "Poxos", 25000));
        lessonStorage.add(new Lesson("Pascal", 1, "Petros", 15000));

        User user = new User("Poxos", "Poxosyan", "poxosyan@gmail.com", "poxosyan", "user");
        User user1 = new User("Petros", "Petrosyan", "petrosyan@gmail.com", "petrosyan", "admin");
        User user2 = new User("Martiros", "Martirosyan", "mart@gmail.com", "martirosyan", "user");
        userStorage.add("poxosyan@gmail.com", user);
        userStorage.add("petrosyan@gmail.com", user1);
        userStorage.add("mart@gmail.com", user2);

        boolean isRun = true;
        while (isRun) {
            UserCommand.printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case UserCommand.EXIT:
                    isRun = false;
                    break;
                case UserCommand.LOGIN:
                    login();
                    break;
                case UserCommand.REGISTER:
                    register();
                    break;
                default:
                    System.out.println("invalid command");
                    break;
            }
        }
    }

    private static void login() throws ParseException {

        System.out.println("Please input user's email");
        String email = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        System.out.println("Please input password");
        String password = scanner.nextLine();
        if (user.getPassword().equals(password)) {
            if (user.getType().equals("user")) {
                user();
            } else if (user.getType().equals("admin")) {
                admin();
            }
        } else {
            System.err.println("password is wrong");
            login();

        }
    }

    private static void admin() throws ParseException {
        boolean isRun1 = true;

        while (isRun1) {
            StudentLessonCommand.printCommand();
            String commands = scanner.nextLine();

            switch (commands) {
                case EXIT:
                    isRun1 = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
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


    private static void user() throws ParseException {
        boolean isRun2 = true;

        while (isRun2) {
            StudentLessonCommand.printCommandForUser();
            String commands = scanner.nextLine();

            switch (commands) {
                case EXIT:
                    isRun2 = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("invalid command!");

            }
        }
    }


    private static void deleteStudentByEmail() {
        System.out.println("Please input practice.student's email for delete");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deleteStudentByEmail(student);
        } else {
            System.out.println("Don't found practice.student whit this email");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("Please choose lesson name for delete");
        System.out.println("__________");
        lessonStorage.print();
        System.out.println("__________");
        String lessonname = scanner.nextLine();
        if (lessonStorage.getByName(lessonname) != null) {
            lessonStorage.deleteByName(lessonname);
        } else {
            System.out.println("lesson doesn't exists");
        }
    }

    private static void printStudentsByLesson() {
        System.out.println("Please choose lesson's");
        lessonStorage.print();
        String lessonNameStr = scanner.nextLine();
        String[] lessonArray = lessonNameStr.split(",");
        if (lessonArray.length == 0) {
            System.out.println("please choose lesson's");
            return;
        }
        Lesson[] lessons = new Lesson[lessonArray.length];
        int index = 0;
        for (String lesson : lessonArray) {
            Lesson lessonName = lessonStorage.getByName(lesson);
            if (lessonName != null) {
                lessons[index++] = lessonName;
            } else {
                System.err.println("please input correct lesson's name");
                return;
            }
            studentStorage.printStudentsByLesson(lessonName);
        }
    }

    private static void addStudent() throws ParseException {
        System.out.println("Please choose lesson's");
        lessonStorage.print();
        String lessonNameStr = scanner.nextLine();
        String[] lessonArray = lessonNameStr.split(",");
        if (lessonArray.length == 0) {
            System.out.println("please choose lesson's");
            return;
        }
        Set<Lesson> lessons = new HashSet<>();
//        Lesson[] lessons = new Lesson[lessonArray.length];
//        int index = 0;
        for (String lesson : lessonArray) {
            Lesson lessonName = lessonStorage.getByName(lesson);
            if (lessonName != null) {
                lessons.add(lessonName);
//                lessons[index++] = lessonName;
            } else {
                System.err.println("please input correct lesson's name");
                return;
            }
        }

        System.out.println("Please input practice.student's email");
        String email = scanner.nextLine();
        if (studentStorage.getByEmail(email) == null) {
            System.out.println("Please input practice.student's name");
            String name = scanner.nextLine();
            System.out.println("Please input practice.student's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input practice.student's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input practice.student's phone");
            String phone = scanner.nextLine();
            System.out.println("Please input registered date[01/01/2021]");
            String dateStr = scanner.nextLine();
            Date date = DateUtil.stringToDate(dateStr);
            Student student = new Student(name, surname, age, email, phone, lessons, date);
            studentStorage.add(student);
            System.out.println("thank you, practice.student was added");
        } else {
            System.err.println("practice.student with this email: " + email + " was exists");
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
        if (lessonStorage.getByName(lesson.getName()) != null) {
            System.err.println("Invalid name. Lesson whit this name already exists");
        } else {
            lessonStorage.add(lesson);
            System.out.println("Thank you, lesson was added");
        }
    }


    private static void register() {
        System.out.println("Please input user's email");
        String email = scanner.nextLine();
        try {
            userStorage.getByEmail(email);
            System.err.println("user already exists");
        } catch (Exception e) {
            System.out.println("Please input user's name");
            String name = scanner.nextLine();
            System.out.println("Please input user's surname");
            String surname = scanner.nextLine();

            System.out.println("Please input password");
            String password = scanner.nextLine();
            System.out.println("Please input user's type admin or user");

            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("ADMIN") || type.equalsIgnoreCase("USER")) {

                User user = new User(name, surname, email, password, type);
                userStorage.add(email, user);
                System.out.println("Thank you user was added");

            } else {
                System.err.println("invalid type");
                register();
            }
        }
    }
}