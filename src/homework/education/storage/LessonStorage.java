package homework.education.storage;

import homework.education.model.Lesson;

import java.util.LinkedList;

public class LessonStorage {
    //    public Lesson[] lessons = new Lesson[10];
    public LinkedList<Lesson> lessons = new LinkedList<>();
//    private int size = 0;

    public void add(Lesson lesson) {
        lessons.add(lesson);
//        if (size == lessons.length) {
//            extend();
//        }
//        lessons[size++] = lesson;

    }

//    private void extend() {
//        Lesson[] result = new Lesson[lessons.length + 10];
//        System.arraycopy(lessons, 0, result, 0, size);
//        lessons = result;
//
//    }

    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);

        }

    }


    public Lesson getByName(String name) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(name)) {
                return lesson;
            }
//        for (int i = 0; i < size; i++) {
//            if (lessons[i].getName().equals(name)) {
//                return lessons[i];
        }

        return null;
    }

    public void deleteByName(String lessonName) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(lessonName)) {
                lessons.remove(lesson);

            }
//        for (int i = 0; i < size; i++) {
//            if (lessons[i].equals(lesson)) {
//                deleteByIndex(i);
//                break;
        }

    }


//    private void deleteByIndex(int index) {
//        for (int i = index + 1; i < size; i++) {
//            lessons[i - 1] = lessons[i];
//
//        }
//        size--;
}
