import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {
    //ID Age LASTNAME GPA
        School school= new School();
        Student st1 = new Student(3, 20, "Alex", 3.70);
        Student st2 = new Student(1, 19, "Bob", 3.60);
        Student st3 = new Student(4, 17, "Carol", 3.80);
        Student st4 = new Student(5, 24, "Dave", 3.90);
        Student st5 = new Student(2, 21, "Emily", 3.50);
        Student[] Group1 = {st1, st2, st3, st4, st5};
        for (Student st : Group1)
        {
            school.addStudentToStudentList(st);
            school.addStudentToPersonList(st);
        }
        System.out.println("\n======= Sort by ID =======");
        school.sortStudentList(Comparator.comparing(Student::getID));
        school.sortPersonList(Comparator.comparing(Person::getID));
        System.out.println(school);
        System.out.println("\n===== Sort by Age  =====");
        school.sortStudentList(Comparator.comparing(Student::getAge));
        school.sortPersonList(Comparator.comparing(Person::getAge));
        System.out.println(school);
        System.out.println("\n==== Sort by Lastname ====");
        school.sortStudentList(Comparator.comparing(Student::getLastname));
        school.sortPersonList(Comparator.comparing(Person::getLastname));
        System.out.println(school);
        System.out.println("\n====== Sort by GPA  ======");
        school.sortStudentList(Comparator.comparing(Student::getGPA).reversed());
        school.sortPersonList(Comparator.<Person, Double>comparing(p->((Student)p).getGPA()).reversed());
        System.out.println(school);
    }
}