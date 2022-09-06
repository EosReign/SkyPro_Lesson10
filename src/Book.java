import java.util.Objects;

public class Book {
    private Author author;
    private int publicationYear;
    private String bookName;
    public Book(String bookName, Author author, int publicationYear) {
        this.author = author;
        this.publicationYear = publicationYear;
        this.bookName = bookName;

    }
    public String getAuthor() {
        return this.author.toString();
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publicationYear);
    }
    @Override
    public String toString() {
        return bookName + " " + author.toString() + " " + publicationYear;
    }
}
