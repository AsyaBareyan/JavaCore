package newHomework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {-4, 11, 20, 1, 92, 1000, 8, 30, 5, 14};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }


        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");

            }
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count2++;
            }
        }
        System.out.println(count2);
        double sum = 0;
        double mijTv = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            mijTv = sum / array.length;

        }
        System.out.println(sum);
        System.out.println(mijTv);
        //sortavorum poqric mec

        int[] sort = {5, 88, 99, -4, 100, 1, 44, 1, 92, 7};
        for (int i = 0; i < sort.length - i; i++) {
            for (int j = 1; j < sort.length; j++) {
                if (sort[j - 1] > sort[j]) {
                    int tmp = sort[j - 1];
                    sort[j - 1] = sort[j];
                    sort[j] = tmp;
                }
            }
        }
        for (int j = 0; j < sort.length; j++) {
            System.out.print(sort[j]+" ");
        }
    }}
