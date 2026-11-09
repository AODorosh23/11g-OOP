package PresentationLayer;

import BusinessLogicLayer.BookService;
import DataAccessLayer.models.Student;

import java.util.Scanner;

public class LibraryMenu {

    static void Login(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Welcome to Library Menu, please enter your information to log in");
        System.out.println("Name:");
        String name = scn.nextLine();
        System.out.println("Last name:");
        String lastName = scn.nextLine();
        System.out.println("Age:");
        int age = scn.nextInt();

    }
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

                Menu();
                break;
                }
            case 4:{
                Menu();
            break;
        }
        case 5:{
            Menu();
            break;
        }
        case 6:{
            Menu();
            break;
        }
        case 7:{
            Menu();
            break;
        }
        case 8:{
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
