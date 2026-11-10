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
    public void loanBook(Book book){
        loanedBooks++;
    }
    public void returnBook(Book book){
        loanedBooks--;
    }
}
