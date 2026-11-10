package BusinessLogicLayer;


import DataAccessLayer.models.Book;
import DataAccessLayer.repositories.BookRepository;

import java.util.Scanner;

import static DataAccessLayer.repositories.BookRepository.books;

public class BookService {
    Book book = new Book();
    Scanner scn = new Scanner(System.in);
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void addBook() {
        System.out.print("Enter title: ");
        String title = scn.nextLine();
        System.out.println("Enter Author: ");
        String author = scn.nextLine();
        System.out.println("Enter Year: ");
        int year = Integer.parseInt(scn.nextLine());
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
    public void deleteBook() {
        System.out.println("Enter title: ");
        String title = scn.nextLine();
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
    public void showAvailableBooks(){
        for(Book book : BookRepository.availableBooks){
            System.out.println(book.title + " " + book.author + " " + book.year + " " + book.isbn);
        }
    }
    public void searchBook(){
        System.out.println("Enter title: ");
        String title = scn.nextLine();
        if(findBook(title) != null) {
            System.out.println("Book with title: " + title + " has been found");
        }
    }
    public void editBook(){
        System.out.println("Enter title of the book you want to edit: ");
        String title = scn.nextLine();
        System.out.println("Edit title of the book: ");
        String title2 = scn.nextLine();
        System.out.println("Edit author of the book: ");
        String author = scn.nextLine();
        System.out.println("Edit year of the book: ");
        int year = scn.nextInt();
        System.out.println("Edit ISBN of the book: ");
        String isbn = scn.nextLine();
        Book book = new Book();
        book.setBook(title, author, year, isbn);
        if (title != null && title2 != null && author != null && year > 0 && isbn != null) {
            Book b =  findBook(title);
            for(Book b1 : BookRepository.books){
                if(b.isbn.equals(b1.isbn)){
                    int index = books.indexOf(b1);
                    books.set(index,b);
                }
            }
        }
    }
}