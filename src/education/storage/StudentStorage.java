package education.storage;

import education.model.Lesson;
import education.model.Student;

public class StudentStorage {
    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] result = new Student[students.length + 10];
        System.arraycopy(students, 0, result, 0, size);
        students = result;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i] + " ");

        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void printStudentsByLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            for (Lesson lesson1 : students[i].getLessons()) {
                if (lesson.equals(lesson1)) {
                    System.out.println(students[i]);
                }
            }
        }
    }

    public void deleteStudentByEmail(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                deleteByIndex(i);
            }

        }

    }

    private void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            students[i - 1] = students[i];

        }
        size--;
    }
}
