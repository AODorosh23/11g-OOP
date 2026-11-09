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
    public void logStudent(String name,String surname, int age){
        Student student = new Student();
        student.setStudent(name,surname,age);
        students.add(student);
    }
    void addLoan() {
        String title = scn.nextLine();
        if(loanedBooks <= 3&& bookService.isAvailableBook(loan.book) == true) {
            availableBooks.remove(loan.book);
            LoanRepository.addLoan(loan);
        }else{
            System.out.println("Can not loan any more books, please return some of your loaned books and try again");
        }
    }
    void removeLoan(Loan loan) {
        availableBooks.add(loan.book);
        LoanRepository.removeLoan(loan);
    }

}
