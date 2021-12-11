package homework.author;

public interface AuthorBookCommands {
    String EXIT = "0";
    String ADD_AUTHOR = "1";
    String ADD_BOOK = "2";
    String SEARCH_AUTHORS = "3";
    String SEARCH_AUTHORS_BY_AGE = "4";
    String SEARCH_BOOKS_BY_TITLE = "5";
    String PRINT_AUTHORS = "6";
    String PRINT_BOOKS = "7";
    String SEARCH_BOOKS_BY_AUTHOR = "8";
    String COUNT_BOOKS_BY_AUTHOR = "9";
    String CHANGE_AUTHOR = "10";
    String CHANGE_BOOK_AUTHOR = "11";
    String DELETE_BY_AUTHOR = "12";
    String DELETE_AUTHOR = "13";
    String DELETE_BOOK = "14";
    String ADD_TAG_TO_BOOK = "15";
    String REMOVE_TAGS_FROM_BOOK = "16";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for add homework.author");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + SEARCH_AUTHORS + " for search homework.author by name");
        System.out.println("Please input " + SEARCH_AUTHORS_BY_AGE + " for search homework.author by age");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("Please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("Please input " + PRINT_BOOKS + " for print books");
        System.out.println("Please input " + SEARCH_BOOKS_BY_AUTHOR + " for print books by homework.author");
        System.out.println("Please input " + COUNT_BOOKS_BY_AUTHOR + " for print count of books by homework.author");
        System.out.println("Please input " + CHANGE_AUTHOR + " for changing about homework.author's info");
        System.out.println("Please input " + CHANGE_BOOK_AUTHOR + " for changing book's homework.author");
        System.out.println("Please input " + DELETE_BY_AUTHOR + " for delete homework.author's book");
        System.out.println("Please input " + DELETE_AUTHOR + " for delete homework.author");
        System.out.println("Please input " + DELETE_BOOK + " for delete book");
        System.out.println("Please input " + ADD_TAG_TO_BOOK + " for add tag to book");
        System.out.println("Please input " + REMOVE_TAGS_FROM_BOOK + " for remove tags from book");
    }
}
