package author;

public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;

    }

    private void extend() {
        Author[] result = new Author[array.length + 10];

        for (int i = 0; i < size; i++) {
            result[i] = array[i];

        }
        array = result;
    }

    public Author getByIndex(int index) {
        if (index > 0 && index < size) {
            return array[index];
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }

    }
}
