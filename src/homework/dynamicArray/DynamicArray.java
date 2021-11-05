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
            array[size++] = value;
        } else array[size++] = value;

    }

    //1.stexcel hin masivic 10 element aveli mec masiv
    //2.qcel hin masivi elementnery nori mej
    //3.hin masivi hxumy kapel nor masivi hxman het
    private void extend() {
        int[] result = new int[array.length + 10];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            result[a++] = array[i];
        }
        array = result;
    }


    //ete trvac indexy mer unecac masivi indexi sahmannerum e, veradarcnel masivi index-erord elementy,
    // hakarak depqum verad -1
    public int getByIndexx(int index) {
        if (index <= array.length) {
            return array[index];
        } else return -1;
    }

    //tpel masivi avelacvac elementnery
    public void print() {

        int n = array.length - size;
        for (int i = 0; i < array.length - n; i++) {

            System.out.println(array[i]);
        }
    }
}