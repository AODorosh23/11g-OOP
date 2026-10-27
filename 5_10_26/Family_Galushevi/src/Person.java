import  java.util.ArrayList;
public class Person {
    String fName;
    String lName;
    String role;
    String gender;

    Person(String fName, String lName, String role, String gender)
    {
        this.fName = fName;
        this.lName = lName;
        this.role = role;
        this.gender = gender;
    }
    public static void main(String[] args) {


        ArrayList<Person> family = new ArrayList<Person>();
        ArrayList<Person> parents = new ArrayList<Person>();
        ArrayList<Person> kids = new ArrayList<Person>();
        ArrayList<Person> boys = new ArrayList<Person>();
        ArrayList<Person> girls = new ArrayList<Person>();

        family.add(new Person("Sultana", "Galusheva", "Parent", "F"));
        family.add(new Person("Lazar", "Galushev", "Kid", "M"));
        family.add(new Person("Kosta", "Galushev", "Kid", "M"));
        family.add(new Person("Katerina", "Galusheva", "Kid", "F"));
        family.add(new Person("Stoyan", "Galushev", "Parent", "M"));

        for(int i = 0; i < family.size();i++)
        {
            if(family.get(i).gender.equals("M") && family.get(i).role.equals("Kid"))
            {
                boys.add(family.get(i));
            }else
            {
                girls.add(family.get(i));
            }

            if(family.get(i).role.equals("Parent"))
            {
                parents.add(family.get(i));
            }else
            {
                kids.add(family.get(i));
            }
        }
        System.out.println("The Galushevi family consists of : ");
        System.out.println();
        for(int i = 0; i < family.size(); i++) {
            System.out.println(family.get(i).fName +  " " + family.get(i).lName + " " + family.get(i).role + " "+ family.get(i).gender);
        }
        System.out.println();
        System.out.println("The parents of the family are : ");
        System.out.println();
        for(int i = 0; i < parents.size(); i++) {
            System.out.println(parents.get(i).fName +  " " + parents.get(i).lName + " " + parents.get(i).role + " "+ parents.get(i).gender);
        }
        System.out.println();
        System.out.println("And the kids are: ");
        System.out.println();

        for(int i = 0; i < kids.size(); i++) {
            System.out.println(kids.get(i).fName +  " " + kids.get(i).lName + " " + kids.get(i).role + " "+ kids.get(i).gender);
        }
        System.out.println();
        System.out.println("The Parents are: ");
        System.out.println();
        for(int i = 0; i < parents.size(); i++) {
            System.out.println(parents.get(i).fName +  " " + parents.get(i).lName + " " + parents.get(i).role + " "+ parents.get(i).gender);
        }

        System.out.println("The boys are : ");
        System.out.println();
        for(int i = 0; i < boys.size(); i++) {
            System.out.println(boys.get(i).fName +  " " + boys.get(i).lName + " " + boys.get(i).role + " "+ boys.get(i).gender);
        }
        System.out.println("The girls are : ");
        System.out.println();
        for(int i = 0; i < girls.size(); i++) {
            System.out.println(girls.get(i).fName +  " " + girls.get(i).lName + " " + girls.get(i).role + " "+ girls.get(i).gender);
        }
    }
}
