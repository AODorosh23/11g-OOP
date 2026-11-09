package DataAccessLayer.models;

public class Book {
    public String title;
    public String author;
    public int year;
    public String isbn;
    public void setBook(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    int getYear() {
        return year;
    }
    String getIsbn() {
        return isbn;
    }
}
