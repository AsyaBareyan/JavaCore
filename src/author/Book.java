package author;

import java.util.Objects;

public class Book {
    private String serialId;
    private String title;
    private String description;
    private double price;
    private int count;
    private Author author;


    public Book() {

    }

    public Book(String serialId, String title, String description, double price, int count, Author author) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.author = author;
        this.serialId = serialId;
    }

    public String getTitle() {
        return title;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && count == book.count && Objects.equals(serialId, book.serialId) && Objects.equals(title, book.title) && Objects.equals(description, book.description) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialId, title, description, price, count, author);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialId='" + serialId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", author=" + author +
                '}';
    }
}
