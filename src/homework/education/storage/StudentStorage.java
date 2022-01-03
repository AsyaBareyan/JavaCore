package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.model.Student;

import java.util.LinkedList;

public class StudentStorage {
    //    private Student[] students = new Student[10];
//    private int size = 0;
    LinkedList<Student> studentLinkedList = new LinkedList<>();

    public void add(Student student) {
        studentLinkedList.add(student);
    }

    public void print() {
        for (Student student : studentLinkedList) {
            System.out.println(student);
        }

    }

    public Student getByEmail(String email) {
        for (Student student : studentLinkedList) {
            if (student.getEmail().equals(email)) {
                return student;
            }
        }
        return null;
    }

    public void printStudentsByLesson(Lesson lesson) {
        for (Student student : studentLinkedList) {
            for (Lesson lesson1 : student.getLessons()) {
                if (lesson.equals(lesson1)) {
                    System.out.println(student);
                }
            }
        }
    }

    public void deleteStudentByEmail(Student student) {
        for (Student student1 : studentLinkedList) {
            if (student1.equals(student)) {
                studentLinkedList.remove();
            }

        }

    }

//    private void deleteByIndex(int index) {
//        for (int i = index + 1; i < size; i++) {
//            students[i - 1] = students[i];
//
//        }
//        size--;

}
