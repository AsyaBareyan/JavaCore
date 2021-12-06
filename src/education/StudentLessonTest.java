package education;

import education.model.Lesson;
import education.model.Student;
import education.model.User;
import education.storage.LessonStorage;
import education.storage.StudentStorage;
import education.storage.UserStorage;
import education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class StudentLessonTest implements StudentLessonCommand {
    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) throws ParseException {
        lessonStorage.add(new Lesson("java", 3, "Karen", 35000));
        lessonStorage.add(new Lesson("javaScr", 2, "Poxos", 25000));
        lessonStorage.add(new Lesson("Pascal", 1, "Petros", 15000));

        userStorage.add(new User("Martiros", "Martirosyan", "mart@gmail.com", "martirosyan", "user"));
        userStorage.add(new User("Poxos", "Poxosyan", "poxosyan@gmail.com", "poxosyan", "user"));
        userStorage.add(new User("Petros", "Petrosyan", "petrosyan@gmail.com", "petrosyan", "admin"));

        boolean isRun = true;
        while (isRun) {
            UserCommand.printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case UserCommand.EXIT:
                    break;
                case UserCommand.LOGIN:
                    login();
                    break;
                case UserCommand.REGISTER:
                    addUser();
                    break;
                default:
                    System.out.println("invalid command!");
                    break;
            }
            while (isRun) {
                StudentLessonCommand.printCommand();
                String commands = scanner.nextLine();

                switch (commands) {
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
    }

    private static void deleteStudentByEmail() {
        System.out.println("Please input student's email for delete");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deleteStudentByEmail(student);
        } else {
            System.out.println("Don't found student whit this email");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("Please choose lesson name for delete");
        System.out.println("__________");
        lessonStorage.print();
        System.out.println("__________");
        String lessonname = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonname);
        if (lesson != null) {
            lessonStorage.deleteByName(lesson);
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
//        System.out.println("Please input student's email");
//        String email = scanner.nextLine();
//        Student student = studentStorage.getByEmail(email);
//        if (student != null) {
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
        }
//        Lesson[] lessons = new Lesson[lesson.length];
//        for (int i = 0; i < lesson.length; i++) {
//            if (lessonStorage.getByName(lesson[i]) != null) {
//                lessons[i] = lessonStorage.getByName(lesson[i]);
//            } else {
//                System.out.println("Don't found lesson's");
//            }
//        }
        System.out.println("Please input student's email");
        String email = scanner.nextLine();
        if (studentStorage.getByEmail(email) == null) {
            System.out.println("Please input student's name");
            String name = scanner.nextLine();
            System.out.println("Please input student's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input student's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input student's phone");
            String phone = scanner.nextLine();
            System.out.println("Please input registered date[01/01/2021]");
            String dateStr = scanner.nextLine();
            Date date = DateUtil.stringToDate(dateStr);
            Student student = new Student(name, surname, age, email, phone, lessons, date);
            studentStorage.add(student);
            System.out.println("thank you, student was added");
        } else {
            System.err.println("student with this email: " + email + " was exists");
        }
//        if (studentStorage.getByEmail(student.getEmail()) == null) {
//            studentStorage.add(student);
//            System.out.println("thank you, student was added");
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


    private static void login() {

        System.out.println("Please input user's email");
        String email = scanner.nextLine();
        System.out.println("Please input password");
        String password = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            if (user.getType().equals("user")) {
                StudentLessonCommand.printCommandForUser();
            } else if (user.getType().equals("admin")) {
                StudentLessonCommand.printCommand();

            }
        } else {
            System.err.println("login or password is wrong");
            login();
        }
    }

    private static void addUser() {
        System.out.println("Please input user's email");
        String email = scanner.nextLine();
        if (userStorage.getByEmail(email) == null) {
            System.out.println("Please input user's name");
            String name = scanner.nextLine();
            System.out.println("Please input user's surname");
            String surname = scanner.nextLine();

            System.out.println("Please input password");
            String password = scanner.nextLine();
            System.out.println("Please input user's type admin or user");

            String type = scanner.nextLine();

            User user = new User(name, surname, email, password, type);
            userStorage.add(user);
            System.out.println("Thank you user was added");

        } else {
            System.err.println("User with this email was exists");
        }
    }
}
