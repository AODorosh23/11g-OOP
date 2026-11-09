package DataAccessLayer.repositories;

import DataAccessLayer.models.Loan;
import DataAccessLayer.models.Student;

import java.util.ArrayList;

public class LoanRepository {
    public static ArrayList<Loan> loans = new ArrayList<>();

    public static void addLoan(Loan loan) {
        loans.add(loan);
    }
    public static void removeLoan(Loan loan) {
        loans.remove(loan);
    }
}
