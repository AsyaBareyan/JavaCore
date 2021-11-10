package bracechecker;

public class Stack {
    private char[] array = new char[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(char simvol) {
        if (size == array.length) {
            System.out.println("Stack is full");
        } else {
            array[++size] = simvol;
        }
    }

    public int pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[size--];
        }
    }

public boolean isEmpty(){

    return  (size==-1);

}

}
