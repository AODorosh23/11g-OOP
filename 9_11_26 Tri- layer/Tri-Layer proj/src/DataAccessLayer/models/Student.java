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
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public void loanBook(Book book){
        loanedBooks++;
    }
    public void returnBook(Book book){
        loanedBooks--;
    }
}
