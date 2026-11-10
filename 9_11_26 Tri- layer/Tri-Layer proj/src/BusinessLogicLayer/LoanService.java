package BusinessLogicLayer;

import DataAccessLayer.models.Loan;
import DataAccessLayer.models.Student;
import DataAccessLayer.repositories.LoanRepository;

import java.util.Scanner;

import static DataAccessLayer.repositories.BookRepository.availableBooks;
import static DataAccessLayer.repositories.LoanRepository.*;
import static DataAccessLayer.repositories.StudentRepository.students;
public class LoanService {
    BookService bookService = new BookService();
    LoanRepository loanRepository = new LoanRepository();
    Scanner scn = new Scanner(System.in);
    public static Student logStudent(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Name:");
        String name = scn.nextLine();
        System.out.println("Last name:");
        String surname = scn.nextLine();
        System.out.println("Age:");
        int age = scn.nextInt();
        scn.close();
        Student student = new Student();
        student.setStudent(name,surname,age);
        students.add(student);
        return student;
    }
    public void addLoan() {
        String title = scn.nextLine();
        Loan loan = new Loan();
        loan.student = logStudent();
        if(loan.student.loanedBooks <= 3&& bookService.isAvailableBook(loan.book) == true) {
            availableBooks.remove(loan.book);
            loan.student.loanBook(loan.book);
            LoanRepository.addLoan(loan);
        }else{
            System.out.println("Can not loan any more books, please return some of your loaned books and try again");
        }
    }
    public void removeLoan() {
        System.out.println("Enter the name of the loaned book");
        String name = scn.nextLine();
        Loan loan = new Loan();
        loan.student = logStudent();
        loan.book = bookService.findBook(name);
        availableBooks.add(loan.book);
        loan.student.returnBook(loan.book);
        LoanRepository.removeLoan(loan);
    }

}
