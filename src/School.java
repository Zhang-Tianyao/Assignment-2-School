import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {

    private List<Student> studentRoster = new ArrayList<>();
    private List<Person> personRoster = new ArrayList<>();

    public void addStudentToStudentList(Student s) {
        studentRoster.add(s);
    }

    public void addStudentToPersonList(Student s) {
        personRoster.add(s);
    }

    public void sortStudentList(Comparator<Student> comp) {
        studentRoster.sort(comp);
    }

    public void sortPersonList(Comparator<Person> comp) {
        personRoster.sort(comp);
    }

    @Override
    public String toString() {
        StringBuilder school = new StringBuilder("\n===== Student Roster =====\n");
        studentRoster.forEach(s -> school.append(s).append("\n"));

        school.append("\n===== Person Roster =====\n");
        personRoster.forEach(p -> school.append(p).append("\n"));

        return school.toString();
    }
}
