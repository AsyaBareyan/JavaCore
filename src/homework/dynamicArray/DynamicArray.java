package homework.dynamicArray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {

        if (size >= array.length) {
            extend();
        }
        array[size++] = value;

    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);

        }
    }

    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index:" + index);
        } else {
            if (array.length == size) {
                extend();
            }
            for (int i = size; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }
    }

    public void set(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index:" + index);
        } else {
            array[index] = value;
        }
    }

    private void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    public int getByIndexx(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index:" + index);
            return -1;
        }
        return array[index];
    }


    public void print() {

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void delete(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index:" + index);
        } else {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];

            }
            size--;
        }
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isExists(int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }

        }
        return false;
    }
}


