package homework.figurePainter;

public class FigurePainter {
    void figureOne(int n, char a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a + " ");

            }
            System.out.println(" ");

        }
    }

    void figureTwo(int n, char b) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    void figureThree(int l,char c){
        for (int i = 0; i < l; i++) {
            for (int j = i - 1; j < l-1; j++) {
                System.out.print(c+" ");
            }

            System.out.println(" ");
        }

        System.out.println();
    }
    void figureFour(int k,char d){
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = k; j > i; j--) {
                System.out.print(d+" ");
            }
            System.out.println();

        }

        System.out.println();
    }
    void figureFive(int m,char e){
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                System.out.print(" ");
            }
            for (int k = m - i; k < m; k++) {
                System.out.print(e+" ");
            }
            System.out.println(e);
        }

        for (int a = 0; a < m-1; a++) {
            for (int b = m-1 - a; b < m-1; b++) {
                System.out.print(" ");
            }
            for (int c = a + 1; c < m-1; c++) {
                System.out.print(" "+e);
            }
            System.out.println(" "+e);

        }
    }
}
