//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Teacher teach1 = new Teacher("Mrs.Brown", 10);
        Subject subj = new Subject("Java",4,teach1);
        Student st1 = new Student("Maria",16,subj);

        st1.showStudentInfo();
    }
}

