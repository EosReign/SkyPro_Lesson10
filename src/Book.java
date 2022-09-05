public class Book {
    private Author author;
    private int publicationYear;
    private String bookName;
    public Book(String bookName, Author author, int publicationYear) {
        this.author = author;
        this.publicationYear = publicationYear;
        this.bookName = bookName;

    }
    public Author getAuthor() {
        return this.author;
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
}
