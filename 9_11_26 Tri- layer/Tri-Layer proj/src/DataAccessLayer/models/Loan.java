package DataAccessLayer.models;

public class Loan {
    public Book book;
    public Student student;

    void setLaon(Book book,Student student) {
        this.book = book;
        this.student = student;
    }
}
