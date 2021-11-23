package author;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;

    }

    private void extend() {
        Book[] result = new Book[books.length + 10];

        System.arraycopy(books, 0, result, 0, size);
        books = result;
    }

    public Book getByIndex(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        return books[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i] + " ");

        }

    }

    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBooksByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                System.out.println(books[i]);
                ;
            }
        }
    }

    public void countBooksByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                count++;
            }

        }
        System.out.println(count);
    }

    public void changeBookAuthor(String email) {

    }

    public Book getByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println(books[i]);
            }
        }
        return null;
    }
}