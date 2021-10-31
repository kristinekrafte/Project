import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private LocalDate publishingYear;
    private int pager;
    private String publisher;
    private String description;
    private String isbn;

    public Book(String name, String author, LocalDate publishingYear, int pager, String publisher, String description, String isbn) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.pager = pager;
        this.publisher = publisher;
        this.description = description;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPager() {
        return pager;
    }

    public void setPager(int pager) {
        this.pager = pager;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
