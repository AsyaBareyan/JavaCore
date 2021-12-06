package author;

import author.model.Author;
import author.model.Book;
import author.storage.AuthorStorage;
import author.storage.BookStorage;
import author.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AuthorBookTest implements AuthorBookCommands {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();


    public static void main(String[] args) throws ParseException {
        authorStorage.add(new Author("poxos", "poxosyan", "poxos@mail.ru", 22, "male",DateUtil.stringToDate("11/01/1999")));
        authorStorage.add(new Author("poxosuhi", "poxosyan", "poxosuhi@mail.ru", 23, "female",DateUtil.stringToDate("11/01/1998")));
        authorStorage.add(new Author("petros", "petrosyan", "petros@mail.ru", 24, "male",DateUtil.stringToDate("11/01/1997")));


        boolean isRun = true;

        while (isRun) {
            AuthorBookCommands.printCommands();
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
                    authorStorage.print();
                    break;

                case PRINT_BOOKS:
                    bookStorage.print();
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
                case DELETE_BY_AUTHOR:
                    deleteByAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                default:
                    System.out.println("invalid command!");
            }

        }

    }

    private static void deleteBook() {
        System.out.println("Please choose book by serialId");
        System.out.println("__________");
        bookStorage.print();
        System.out.println("__________");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            bookStorage.deleteBook(book);
        } else {
            System.err.println("book with serialId does not exists");
        }

    }

    private static void deleteByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.deleteByAuthor(author);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void deleteAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            authorStorage.deleteAuthor(author);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void printAuthorsList() {
        System.out.println("Please choose author's email");
        System.out.println("__________");
        authorStorage.print();
        System.out.println("__________");
    }


    private static void changeBookAuthor() {
        System.out.println("Please choose book by serialId");
        System.out.println("__________");
        bookStorage.print();
        System.out.println("__________");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            printAuthorsList();
            String email = scanner.nextLine();
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                book.setAuthor(author);
            } else {
                System.err.println("author does not exists");
            }
        } else {
            System.err.println("book with serialId does not exists");
        }
    }

    private static void changeAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
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
//            Author authors = new Author(name, surname, email, age, gender);
//            au.add(authors);
            System.out.println("Thank you, author's info was changed");
        } else {
            System.out.println("invalid email!Please try again");
//            addAuthor();
        }
    }

    private static void countBooksByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.countBooksByAuthor(author);
        } else {
            System.out.println("Author does not exists");
        }
    }

    private static void searchBooksByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.searchBooksByAuthor(author);
        } else {
            System.out.println("Author doesn't exists");
        }
    }

    private static void searchByTitle() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);

    }

    private static void addBook() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);

        if (author != null) {
            System.out.println("Please input book's serialId");
            String serialId = scanner.nextLine();
            if (bookStorage.getBySerialId(serialId) == null) {
                System.out.println("Please input book's title");
                String title = scanner.nextLine();
                System.out.println("Please input book's description");
                String desc = scanner.nextLine();
                System.out.println("Please input book's price");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Please input book's count");
                int count = Integer.parseInt(scanner.nextLine());
                Book book = new Book(serialId, title, desc, price, count, author);
                bookStorage.add(book);
                System.out.println("Thank you, book was added");
            } else {
                System.err.println("Book with serialId " + serialId + " is exists");
            }
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
        authorStorage.searchByAge(minAge, maxAge);
    }


    private static void searchByName() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() throws ParseException {
        System.out.println("Please input authors name,surname,email,age,gender,dateOfBirth[12/12/2021]");
        String authorDataStr = scanner.nextLine();
        String[] authorData = authorDataStr.split(",");
        if (authorData.length == 6) {
            int age = Integer.parseInt(authorData[3]);
            Date date= DateUtil.stringToDate(authorData[5]);
            Author author = new Author(authorData[0], authorData[1], authorData[2], age, authorData[4],date);

            if (authorStorage.getByEmail(author.getEmail()) != null) {
                System.out.println("Invalid email. Author whit this email already exists");
            } else {
                authorStorage.add(author);
                System.out.println("Thank you, author was added");
            }
        } else {
            System.err.println("invalid data");
        }
    }
}
