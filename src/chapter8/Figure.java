package chapter8;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Ploshad' figuri ne opredelena.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a,double b){
        super(a, b);
    }

    double area(){
        System.out.println("V oblasti 4ugolnika.");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a,double b){
        super(a, b);
    }
    double area(){
        System.out.println("v oblasti 3ugolnika.");
        return dim1*dim2/2;
    }
}