package savelizem.model;

import java.util.Arrays;
import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private Author[] authors = new Author[10];
    private int publishedYear;

    public Book() {
        this.id = UUID.randomUUID();
    }

    public Book(String title, Author[] authors, int publishedYear) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.authors = authors;
        this.publishedYear = publishedYear;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return publishedYear == book.publishedYear && id.equals(book.id) && title.equals(book.title) && Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + publishedYear;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
