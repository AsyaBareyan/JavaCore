package newHomework;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        } array[size++] = value;

    }
    //public void add()

    private void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];

        }
        array = result;
    }

    public int getByIndex(int index) {
        if (index > 0 && index < size) {
            return array[index];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");

        }
        System.out.println();

    }
    public void delete(int index){
        if (index > 0 && index < size){
            for (int i = index+1; i <size; i++) {
                array[i-1]=array[i];
            }size--;

        }
    }
}

