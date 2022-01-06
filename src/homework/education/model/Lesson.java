package homework.education.model;

import java.io.Serializable;
import java.util.Objects;

public class Lesson implements Serializable {
    private String lessonName;
    private double duration;
    private String lecturerName;
    private double price;

    public Lesson() {

    }

    public Lesson(String lessonname, double duration, String lecturerName, double price) {
        this.lessonName = lessonname;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public String getName() {
        return lessonName;
    }

    public void setName(String name) {
        this.lessonName = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Double.compare(lesson.duration, duration) == 0 && Double.compare(lesson.price, price) == 0 && Objects.equals(lessonName, lesson.lessonName) && Objects.equals(lecturerName, lesson.lecturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessonName, duration, lecturerName, price);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + lessonName + '\'' +
                ", duration=" + duration +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                '}';
    }
}
