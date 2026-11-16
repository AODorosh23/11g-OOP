package BusinessLogicLayer;

import DataAccessLayer.models.Book;
import DataAccessLayer.models.Loan;
import DataAccessLayer.models.Student;
import DataAccessLayer.repositories.LoanRepository;

import java.util.Scanner;

import static DataAccessLayer.repositories.BookRepository.availableBooks;
import static DataAccessLayer.repositories.LoanRepository.loans;
import static DataAccessLayer.repositories.StudentRepository.students;

public class LoanService {
    private static final int MAX_LOANS_PER_STUDENT = 3;
    private static final Scanner scn = new Scanner(System.in);
    private final BookService bookService = new BookService();

    private static Student findStudent(String name, String surname) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name) && s.getSurname().equalsIgnoreCase(surname)) {
                return s;
            }
        }
        return null;
    }

    public static Student logStudent() {
        System.out.println("Name:");
        String name = scn.nextLine();
        System.out.println("Last name:");
        String surname = scn.nextLine();
        Student existing = findStudent(name, surname);
        if (existing != null) {
            return existing;
        }

        int age = Integer.parseInt(scn.nextLine());
        if(age <0 || age > 130){
            System.out.println("Invalid age");
            return null;
        }
        Student student = new Student();
        student.setStudent(name, surname, age);
        students.add(student);
        return student;
    }

    public void addLoan() {
        System.out.println("Enter Book name:");
        String title = scn.nextLine();

        Book book = bookService.findBook(title);
        if (book == null) {
            System.out.println("Book with title: " + title + " not found, please try again");
            return;
        }else if (!bookService.isAvailableBook(book)) {
            System.out.println("Book with title: " + title + " is already loaned out");
            return;
        }
        Student student = logStudent();
        if (student.loanedBooks >= MAX_LOANS_PER_STUDENT) {
            System.out.println("Can not loan any more books, please return some of your loaned books and try again");
            return;
        }

        Loan loan = new Loan();
        loan.book = book;
        loan.student = student;
        availableBooks.remove(book);
        student.loanBook(book);
        LoanRepository.addLoan(loan);
        System.out.println("Book with title: " + title + " has been loaned");
    }

    public void removeLoan() {
        System.out.println("Enter the name of the loaned book");
        String title = scn.nextLine();
        System.out.println("Name:");
        String name = scn.nextLine();
        System.out.println("Last name:");
        String surname = scn.nextLine();
        Student student = findStudent(name, surname);
        if (student == null) {
            System.out.println("Student " + name + " " + surname + " not found");
            return;
        }
        Loan found = null;
        for (Loan loan : loans) {
            if (loan.student == student && loan.book != null && loan.book.title.equals(title)) {
                found = loan;
                break;
            }
        }
        if (found == null) {
            System.out.println("No loan of " + title + " found for " + name + " " + surname);
            return;
        }
        LoanRepository.removeLoan(found);
        availableBooks.add(found.book);
        student.returnBook(found.book);
        System.out.println("Book with title: " + title + " has been returned");
    }
}
