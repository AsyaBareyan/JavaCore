package homework.education.storage;


import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class StudentStorage {
    //    private Student[] students = new Student[10];
//    private int size = 0;
    List<Student> students = new LinkedList<>();

    public void add(Student student) {
        students.add(student);
        serialize();
    }

    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }

    }

    public Student getByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                return student;
            }
        }
        return null;
    }

    public void printStudentsByLesson(Lesson lesson) {
        for (Student student : students) {
            for (Lesson lesson1 : student.getLessons()) {
                if (lesson.equals(lesson1)) {
                    System.out.println(student);
                }
            }
        }
    }

    public void deleteStudentByEmail(Student student) {
        students.remove(student);
        serialize();

    }

    public void initData() {
        List<Student> studentList = FileUtil.deserializeStudents();
        if (studentList != null) {
            students = studentList;
        }
    }

    public void serialize() {
        FileUtil.serializeStudents(students);
    }

//    private void deleteByIndex(int index) {
//        for (int i = index + 1; i < size; i++) {
//            students[i - 1] = students[i];
//
//        }
//        size--;

}
