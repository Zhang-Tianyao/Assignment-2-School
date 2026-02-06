public class Student extends Person {
    private double GPA;
    public Student (int id, int age, String lastname, double gpa) {
        super(id,age,lastname);
        this.GPA = gpa;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        return String.format("Person{id=%d, age=%d, name=%s, gpa=%.2f}", ID, Age, Lastname, GPA);
    }
}
