package practice.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student("Poxos","Poxosyan",18,"077858585","Java");
        System.out.println(student.getName());
        student.setName("Poxosik");
        System.out.println(student.getName());

    }
}
