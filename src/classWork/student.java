package classWork;


public class student {

    private int age;
    private String name;

    public void setName(String value) {
        this.name = value;
    }
    public void setAge(int x) {
        this.age = x;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        student st = new student();
        st.setName("Ivan");
        st.setAge(17);
        System.out.println(st.getName());
        System.out.println(st.getAge());
    };

}
