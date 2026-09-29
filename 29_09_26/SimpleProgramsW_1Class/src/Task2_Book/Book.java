package Task2_Book;

public class Book {

    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }



    void showInfo() {
        String nl =System.getProperty("line.separator");
        System.out.println("Title: " + title + nl + "Author: " + author + nl + "Year: " + year);
    }



    public static void main(String[] args) {

        Book book1 = new Book(
                "Harry Potter",
                "J. K. Rowling",
                1997
        );

        Book book2 = new Book(
                "The Hobbit",
                "J. R. R. Tolkien",
                1937
        );

        book1.showInfo();

        System.out.println();

        book2.showInfo();
    }
}