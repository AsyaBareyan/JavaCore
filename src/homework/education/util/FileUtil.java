package homework.education.util;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;

import java.io.*;
import java.util.List;
import java.util.Map;

public class FileUtil {
    private static final String DATA_PATH = "C:\\Users\\Asya\\IdeaProjects\\JavaCore\\src\\homework\\education\\util";

    public static void serializeLessons(List<Lesson> lessonList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\lessons.as"))) {
            out.writeObject(lessonList);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void serializeStudents(List<Student> studentList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\students.as"))) {
            out.writeObject(studentList);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void serializeUser(Map<String, User> userMap) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\user.as"))) {
            out.writeObject(userMap);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    public static List<Lesson> deserializeLessons() {
        File lessonsFile = new File(DATA_PATH + "\\lessons.as");
        if (!lessonsFile.exists()) {
            try {
                lessonsFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(lessonsFile))) {
                Object obj = in.readObject();
                return (List<Lesson>) obj;
            } catch (EOFException e) {
                e.printStackTrace();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static List<Student> deserializeStudents() {
        File studentsFile = new File(DATA_PATH + "\\students.as");
        if (!studentsFile.exists()) {
            try {
                studentsFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(studentsFile))) {
                Object obj = in.readObject();
                return (List<Student>) obj;
            } catch (EOFException e) {
                e.printStackTrace();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Map<String, User> deserializeUserMap() {
        File userFile = new File(DATA_PATH + "\\users.as");
        if (!userFile.exists()) {
            try {
                userFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(userFile))) {
                Object obj = in.readObject();
                return (Map<String, User>) obj;
            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
