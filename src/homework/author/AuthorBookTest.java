package homework.author;

import homework.author.exception.BookNotFoundException;
import homework.author.model.Author;
import homework.author.model.Book;
import homework.author.storage.AuthorStorage;
import homework.author.storage.BookStorage;
import homework.author.storage.UserStorage;
import homework.author.util.DateUtil;
import homework.education.UserCommand;
import homework.education.model.User;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AuthorBookTest implements AuthorBookCommands {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();
    static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) throws ParseException {
        initData();
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case UserCommand.EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("invalid command");
                    break;
            }
        }
    }

    private static void adminLogin() {
        boolean isRun = true;

        while (isRun) {
            AuthorBookCommands.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.exit(0);
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
                case ADD_TAG_TO_BOOK:
                    addTagToBook();
                    break;
                case REMOVE_TAGS_FROM_BOOK:
                    removeTagsToBook();
                    break;
                case LOGOUT:
                    isRun = false;
                    break;
                default:
                    System.out.println("invalid command!");
            }
        }
    }

    private static void login() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        User byEmail = userStorage.getByEmail(email);
        if (byEmail != null) {
            System.out.println("Please input password");
            String password = scanner.nextLine();
            if (byEmail.getPassword().equals(password)) {
                if (byEmail.getType().equalsIgnoreCase("ADMIN")) {
                    adminLogin();
                } else if (byEmail.getType().equalsIgnoreCase("USER")) {
                    userLogin();
                }
            } else {
                System.err.println("password is wrong");
            }
        } else {
            System.err.println("user with " + email + " does not exists");
        }
    }


    private static void userLogin() {
        boolean isRun = true;

        while (isRun) {
            AuthorBookCommands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.exit(0);
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
                case LOGOUT:
                    isRun = false;
                    break;
                default:
                    System.out.println("invalid command!");
            }
        }
    }

    private static void register() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        User byEmail = userStorage.getByEmail(email);
        if (byEmail == null) {
            System.out.println("Please input name");
            String name = scanner.nextLine();
            System.out.println("Please input surname");
            String surname = scanner.nextLine();

            System.out.println("Please input password");
            String password = scanner.nextLine();
            System.out.println("Please input type(ADMIN,USER)");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("ADMIN") || type.equalsIgnoreCase("USER")) {
                User user = new User();
                user.setEmail(email);
                user.setName(name);
                user.setSurname(surname);
                user.setPassword(password);
                user.setType(type);
                userStorage.add(user);
                System.out.println("user was registered");
            } else {
                System.err.println("invalid type");
            }
        } else {
            System.err.println("user with " + email + " already exists");

        }


    }

    private static void removeTagsToBook() {
        System.out.println("Please choose book by serialId");
        System.out.println("__________");
        bookStorage.print();
        System.out.println("__________");
        String serialId = scanner.nextLine();
        try {
            Book book = bookStorage.getBySerialId(serialId);
            System.out.println("Please input tags separate ,");
            String tagsStr = scanner.nextLine();
            String[] tagsToRemove = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                System.err.println("Book does not have any tags to remove");
            } else {
                for (String tag : tagsToRemove) {
                    boolean isExists = false;
                    for (String bookTag : bookTags) {
                        if (bookTag.equals(tag)) {
                            isExists = true;
                            break;
                        }
                    }
                    if (!isExists) {
                        System.err.println(tag + " does not exists on book: " + book);
                        return;
                    }

                }
                String[] newTags = new String[bookTags.length - tagsToRemove.length];
                int index = 0;
                for (String bookTag : bookTags) {
                    boolean isExists = false;
                    for (String toRemove : tagsToRemove) {
                        if (bookTag.equals(toRemove)) {
                            isExists = true;
                            break;
                        }

                    }
                    if (!isExists) {
                        newTags[index++] = bookTag;
                    }
                }
                book.setTags(newTags);
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    private static void addTagToBook() {
        System.out.println("Please choose book by serialId");
        System.out.println("__________");
        bookStorage.print();
        System.out.println("__________");
        String serialId = scanner.nextLine();
        Book book = null;
        try {
            book = bookStorage.getBySerialId(serialId);
            System.out.println("Please input tags separate ,");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                book.setTags(tags);
                System.out.println("Tags were added");
            } else {
                for (String tag : tags) {
                    for (String bookTag : bookTags) {
                        if (tag.equals(bookTag)) {
                            System.err.println(tag + " is duplicate.Please input new Tags");
                            return;
                        }
                    }

                }
                String[] newTags = new String[bookTags.length + tags.length];
                System.arraycopy(bookTags, 0, newTags, 0, bookTags.length);
                System.arraycopy(tags, 0, newTags, bookTags.length, tags.length);
                book.setTags(newTags);
                System.out.println("Tags were added");
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void initData() {
        try {
            Author author = new Author("poxos", "poxosyan", "poxos@mail.ru", 22, "male", DateUtil.stringToDate("11/01/1999"));
            Author author1 = new Author("poxosuhi", "poxosyan", "poxosuhi@mail.ru", 23, "female", DateUtil.stringToDate("11/01/1998"));
            Author author2 = new Author("petros", "petrosyan", "petros@mail.ru", 24, "male", DateUtil.stringToDate("11/01/1997"));
            authorStorage.add(author);
            authorStorage.add(author1);
            authorStorage.add(author2);
            Author[] authors = {author1, author2};
            String[] tags = {"new", "popular", "detektiv", "lav girq"};
            bookStorage.add(new Book("A5555", "girq1", "desc", 20, 2, authors, tags));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static void deleteBook() {
        System.out.println("Please choose book by serialId");
        System.out.println("__________");
        bookStorage.print();
        System.out.println("__________");
        String serialId = scanner.nextLine();
        Book book = null;
        try {
            book = bookStorage.getBySerialId(serialId);
            bookStorage.deleteBook(book);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
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
        System.out.println("Please choose homework.author's email separate , ");
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
        Book book = null;
        try {
            book = bookStorage.getBySerialId(serialId);
            printAuthorsList();
            String emails = scanner.nextLine();
            String[] emailArray = emails.split(",");
            if (emailArray.length == 0) {
                System.out.println("Please choose homework.author's");
                return;
            }
            Author[] authors = new Author[emailArray.length];
            int index = 0;
            for (String email : emailArray) {
                Author author = authorStorage.getByEmail(email);
                if (author != null) {
                    authors[index++] = author;
                } else {
                    System.err.println("Please input correct homework.author's email");
                    return;
                }
                book.setAuthors(authors);
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void changeAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("Please input homework.author's change name");
            String name = scanner.nextLine();
            author.setName(name);
            System.out.println("Please input homework.author's change surname");
            String surname = scanner.nextLine();
            author.setSurname(surname);
            System.out.println("Please input homework.author's change age");
            int age = Integer.parseInt(scanner.nextLine());
            author.setAge(age);
            System.out.println("Please input homework.author's gender");
            String gender = scanner.nextLine();
            author.setGender(gender);
//            Author authors = new Author(name, surname, email, age, gender);
//            au.add(authors);
            System.out.println("Thank you, homework.author's info was changed");
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
        String emails = scanner.nextLine();
        String[] emailArray = emails.split(",");
        if (emailArray.length == 0) {
            System.out.println("Please choose homework.author's");
            return;
        }
        Author[] authors = new Author[emailArray.length];
        int index = 0;
        for (String email : emailArray) {
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                authors[index++] = author;
            } else {
                System.err.println("Please input correct homework.author's email");
                return;
            }
            System.out.println("Please input book's serialId");
            String serialId = scanner.nextLine();
            try {
                bookStorage.getBySerialId(serialId);
                System.err.println("book is duplicate");
            } catch (BookNotFoundException e) {
                System.out.println("Please input book's title");
                String title = scanner.nextLine();
                System.out.println("Please input book's description");
                String desc = scanner.nextLine();
                System.out.println("Please input book's price");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Please input book's count");
                int count = Integer.parseInt(scanner.nextLine());

                System.out.println("Please input book's tags");
                String tagsStr = scanner.nextLine();
                String[] tags = tagsStr.split(",");

                Book book = new Book(serialId, title, desc, price, count, authors, tags);
                bookStorage.add(book);
                System.out.println("Thank you, book was added");
            }
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

    private static void addAuthor() {
        System.out.println("Please input authors name,surname,email,age,gender,dateOfBirth[12/12/2021]");
        String authorDataStr = scanner.nextLine();
        String[] authorData = authorDataStr.split(",");
        if (authorData.length == 6) {
            int age = Integer.parseInt(authorData[3]);
            Date date = null;
            try {
                date = DateUtil.stringToDate(authorData[5]);
            } catch (ParseException e) {
                System.out.println("invalid date format");
                return;
            }
            Author author = new Author(authorData[0], authorData[1], authorData[2], age, authorData[4], date);

            if (authorStorage.getByEmail(author.getEmail()) != null) {
                System.out.println("Invalid email. Author whit this email already exists");
            } else {
                authorStorage.add(author);
                System.out.println("Thank you, homework.author was added");
            }
        } else {
            System.err.println("invalid data");
        }
    }
}
