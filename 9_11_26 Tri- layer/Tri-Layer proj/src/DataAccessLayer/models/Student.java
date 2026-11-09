package DataAccessLayer.models;

public class Student {
    String name;
    String surname;
    int age;
    public int loanedBooks = 0;

    public void setStudent(String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    void loanBook(Book book){
        loanedBooks++;
    }
    void returnBook(Book book){
        loanedBooks--;
    }
}
