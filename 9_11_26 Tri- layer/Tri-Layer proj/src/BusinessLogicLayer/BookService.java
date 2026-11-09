package BusinessLogicLayer;

import DataAccessLayer.*;
import DataAccessLayer.models.Book;
import DataAccessLayer.repositories.BookRepository;

import java.util.Scanner;

import static DataAccessLayer.repositories.BookRepository.books;

public class BookService {
    Book book;
    Scanner scn = new Scanner(System.in);
    Book findBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void addBook() {
        String title = scn.nextLine();
        System.out.println("Enter Author: ");
        String author = scn.nextLine();
        System.out.println("Enter Year: ");
        int year = scn.nextInt();
        System.out.println("Enter ISBN: ");
        String isbn = scn.nextLine();
        if (title != null && author != null && year > 0 && isbn != null) {
            for (Book b : BookRepository.books) {
                if (isbn.equalsIgnoreCase(b.isbn)) {
                    System.out.println("Book can not be added");
                    return;
                }
            }
            book.setBook(title, author, year, isbn);
            BookRepository.addBook(book);
        }
    }
    void deleteBook(String title) {
        BookRepository.removeBook(findBook(title));
        System.out.println("Book with title: " + title + " has been deleted");
    }
    public void showBooks(){
        for(Book book : BookRepository.books){
            System.out.println(book.title + " " + book.author + " " + book.year + " " + book.isbn);
        }
    }
    public boolean isAvailableBook(Book bk){
        for(Book book : BookRepository.availableBooks){
            if(book.isbn.equals(book.isbn)){
                return true;
            }
        }
        return false;
    }
}