package homework;

public class FigurePainter4 {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int k = i + 1; k < 4; k++) {
                System.out.print("*");
            }
            System.out.println("*");

        }

    }
}


