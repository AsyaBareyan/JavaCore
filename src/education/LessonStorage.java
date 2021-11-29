package education;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;

    }

    private void extend() {
        Lesson[] result = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, result, 0, size);
        lessons = result;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i] + " ");

        }

    }

    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                return lessons[i];
            }

        }
        return null;
    }

    public void deleteByName(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].equals(lesson)) {
                deleteByIndex(i);
                break;
            }

        }
    }

    private void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            lessons[i - 1] = lessons[i];

        }
        size--;
    }
}
