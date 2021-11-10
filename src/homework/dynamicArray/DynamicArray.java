package homework.dynamicArray;

public class DynamicArray {
    //sa himnakan masivn e,vortex pahelu enq avelacvox elementnery
    private int[] array = new int[10];
    //sa masivi mej avelacvac elementneri qanakn e
    private int size = 0;

    //stugel ete masivi mej tex chka, kanchel extend()
    public void add(int value) {

        if (size >= array.length) {
            extend();
        }
        array[size++] = value;

    }

    public void add(int[] numbers) {
//        for (int i = 0; i < array.length; i++) {
//            add(numbers[i]);
        for (int number : numbers) {
            add(number);

        }

    }

    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index: ");
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
            System.out.println("invalid index: " + index);
        } else
            array[index] = value;

    }


    private void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        array = result;
    }


    //ete trvac indexy mer unecac masivi indexi sahmannerum e, veradarcnel masivi index-erord elementy,
    // hakarak depqum verad -1
    public int getByIndexx(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index:" + index);
            return -1;
        }
        return array[index];
    }

    //tpel masivi avelacvac elementnery
    public void print() {

        //  int n = array.length - size;
        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void delete(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index: " + index);
        } else {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];

                size--;
            }


        }
    }

    public boolean isExists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }

        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else return false;
    }
}


