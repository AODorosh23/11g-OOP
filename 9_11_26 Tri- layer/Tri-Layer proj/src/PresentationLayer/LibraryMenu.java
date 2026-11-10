package PresentationLayer;

import BusinessLogicLayer.BookService;
import BusinessLogicLayer.LoanService;
import DataAccessLayer.models.Student;

import java.util.Scanner;

public class LibraryMenu {

    static void Menu(){
        System.out.println("===== LIBRARY MANAGMENT SYSTEM =====");
        System.out.println("1. Add Book");
        System.out.println("2. Show all books");
        System.out.println("3. Search book");
        System.out.println("4. Edit book");
        System.out.println("5. Delete book");
        System.out.println("6. Borrow book");
        System.out.println("7. Return book");
        System.out.println("8. Show all available books");
        System.out.println("0. Exit");
        System.out.println("Choose option: ");
        BookService bookService = new BookService();
        LoanService loanService = new LoanService();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1: {
                bookService.addBook();
                Menu();
                break;
            }
            case 2: {
                bookService.showBooks();
                Menu();
                break;
                }
            case 3:{
                bookService.searchBook();
                Menu();
                break;
                }
            case 4:{
                bookService.editBook();
                Menu();
            break;
        }
        case 5:{
            bookService.deleteBook();
            Menu();
            break;
        }
        case 6:{
            loanService.addLoan();
            Menu();
            break;
        }
        case 7:{
            loanService.removeLoan();
            Menu();
            break;
        }
        case 8:{
            bookService.showAvailableBooks();
            Menu();
            break;
        }
        case 0:{
            System.out.println("Goodbye!");
            return;
        }
        default:{
            System.out.println("Invalid choice.");
            Menu();
            break;
        }
        }
    }
}
