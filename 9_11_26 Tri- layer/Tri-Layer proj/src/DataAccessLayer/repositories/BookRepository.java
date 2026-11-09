package DataAccessLayer.repositories;

import java.util.ArrayList;
import DataAccessLayer.models.*;

public class BookRepository {
    public static ArrayList<Book> books = new ArrayList<Book>();
    public static ArrayList<Book> availableBooks = new ArrayList<Book>();
    public static void addBook(Book book) {
        books.add(book);
        availableBooks.add(book);
    }
    public static void removeBook(Book book) {
        books.remove(book);
        availableBooks.remove(book);
    }
    public static void showBooks() {
        for (Book book : books) {
            System.out.println(book.author + " " + book.title + " " + book.year + " " + book.isbn);
        }
    }
}
