package homework.author.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String serialId;
    private String title;
    private String description;
    private double price;
    private int count;
    private Author[] authors;
    private String[] tags;


    public Book() {

    }

    public Book(String serialId, String title, String description, double price, int count, Author[] authors) {
        this.serialId = serialId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.authors = authors;
    }

    public Book(String serialId, String title, String description, double price, int count, Author[] authors, String[]tags) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.authors = authors;
        this.serialId = serialId;
        this.tags = tags;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getTitle() {
        return title;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && count == book.count && Objects.equals(serialId, book.serialId) && Objects.equals(title, book.title) && Objects.equals(description, book.description) && Arrays.equals(authors, book.authors) && Arrays.equals(tags, book.tags);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(serialId, title, description, price, count);
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + Arrays.hashCode(tags);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialId='" + serialId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", authors=" + Arrays.toString(authors) +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
