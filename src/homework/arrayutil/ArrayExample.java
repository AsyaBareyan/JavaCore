package homework.arrayutil;

public class ArrayExample {
    public static void main(String[] args) {
//        int[] array = {1, 55, -8, 66, 7, 92, 14, 11, 1, 6, 1};
//        boolean found = true;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                found = false;
//                break;
//            }
//
//        }
//        System.out.println(found);
//    }
//}


//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j <array.length ; j++) {
//            if (array[i]==array[j]){
//                System.out.println(array[i] + "-ը կրկնվում է");
//                break;
//            }
//
//        }
//    }


//    public static void main(String[] args) {
//        int[] array = {5, 88, 99, -4, 100, 1, 44, 1, 92, 7};
//            for (int i = 0; i < array.length-i; i++)
//                for (int j = 1; j < array.length; j++) {
//                    if (array[j-1] > array[j]) {
//                        int tmp = array[j-1];
//                        array[j-1] = array[j];
//                        array[j] = tmp;
//                    }
//                }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//
//        }


//       int n = 44;
//        int x=-1;
//        int a = array.length;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == n) {
//                x = i;
//                System.out.println(x);
//            }  {
//
//            }
//        }

        int[] array = {1, 55, -8, 66, 7, 92, 14, 11, 1, 6, 1};
        for (int i = array.length-1; i > array.length/2 ; i--) {
            for (int j = array[0]; j < array.length/2; j++) {
                int tmp=array[j];
                array[j-1]=array[j];
                array[j]=tmp;

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

        }

    }}