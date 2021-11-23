package author;

import java.util.Scanner;

public class AuthorTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage au = new AuthorStorage();
    static BookStorage bk = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";


    public static void main(String[] args) {
        au.add(new Author("poxos", "poxosyan", "poxos@mail.ru", 22, "male"));
        au.add(new Author("poxosuhi", "poxosyan", "poxosuhi@mail.ru", 23, "female"));
        au.add(new Author("petros", "petrosyan", "petros@mail.ru", 24, "male"));


        boolean isRun = true;

        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;

                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchByTitle();
                    break;
                case PRINT_AUTHORS:
                    au.print();
                    break;

                case PRINT_BOOKS:
                    bk.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                default:
                    System.out.println("invalid command!");
            }

        }

    }

    private static void changeBookAuthor() {
        System.out.println("Please input book's title");
        String title = scanner.nextLine();
        Book book = new Book();
      Book bookTitle=bk.getByTitle(title);
        if (bookTitle != null) {
            System.out.println("Please input author's email for change");
            String email = scanner.nextLine();
            Author author = au.getByEmail(email);
            if (author != null) {
                book.setAuthor(author);
            } else {
                System.out.println("invalid email!Please try again");
                addAuthor();
            }

        }else System.out.println("not found book's title, please add book");
        addBook();

    }

    private static void changeAuthor() {
        System.out.println("Please choose author's email");
        System.out.println("__________");
        au.print();
        System.out.println("__________");
        String email = scanner.nextLine();
        Author author = au.getByEmail(email);
        if (author != null) {
            System.out.println("Please input author's change name");
            String name = scanner.nextLine();
            author.setName(name);
            System.out.println("Please input author's change surname");
            String surname = scanner.nextLine();
            author.setSurname(surname);
            System.out.println("Please input author's change age");
            int age = Integer.parseInt(scanner.nextLine());
            author.setAge(age);
            System.out.println("Please input author's gender");
            String gender = scanner.nextLine();
            author.setGender(gender);
            Author authors = new Author(name, surname, email, age, gender);
            au.add(authors);
            System.out.println("Thank you, author's info was changed");
        } else {
            System.out.println("invalid email!Please try again");
            addAuthor();
        }
    }

    private static void countBooksByAuthor() {
        System.out.println("Please choose author's email");
        System.out.println("__________");
        au.print();
        System.out.println("__________");
        String email = scanner.nextLine();
        bk.countBooksByAuthor(email);
    }

    private static void searchBooksByAuthor() {
        System.out.println("Please choose author's email");
        System.out.println("__________");
        au.print();
        System.out.println("__________");
        String email = scanner.nextLine();
        bk.searchBooksByAuthor(email);
    }

    private static void searchByTitle() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        bk.searchByTitle(keyword);

    }

    private static void addBook() {
        System.out.println("Please choose author's email");
        System.out.println("__________");
        au.print();
        System.out.println("__________");
        String email = scanner.nextLine();
        Author author = au.getByEmail(email);

        if (author != null) {
            System.out.println("Please input book's title");
            String title = scanner.nextLine();
            System.out.println("Please input book's description");
            String desc = scanner.nextLine();
            System.out.println("Please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, author);
            bk.add(book);
            System.out.println("Thank you, book was added");
        } else {
            System.out.println("invalid email!Please try again");
            addBook();
        }
    }

    private static void searchByAge() {
        System.out.println("Please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        au.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for add author");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("Please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("Please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("Please input " + PRINT_BOOKS + " for print books");
        System.out.println("Please input " + SEARCH_BOOKS_BY_AUTHOR + " for print books by author");
        System.out.println("Please input " + COUNT_BOOKS_BY_AUTHOR + " for print count of books by author");
        System.out.println("Please input " + CHANGE_AUTHOR + " for changing about author's info");
        System.out.println("Please input " + CHANGE_BOOK_AUTHOR + " for changing book's author");

    }

    private static void searchByName() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        au.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("Please input authors name");
        String name = scanner.nextLine();
        System.out.println("Please input authors surname");
        String surname = scanner.nextLine();
        System.out.println("Please input authors email");
        String email = scanner.nextLine();
        System.out.println("Please input authors age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input authors gender");
        String gender = scanner.nextLine();
        Author author = new Author(name, surname, email, age, gender);

        if (au.getByEmail(author.getEmail()) != null) {
            System.out.println("Invalid email. Author whit this email already exists");
        } else {
            au.add(author);
            System.out.println("Thank you, author was added");
        }
    }
}
