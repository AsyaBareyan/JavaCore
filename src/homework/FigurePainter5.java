package homework;

public class FigurePainter5 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                System.out.print(" ");
            }
            for (int k = 4 - i; k < 4; k++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }

            for (int a = 0; a < 3; a++) {
                for (int b = 3 - a; b < 3; b++) {
                    System.out.print(" ");
                }
                for (int c = a + 1; c < 3; c++) {
                    System.out.print(" *");
                }
                System.out.println(" *");

            }

        }
    }

